package com.fyber.fairbid.adtransparency.interceptors.applovin;

import android.util.Log;
import com.applovin.sdk.AppLovinAdType;
import com.fyber.fairbid.adtransparency.common.MissingMetadataException;
import com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor;
import com.fyber.fairbid.adtransparency.interceptors.MetadataReport;
import com.fyber.fairbid.adtransparency.interceptors.MetadataStore;
import com.fyber.fairbid.cj;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.Network;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class AppLovinInterceptor extends AbstractInterceptor {
    @NotNull
    public static final String TAG = "AppLovinInterceptor";
    @NotNull
    public static final AppLovinInterceptor INSTANCE = new AppLovinInterceptor();
    @NotNull
    public static final String a = Network.APPLOVIN.getCanonicalName();
    @NotNull
    public static final LinkedHashMap b = new LinkedHashMap();
    @NotNull
    public static final LinkedHashMap c = new LinkedHashMap();
    @NotNull
    public static final LinkedHashMap d = new LinkedHashMap();

    @Override // com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor
    public final void getMetadataForInstanceInternal(@NotNull Constants.AdType adType, @NotNull String instanceId, @NotNull MetadataStore.MetadataCallback callback) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = (String) d.get(instanceId);
        if (str == null) {
            Intrinsics.checkNotNullParameter("Unable to find the adId for given instanceId", "msg");
            if (cj.a) {
                Log.e("Snoopy", "Unable to find the adId for given instanceId");
                return;
            }
            return;
        }
        JQ jq = new JQ(adType, str);
        LinkedHashMap linkedHashMap = c;
        linkedHashMap.put(jq, callback);
        LinkedHashMap linkedHashMap2 = b;
        if (linkedHashMap2.containsKey(jq)) {
            String str2 = (String) linkedHashMap2.get(jq);
            if (str2 != null && str2.length() != 0) {
                callback.onSuccess(new MetadataReport(null, str2));
            } else {
                String s = "Metadata is empty for the key " + jq + ". Waiting for the callback.";
                Intrinsics.checkNotNullParameter(s, "s");
                if (cj.a) {
                    Log.i("Snoopy", s);
                }
            }
            linkedHashMap.remove(jq);
            return;
        }
        String s2 = "There is no metadata for the key " + jq + ". Waiting for the callback.";
        Intrinsics.checkNotNullParameter(s2, "s");
        if (cj.a) {
            Log.i("Snoopy", s2);
        }
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor
    @NotNull
    public String getNetwork() {
        return a;
    }

    public final void processAd(@NotNull JSONObject adJson) {
        JSONArray optJSONArray;
        boolean a2;
        Constants.AdType adType;
        Intrinsics.checkNotNullParameter(adJson, "adJson");
        Logger.warn("AppLovinInterceptor - received a JSONObject with an ad!");
        String optString = adJson.optString("zone_id");
        if (optString == null || (optJSONArray = adJson.optJSONArray("ads")) == null) {
            return;
        }
        String optString2 = adJson.optString("ad_type");
        Intrinsics.checkNotNullExpressionValue(optString2, "adJson.optString(\"ad_type\")");
        AppLovinAdType fromString = AppLovinAdType.fromString(optString2);
        if (Intrinsics.a(fromString, AppLovinAdType.AUTO_INCENTIVIZED)) {
            a2 = true;
        } else {
            a2 = Intrinsics.a(fromString, AppLovinAdType.INCENTIVIZED);
        }
        if (a2) {
            adType = Constants.AdType.REWARDED;
        } else if (Intrinsics.a(fromString, AppLovinAdType.REGULAR)) {
            adType = Constants.AdType.INTERSTITIAL;
        } else {
            adType = Constants.AdType.UNKNOWN;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = optJSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "ads.getJSONObject(i)");
            String adId = jSONObject.getString("ad_id");
            LinkedHashMap linkedHashMap = d;
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            linkedHashMap.put(optString, adId);
            storeMetadataForInstance(adType, adId, jSONObject.toString());
        }
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.MetadataStore
    public void storeMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String adId, String str) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adId, "adId");
        JQ jq = new JQ(adType, adId);
        if (str != null && str.length() != 0) {
            String s = "AppLovinInterceptor - Storing metadata for key [" + jq + ']';
            Intrinsics.checkNotNullParameter(s, "s");
            if (cj.a) {
                Log.v("Snoopy", s);
            }
            b.put(jq, str);
            LinkedHashMap linkedHashMap = c;
            MetadataStore.MetadataCallback metadataCallback = (MetadataStore.MetadataCallback) linkedHashMap.get(jq);
            if (metadataCallback != null) {
                metadataCallback.onSuccess(new MetadataReport(null, str));
                MetadataStore.MetadataCallback metadataCallback2 = (MetadataStore.MetadataCallback) linkedHashMap.remove(jq);
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap2 = c;
        MetadataStore.MetadataCallback metadataCallback3 = (MetadataStore.MetadataCallback) linkedHashMap2.get(jq);
        if (metadataCallback3 != null) {
            metadataCallback3.onError(MissingMetadataException.Companion.getAdNotInterceptedException());
            MetadataStore.MetadataCallback metadataCallback4 = (MetadataStore.MetadataCallback) linkedHashMap2.remove(jq);
        }
    }
}
