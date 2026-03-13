package com.fyber.fairbid;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k8 extends AbstractC1114o0 {
    public static final /* synthetic */ int d = 0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements Function1 {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            boolean z;
            if (((Number) obj).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public k8(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject != null) {
            put$fairbid_sdk_release("display_timeout", jSONObject.opt("display_timeout"));
            put$fairbid_sdk_release("close_timeout", bc.a(jSONObject, a.a));
            put$fairbid_sdk_release("fill_cooldown_time", jSONObject.opt("fill_cooldown_time"));
            put$fairbid_sdk_release("fallback_threshold_on_request", bc.b(jSONObject));
        }
    }
}
