package com.fyber.fairbid;

import com.fyber.fairbid.adtransparency.interceptors.MetadataReport;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cc implements u6 {
    @NotNull
    public final MetadataReport a;

    public cc(@NotNull MetadataReport metadataReport) {
        Intrinsics.checkNotNullParameter(metadataReport, "metadataReport");
        this.a = metadataReport;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, JSONObject> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String webviewInterceptorContent = this.a.getWebviewInterceptorContent();
        if (webviewInterceptorContent != null) {
            linkedHashMap.put("webview_interceptor", new JSONObject(webviewInterceptorContent));
        }
        String loadInterceptorContent = this.a.getLoadInterceptorContent();
        if (loadInterceptorContent != null) {
            linkedHashMap.put("load_interceptor", new JSONObject(loadInterceptorContent));
        }
        return linkedHashMap;
    }
}
