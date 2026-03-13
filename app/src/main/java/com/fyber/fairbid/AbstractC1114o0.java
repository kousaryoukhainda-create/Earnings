package com.fyber.fairbid;

import com.fyber.fairbid.internal.Utils;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* renamed from: com.fyber.fairbid.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1114o0 extends n5 {
    @NotNull
    public static final s6<Long> c = new Object();

    public AbstractC1114o0(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("tta", jSONObject.opt("tta"));
            put$fairbid_sdk_release("tmn_timeout", jSONObject.opt("tmn_timeout"));
            put$fairbid_sdk_release("auction_request_timeout", jSONObject.opt("auction_request_timeout"));
            put$fairbid_sdk_release("pmn_timeout", jSONObject.opt("pmn_timeout"));
            put$fairbid_sdk_release("instance_no_fill_backoff", Utils.getIntArrayFromJSONArray(jSONObject.optJSONArray("instance_no_fill_backoff")));
            put$fairbid_sdk_release("instance_no_response_cache", jSONObject.opt("instance_no_response_cache"));
            put$fairbid_sdk_release("instance_fill_cache", jSONObject.opt("instance_fill_cache"));
            put$fairbid_sdk_release("disable_marketplace", Boolean.valueOf(jSONObject.optBoolean("disable_marketplace", false)));
            long[] longArrayFromJSONArray = Utils.getLongArrayFromJSONArray(jSONObject.optJSONArray("auto_request_backoff"), c);
            if (longArrayFromJSONArray != null) {
                if (!(longArrayFromJSONArray.length == 0)) {
                    put$fairbid_sdk_release("auto_request_backoff", longArrayFromJSONArray);
                }
            }
            put$fairbid_sdk_release("exchange_load_timeout", jSONObject.opt("exchange_load_timeout"));
            put$fairbid_sdk_release("fallback_mode_on_request", p7.a(jSONObject.optString("fallback_mode_on_request")));
            put$fairbid_sdk_release("fallback_mode_on_show", p7.b(jSONObject.optString("fallback_mode_on_show")));
            put$fairbid_sdk_release("exchange_fallback", bc.a(jSONObject));
        }
    }

    public static final boolean a(long j) {
        return j >= 0;
    }
}
