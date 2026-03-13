package com.fyber.fairbid.common.lifecycle;

import com.fyber.fairbid.ads.banner.internal.InternalBannerOptions;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.internal.utils.ScreenUtils;
import com.fyber.fairbid.oc;
import com.fyber.fairbid.sdk.ads.PMNAd;
import com.fyber.fairbid.sdk.placements.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class FetchOptions {
    @NotNull
    public static final b Companion = new b();
    @NotNull
    public final Constants.AdType a;
    @NotNull
    public final Placement b;
    public final String c;
    @NotNull
    public final String d;
    public final boolean e;
    public final PMNAd f;
    public final InternalBannerOptions g;
    public final oc h;
    @NotNull
    public final ScreenUtils i;
    public final String j;
    public final String k;
    public final boolean l;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public final String a;
        @NotNull
        public final Constants.AdType b;
        @NotNull
        public final ScreenUtils c;
        @NotNull
        public Placement d;
        @NotNull
        public String e;
        public PMNAd f;
        public boolean g;
        public oc h;
        public InternalBannerOptions i;
        public String j;
        public String k;
        public boolean l;

        public a(@NotNull String networkName, @NotNull Constants.AdType adType, @NotNull ScreenUtils screenUtils) {
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(screenUtils, "screenUtils");
            this.a = networkName;
            this.b = adType;
            this.c = screenUtils;
            this.d = Placement.DUMMY_PLACEMENT;
            this.e = "";
        }

        public final String a() {
            return this.j;
        }

        @NotNull
        public final Constants.AdType b() {
            return this.b;
        }

        public final oc c() {
            return this.h;
        }

        public final InternalBannerOptions d() {
            return this.i;
        }

        public final String e() {
            return this.k;
        }

        @NotNull
        public final String f() {
            return this.e;
        }

        @NotNull
        public final String g() {
            return this.a;
        }

        @NotNull
        public final Placement h() {
            return this.d;
        }

        public final PMNAd i() {
            return this.f;
        }

        @NotNull
        public final ScreenUtils j() {
            return this.c;
        }

        public final boolean k() {
            return this.g;
        }

        public final boolean l() {
            return this.l;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PMNAd.b.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ FetchOptions(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !FetchOptions.class.equals(obj.getClass())) {
            return false;
        }
        FetchOptions fetchOptions = (FetchOptions) obj;
        if (this.a != fetchOptions.a || this.b.getId() != fetchOptions.b.getId()) {
            return false;
        }
        String str = this.c;
        if (str == null ? fetchOptions.c != null : !str.equals(fetchOptions.c)) {
            return false;
        }
        return Intrinsics.a(this.d, fetchOptions.d);
    }

    public final String getAdRequestId() {
        return this.j;
    }

    @NotNull
    public final Constants.AdType getAdType() {
        return this.a;
    }

    public final InternalBannerOptions getInternalBannerOptions() {
        return this.g;
    }

    public final oc getMarketplaceAuctionResponse() {
        return this.h;
    }

    public final String getMediationSessionId() {
        return this.k;
    }

    @NotNull
    public final String getNetworkInstanceId() {
        return this.d;
    }

    public final String getNetworkName() {
        return this.c;
    }

    @NotNull
    public final Placement getPlacement() {
        return this.b;
    }

    public final PMNAd getPmnAd() {
        return this.f;
    }

    public int hashCode() {
        int i;
        int id = (this.b.getId() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + ((id + i) * 31);
    }

    public final boolean isHybridSetup() {
        return this.l;
    }

    public final boolean isPmnLoad() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean isTablet() {
        PMNAd.b bVar;
        int i;
        PMNAd pMNAd = this.f;
        if (pMNAd != null) {
            bVar = pMNAd.getFormFactor();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i = -1;
        } else {
            i = c.a[bVar.ordinal()];
        }
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return this.i.isTablet();
        }
        return false;
    }

    public final boolean shouldDiscardCache() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String str = "FetchOptions{adType=" + this.a + ", networkName='" + this.c + '\'';
        if (this.b != null) {
            StringBuilder p = BK.p(str, ", placement Name=");
            p.append(this.b.getName());
            StringBuilder p2 = BK.p(p.toString(), ", placement Id=");
            p2.append(this.b.getId());
            str = p2.toString();
        }
        StringBuilder p3 = BK.p(str, ", customPlacementId='");
        p3.append(this.d);
        p3.append('\'');
        return p3.toString() + '}';
    }

    public FetchOptions(a aVar) {
        this.a = aVar.b();
        this.b = aVar.h();
        this.c = aVar.g();
        this.d = aVar.f();
        this.e = aVar.k();
        this.f = aVar.i();
        this.g = aVar.d();
        this.h = aVar.c();
        this.i = aVar.j();
        this.j = aVar.a();
        this.k = aVar.e();
        this.l = aVar.l();
    }
}
