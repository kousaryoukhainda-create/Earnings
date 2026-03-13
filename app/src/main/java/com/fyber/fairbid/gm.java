package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.internal.Constants;
import com.huawei.hms.common.internal.RequestManager;
import com.vungle.ads.VungleError;
import java.util.EnumSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class gm {
    public static final EnumSet<Constants.AdType> a = EnumSet.of(Constants.AdType.INTERSTITIAL, Constants.AdType.REWARDED, Constants.AdType.BANNER);
    @NotNull
    public static final List<String> b = C0346Ie.c("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    @NotNull
    public static final List<String> c = C0320He.a("com.vungle.ads.internal.ui.VungleActivity");

    @NotNull
    public static final RequestFailure a(@NotNull VungleError vungleError) {
        Intrinsics.checkNotNullParameter(vungleError, "<this>");
        switch (vungleError.getCode()) {
            case 0:
                return RequestFailure.UNKNOWN;
            case 6:
            case 10009:
                return RequestFailure.ADAPTER_NOT_STARTED;
            case 101:
            case 304:
            case 500:
            case 10003:
            case 10008:
            case 10010:
            case 10015:
            case 10019:
            case 10031:
            case 10032:
                return RequestFailure.INTERNAL;
            case 135:
            case 201:
            case RequestManager.NOTIFY_CONNECT_SUSPENDED /* 10013 */:
            case 10028:
            case 10034:
                return RequestFailure.CONFIGURATION_ERROR;
            case 10001:
                return RequestFailure.NO_FILL;
            case RequestManager.NOTIFY_CONNECT_SUCCESS /* 10011 */:
            case 10014:
            case 10020:
            case 10024:
            case 10033:
                return RequestFailure.NETWORK_ERROR;
            default:
                return RequestFailure.NO_FILL;
        }
    }
}
