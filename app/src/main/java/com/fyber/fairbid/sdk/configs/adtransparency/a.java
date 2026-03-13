package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.n5;
import com.fyber.fairbid.sdk.configs.adtransparency.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends n5 {
    @NotNull
    public final c c;
    @NotNull
    public final c d;
    @NotNull
    public final c e;

    /* renamed from: com.fyber.fairbid.sdk.configs.adtransparency.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0054a {
        @NotNull
        public static a a(JSONObject jSONObject) {
            return new a(jSONObject);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Constants.AdType.values().length];
            try {
                iArr[Constants.AdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Constants.AdType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Constants.AdType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("interstitial", jSONObject.optJSONObject("interstitial"));
            put$fairbid_sdk_release("rewarded", jSONObject.optJSONObject("rewarded"));
            put$fairbid_sdk_release("banner", jSONObject.optJSONObject("banner"));
        }
        this.c = c.a.a((JSONObject) get$fairbid_sdk_release("interstitial"));
        this.d = c.a.a((JSONObject) get$fairbid_sdk_release("rewarded"));
        this.e = c.a.a((JSONObject) get$fairbid_sdk_release("banner"));
    }
}
