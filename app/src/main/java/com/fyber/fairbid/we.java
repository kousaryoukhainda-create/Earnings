package com.fyber.fairbid;

import com.fyber.fairbid.C1112n0;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.n5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class we extends n5 {
    @NotNull
    public final C1112n0 c;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static we a(JSONObject jSONObject) {
            we weVar = new we();
            String name = Constants.AdType.INTERSTITIAL.name();
            C1112n0 c1112n0 = C1112n0.c;
            weVar.put$fairbid_sdk_release(name, C1112n0.a.a(jSONObject.optJSONObject("interstitial")));
            weVar.put$fairbid_sdk_release(Constants.AdType.REWARDED.name(), C1112n0.a.a(jSONObject.optJSONObject("rewarded")));
            weVar.put$fairbid_sdk_release(Constants.AdType.BANNER.name(), C1112n0.a.a(jSONObject.optJSONObject("banner")));
            if (jSONObject.has("start_timeout")) {
                weVar.put$fairbid_sdk_release("start_timeout", Long.valueOf(jSONObject.optLong("start_timeout")));
            }
            return weVar;
        }
    }

    public we() {
        C1112n0 c1112n0 = C1112n0.c;
        this.c = C1112n0.a.a(new JSONObject());
    }

    public final void a(@NotNull aj sdkConfigurations) throws n5.a {
        Intrinsics.checkNotNullParameter(sdkConfigurations, "sdkConfigurations");
        setDefaultValueProvider(sdkConfigurations);
        Constants.AdType adType = Constants.AdType.INTERSTITIAL;
        Intrinsics.checkNotNullParameter(adType, "adType");
        ((C1112n0) get$fairbid_sdk_release(adType.name(), this.c)).setDefaultValueProvider(sdkConfigurations.b());
        Constants.AdType adType2 = Constants.AdType.REWARDED;
        Intrinsics.checkNotNullParameter(adType2, "adType");
        ((C1112n0) get$fairbid_sdk_release(adType2.name(), this.c)).setDefaultValueProvider(sdkConfigurations.c());
        Constants.AdType adType3 = Constants.AdType.BANNER;
        Intrinsics.checkNotNullParameter(adType3, "adType");
        ((C1112n0) get$fairbid_sdk_release(adType3.name(), this.c)).setDefaultValueProvider(sdkConfigurations.a());
    }
}
