package com.fyber.fairbid.adtransparency.interceptors.chartboost;

import android.util.Log;
import com.chartboost.sdk.impl.o0;
import com.chartboost.sdk.impl.q;
import com.fyber.fairbid.adtransparency.common.MissingMetadataException;
import com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor;
import com.fyber.fairbid.adtransparency.interceptors.MetadataReport;
import com.fyber.fairbid.adtransparency.interceptors.MetadataStore;
import com.fyber.fairbid.cj;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.y4;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class ChartboostInterceptor extends AbstractInterceptor {
    @NotNull
    public static final ChartboostInterceptor INSTANCE = new ChartboostInterceptor();
    @NotNull
    public static final String a = Network.CHARTBOOST.getCanonicalName();
    @NotNull
    public static final LinkedHashMap b = new LinkedHashMap();
    @NotNull
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor
    public final void getMetadataForInstanceInternal(@NotNull Constants.AdType adType, @NotNull String instanceId, @NotNull MetadataStore.MetadataCallback callback) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JQ jq = new JQ(adType, instanceId);
        LinkedHashMap linkedHashMap = c;
        linkedHashMap.put(jq, callback);
        LinkedHashMap linkedHashMap2 = b;
        if (linkedHashMap2.containsKey(jq)) {
            String str = (String) linkedHashMap2.get(jq);
            if (str != null && str.length() != 0) {
                callback.onSuccess(new MetadataReport(null, str));
            } else {
                String s = "ChartboostInterceptor - Metadata is empty for the key " + jq + ". Waiting for the callback.";
                Intrinsics.checkNotNullParameter(s, "s");
                if (cj.a) {
                    Log.i("Snoopy", s);
                }
            }
            linkedHashMap.remove(jq);
            return;
        }
        String s2 = "ChartboostInterceptor - There is no metadata for the key " + jq + ". Waiting for the callback.";
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

    public final void processLoadParamsOnShow(@NotNull Constants.AdType adType, @NotNull o0 appRequest) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter("ChartboostInterceptor - got LoadParams to process", "s");
        if (cj.a) {
            Log.d("Snoopy", "ChartboostInterceptor - got LoadParams to process");
        }
        String d = appRequest.d();
        Intrinsics.checkNotNullExpressionValue(d, "extractLocation(appRequest)");
        q a2 = appRequest.a();
        y4 y4Var = new y4(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f, a2.g, a2.h, a2.i, a2.j, a2.k, a2.l, a2.m, a2.n, a2.o, a2.p, a2.q, a2.r, a2.s, a2.t, a2.u);
        Intrinsics.checkNotNullExpressionValue(y4Var, "transformAdUnit(cbAdUnit)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("creative", y4Var.e);
        jSONObject.put("assets", y4Var.g);
        jSONObject.put("impressionID", y4Var.c);
        jSONObject.put("adId", y4Var.b);
        jSONObject.put("link", y4Var.j);
        jSONObject.put("rewardCurrency", y4Var.n);
        jSONObject.put("to", y4Var.l);
        jSONObject.put(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS, y4Var.r);
        jSONObject.put("rewardAmount", y4Var.m);
        jSONObject.put("cgn", y4Var.d);
        jSONObject.put("videoUrl", y4Var.h);
        storeMetadataForInstance(adType, d, jSONObject.toString());
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.MetadataStore
    public void storeMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String instanceId, String str) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        JQ jq = new JQ(adType, instanceId);
        if (str != null && str.length() != 0) {
            String s = "ChartboostInterceptor - Storing metadata for key [" + jq + ']';
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
