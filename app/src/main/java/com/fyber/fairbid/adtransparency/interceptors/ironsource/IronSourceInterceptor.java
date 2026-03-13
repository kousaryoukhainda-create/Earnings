package com.fyber.fairbid.adtransparency.interceptors.ironsource;

import android.util.Log;
import android.webkit.WebView;
import com.fyber.fairbid.adtransparency.common.MissingMetadataException;
import com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor;
import com.fyber.fairbid.adtransparency.interceptors.MetadataReport;
import com.fyber.fairbid.adtransparency.interceptors.MetadataStore;
import com.fyber.fairbid.cj;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.sj;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class IronSourceInterceptor extends AbstractInterceptor {
    @NotNull
    public static final IronSourceInterceptor INSTANCE = new IronSourceInterceptor();
    @NotNull
    public static final String a = Network.IRONSOURCE.getCanonicalName();
    @NotNull
    public static final LinkedHashMap b = new LinkedHashMap();
    @NotNull
    public static final LinkedHashMap c = new LinkedHashMap();

    public static final void a(WebView webView, String adType, int i) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(adType, "$adType");
        Logger.debug("Reading metadata");
        webView.loadUrl("javascript:FairBidBridge.getContent('IronSource', '" + adType + "', '" + i + "', JSON.stringify(SSA_CORE.SDKController.getCurrentDisplayedAd()));");
    }

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
            if (str == null) {
                String s = "No metadata found for the key " + jq + ". Waiting for the callback…";
                Intrinsics.checkNotNullParameter(s, "s");
                if (cj.a) {
                    Log.i("Snoopy", s);
                    return;
                }
                return;
            }
            callback.onSuccess(new MetadataReport(str, null));
            linkedHashMap2.remove(jq);
            linkedHashMap.remove(jq);
        }
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.AbstractInterceptor
    @NotNull
    public String getNetwork() {
        return a;
    }

    public final void injectJavascript(@NotNull String clazz, @NotNull String methodName, @NotNull String script) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(script, "script");
        String s = "IronSourceInterceptor - Javascript injected to webview - Invoked " + clazz + '.' + methodName + "()\nScript\n" + script;
        Intrinsics.checkNotNullParameter(s, "s");
        if (cj.a) {
            Log.v("Snoopy", s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[Catch: JSONException -> 0x0079, TryCatch #0 {JSONException -> 0x0079, blocks: (B:3:0x002a, B:7:0x0057, B:9:0x005f, B:11:0x0065, B:13:0x006e, B:19:0x0080, B:20:0x0084, B:22:0x008a, B:26:0x009b, B:31:0x00a6, B:33:0x00ae, B:35:0x00b4, B:37:0x00ba, B:42:0x00fd, B:47:0x010d, B:43:0x0103, B:45:0x0107, B:46:0x010a, B:48:0x0131, B:51:0x0149, B:6:0x0054), top: B:62:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void javascriptInterface(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull android.webkit.WebView r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.adtransparency.interceptors.ironsource.IronSourceInterceptor.javascriptInterface(java.lang.String, java.lang.String, java.lang.String, android.webkit.WebView):void");
    }

    public final void javascriptMessage(@NotNull String clazz, @NotNull String methodName, @NotNull String functionName, @NotNull String params) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            JSONObject jSONObject = new JSONObject(params);
            String s = "IronSourceInterceptor - Javascript message - Invoked " + clazz + '.' + methodName + "() - function name " + functionName + "\nParams\n" + jSONObject.toString(2);
            Intrinsics.checkNotNullParameter(s, "s");
            if (cj.a) {
                Log.v("Snoopy", s);
            }
        } catch (JSONException e) {
            Intrinsics.checkNotNullParameter("IronSourceInterceptor - Javascript message - Unable to parse JSON", "msg");
            if (cj.a) {
                Log.e("Snoopy", "IronSourceInterceptor - Javascript message - Unable to parse JSON", e);
            }
            String s2 = "IronSourceInterceptor - Javascript message - Invoked " + clazz + '.' + methodName + "() - function name " + functionName + "\nParams\n" + params;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (cj.a) {
                Log.v("Snoopy", s2);
            }
        }
    }

    public final void onPageFinished(@NotNull String clazz, @NotNull String methodName, @NotNull WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        String s = "IronSourceInterceptor Invoked " + clazz + '.' + methodName + "() with webview " + webView + " and url " + url + '}';
        Intrinsics.checkNotNullParameter(s, "s");
        if (cj.a) {
            Log.v("Snoopy", s);
        }
        webView.loadUrl("javascript:FairBidBridge.processHTML(document.documentElement.outerHTML);");
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.MetadataStore
    public void storeMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String instanceId, String str) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        if (!sj.a.getMetadata().forNetworkAndFormat(Network.IRONSOURCE, adType)) {
            return;
        }
        JQ jq = new JQ(adType, instanceId);
        if (str != null && str.length() > 0) {
            String s = "IronSourceInterceptor - Storing metadata for instance [" + adType + " - " + instanceId + ']';
            Intrinsics.checkNotNullParameter(s, "s");
            if (cj.a) {
                Log.v("Snoopy", s);
            }
            LinkedHashMap linkedHashMap = b;
            linkedHashMap.put(jq, str);
            LinkedHashMap linkedHashMap2 = c;
            if (linkedHashMap2.containsKey(jq)) {
                MetadataStore.MetadataCallback metadataCallback = (MetadataStore.MetadataCallback) linkedHashMap2.get(jq);
                if (metadataCallback != null) {
                    metadataCallback.onSuccess(new MetadataReport(str, null));
                }
                linkedHashMap.remove(jq);
                linkedHashMap2.remove(jq);
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap3 = c;
        if (linkedHashMap3.containsKey(jq)) {
            MetadataStore.MetadataCallback metadataCallback2 = (MetadataStore.MetadataCallback) linkedHashMap3.get(jq);
            if (metadataCallback2 != null) {
                metadataCallback2.onError(MissingMetadataException.Companion.getAdNotInterceptedException());
            }
            b.remove(jq);
            linkedHashMap3.remove(jq);
        }
        String s2 = "IronSourceInterceptor - There was no content retrieved for the instance [" + adType + " - " + instanceId + ']';
        Intrinsics.checkNotNullParameter(s2, "s");
        if (cj.a) {
            Log.d("Snoopy", s2);
        }
    }
}
