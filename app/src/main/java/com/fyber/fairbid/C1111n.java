package com.fyber.fairbid;

import com.fyber.fairbid.C1109m;
import com.fyber.fairbid.internal.Constants;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fyber.fairbid.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111n extends n5 {
    @NotNull
    public final C1109m c;
    @NotNull
    public final C1109m d;
    @NotNull
    public final C1109m e;

    /* renamed from: com.fyber.fairbid.n$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static C1111n a(JSONObject jSONObject, C1111n c1111n) {
            try {
                return new C1111n(jSONObject, c1111n);
            } catch (JSONException unused) {
                return new C1111n(null, null);
            }
        }
    }

    /* renamed from: com.fyber.fairbid.n$b */
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

    public /* synthetic */ C1111n() {
        throw null;
    }

    public C1111n(JSONObject jSONObject, C1111n c1111n) {
        if (c1111n != null) {
            setDefaultValueProvider(c1111n);
        }
        if (jSONObject != null) {
            if (jSONObject.has("interstitial")) {
                put$fairbid_sdk_release("interstitial", jSONObject.getJSONObject("interstitial"));
            }
            if (jSONObject.has("rewarded")) {
                put$fairbid_sdk_release("rewarded", jSONObject.getJSONObject("rewarded"));
            }
            if (jSONObject.has("banner")) {
                put$fairbid_sdk_release("banner", jSONObject.getJSONObject("banner"));
            }
        }
        this.c = C1109m.a.a((JSONObject) get$fairbid_sdk_release("interstitial"), c1111n != null ? c1111n.c : null);
        this.d = C1109m.a.a((JSONObject) get$fairbid_sdk_release("rewarded"), c1111n != null ? c1111n.d : null);
        this.e = C1109m.a.a((JSONObject) get$fairbid_sdk_release("banner"), c1111n != null ? c1111n.e : null);
    }
}
