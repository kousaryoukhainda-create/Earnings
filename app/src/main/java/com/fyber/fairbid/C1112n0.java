package com.fyber.fairbid;

import com.fyber.fairbid.internal.Utils;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* renamed from: com.fyber.fairbid.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112n0 extends n5 {
    @NotNull
    public static final C1112n0 c = new C1112n0();

    /* renamed from: com.fyber.fairbid.n0$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static C1112n0 a(JSONObject jSONObject) {
            C1112n0 c1112n0 = new C1112n0();
            if (jSONObject != null) {
                c1112n0.put$fairbid_sdk_release("tmn_timeout", jSONObject.opt("tmn_timeout"));
                c1112n0.put$fairbid_sdk_release("pmn_timeout", jSONObject.opt("pmn_timeout"));
                c1112n0.put$fairbid_sdk_release("instance_no_fill_backoff", Utils.getIntArrayFromJSONArray(jSONObject.optJSONArray("instance_no_fill_backoff")));
                c1112n0.put$fairbid_sdk_release("instance_no_response_cache", jSONObject.opt("instance_no_response_cache"));
                c1112n0.put$fairbid_sdk_release("instance_fill_cache", jSONObject.opt("instance_fill_cache"));
                c1112n0.put$fairbid_sdk_release("is_hybrid_setup", Boolean.valueOf(jSONObject.optBoolean("is_hybrid_setup")));
            }
            return c1112n0;
        }
    }
}
