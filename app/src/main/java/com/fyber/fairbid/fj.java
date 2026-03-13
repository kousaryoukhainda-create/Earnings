package com.fyber.fairbid;

import com.fyber.fairbid.C1111n;
import com.fyber.fairbid.dj;
import com.fyber.fairbid.gf;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fj extends n5 {
    @NotNull
    public final C1111n c;
    @NotNull
    public final gf d;
    public final int e;
    @NotNull
    public final dj f;
    @NotNull
    public final dj g;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static fj a(JSONObject jSONObject) {
            return new fj(jSONObject);
        }
    }

    public fj(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("ad_formats", jSONObject.optJSONObject("ad_formats"));
            put$fairbid_sdk_release("networks", jSONObject.optJSONObject("networks"));
            put$fairbid_sdk_release("quality", Integer.valueOf(jSONObject.optInt("quality", 100)));
            put$fairbid_sdk_release("impression_format", jSONObject.optString("impression_format"));
            put$fairbid_sdk_release("click_format", jSONObject.optString("click_format"));
        }
        C1111n a2 = C1111n.a.a((JSONObject) get$fairbid_sdk_release("ad_formats"), null);
        this.c = a2;
        this.d = gf.a.a((JSONObject) get$fairbid_sdk_release("networks"), a2);
        this.e = ((Number) get$fairbid_sdk_release("quality", 100)).intValue();
        dj.c.getClass();
        dj a3 = dj.a.a((String) get$fairbid_sdk_release("impression_format", "jpg"));
        this.f = a3 == null ? dj.JPEG : a3;
        dj a4 = dj.a.a((String) get$fairbid_sdk_release("click_format", "jpg"));
        this.g = a4 == null ? dj.JPEG : a4;
    }

    @NotNull
    public final C1109m a(@NotNull Network network, @NotNull Constants.AdType adType) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(adType, "adType");
        gf gfVar = this.d;
        String networkName = network.getCanonicalName();
        gfVar.getClass();
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        C1111n c1111n = (C1111n) gfVar.get$fairbid_sdk_release(networkName, gfVar.c);
        c1111n.getClass();
        Intrinsics.checkNotNullParameter(adType, "adType");
        int i = C1111n.b.a[adType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c1111n.e;
                }
                throw new IllegalArgumentException("The ad type should be concrete here.");
            }
            return c1111n.d;
        }
        return c1111n.c;
    }
}
