package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.sdk.session.UserSessionManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class u5 {
    @NotNull
    public final Context a;
    @NotNull
    public final s1 b;
    @NotNull
    public final Utils.ClockHelper c;
    @NotNull
    public final com.fyber.fairbid.internal.c d;
    @NotNull
    public final com.fyber.fairbid.internal.d e;
    @NotNull
    public final UserSessionManager f;

    public u5(@NotNull Context context, @NotNull s1 dataHolder, @NotNull Utils.ClockHelper clockHelper, @NotNull com.fyber.fairbid.internal.c fairBidTrackingIDsUtils, @NotNull com.fyber.fairbid.internal.d offerWallTrackingIDsUtils, @NotNull UserSessionManager userSessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataHolder, "dataHolder");
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        Intrinsics.checkNotNullParameter(fairBidTrackingIDsUtils, "fairBidTrackingIDsUtils");
        Intrinsics.checkNotNullParameter(offerWallTrackingIDsUtils, "offerWallTrackingIDsUtils");
        Intrinsics.checkNotNullParameter(userSessionManager, "userSessionManager");
        this.a = context;
        this.b = dataHolder;
        this.c = clockHelper;
        this.d = fairBidTrackingIDsUtils;
        this.e = offerWallTrackingIDsUtils;
        this.f = userSessionManager;
    }
}
