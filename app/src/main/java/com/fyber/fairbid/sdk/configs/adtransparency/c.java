package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.n5;
import com.fyber.fairbid.sdk.configs.adtransparency.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends n5 {
    public final boolean c;
    @NotNull
    public final d d;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static c a(JSONObject jSONObject) {
            return new c(jSONObject);
        }
    }

    public c(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("enabled", Boolean.valueOf(jSONObject.optBoolean("enabled", false)));
            put$fairbid_sdk_release("webview_interceptor", jSONObject.optJSONObject("webview_interceptor"));
        }
        this.c = ((Boolean) get$fairbid_sdk_release("enabled", Boolean.FALSE)).booleanValue();
        this.d = d.a.a((JSONObject) get$fairbid_sdk_release("webview_interceptor"));
    }
}
