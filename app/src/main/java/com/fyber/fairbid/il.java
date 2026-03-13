package com.fyber.fairbid;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class il extends n5 {
    public il(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("max_num_sessions", jSONObject.opt("max_num_sessions"));
            put$fairbid_sdk_release("background_timeout", jSONObject.opt("background_timeout"));
        }
    }
}
