package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.n5;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends n5 {
    public final long c;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static d a(JSONObject jSONObject) {
            return new d(jSONObject);
        }
    }

    public d(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("delay", Long.valueOf(jSONObject.optLong("delay", 2000L)));
        }
        this.c = ((Number) get$fairbid_sdk_release("delay", 2000L)).longValue();
    }
}
