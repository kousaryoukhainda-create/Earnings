package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class t1 implements s1 {
    @NotNull
    public final com.fyber.fairbid.internal.c a;
    @NotNull
    public final com.fyber.fairbid.internal.d b;
    public long c;
    @NotNull
    public final InterfaceC2059lG d;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements InterfaceC0263Ez {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            boolean z;
            if (!ja.a("com.ironsource.adqualitysdk.sdk.BuildConfig", "classExists(\"com.ironsou…litysdk.sdk.BuildConfig\")") && !ja.a("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality", "classExists(\"com.ironsou…sdk.IronSourceAdQuality\")") && !ja.a("com.soomla.traceback.BuildConfig", "classExists(\"com.soomla.traceback.BuildConfig\")") && !ja.a("com.soomla.traceback.SoomlaTraceback", "classExists(\"com.soomla.…aceback.SoomlaTraceback\")")) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public t1(@NotNull com.fyber.fairbid.internal.c fairBidTrackingIDsUtils, @NotNull com.fyber.fairbid.internal.d offerWallTrackingIdUtils) {
        Intrinsics.checkNotNullParameter(fairBidTrackingIDsUtils, "fairBidTrackingIDsUtils");
        Intrinsics.checkNotNullParameter(offerWallTrackingIdUtils, "offerWallTrackingIdUtils");
        this.a = fairBidTrackingIDsUtils;
        this.b = offerWallTrackingIdUtils;
        this.c = -1L;
        this.d = C2231nG.a(a.a);
    }

    @Override // com.fyber.fairbid.s1
    public final void a(long j) {
        this.c = j;
    }

    @Override // com.fyber.fairbid.s1
    public final boolean b() {
        return ((Boolean) ((C2474q50) this.d).a()).booleanValue();
    }

    @Override // com.fyber.fairbid.s1
    public final long c() {
        return this.b.c;
    }

    @Override // com.fyber.fairbid.s1
    public final long a() {
        long j = this.c;
        return j > 0 ? j : this.a.c;
    }
}
