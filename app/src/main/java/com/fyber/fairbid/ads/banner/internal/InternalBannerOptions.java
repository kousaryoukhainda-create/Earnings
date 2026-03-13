package com.fyber.fairbid.ads.banner.internal;

import android.view.ViewGroup;
import com.fyber.fairbid.ads.banner.BannerOptions;
import com.fyber.fairbid.ads.banner.BannerSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class InternalBannerOptions {
    public ViewGroup b;
    public boolean d;
    public int a = 80;
    @NotNull
    public BannerSize c = BannerSize.SMART;
    @NotNull
    public BannerOptions.RefreshMode e = BannerOptions.RefreshMode.AUTO;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!InternalBannerOptions.class.equals(cls)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.fyber.fairbid.ads.banner.internal.InternalBannerOptions");
        InternalBannerOptions internalBannerOptions = (InternalBannerOptions) obj;
        if (this.a == internalBannerOptions.a && Intrinsics.a(this.b, internalBannerOptions.b) && this.c == internalBannerOptions.c && this.d == internalBannerOptions.d && this.e == internalBannerOptions.e) {
            return true;
        }
        return false;
    }

    public final boolean equalsExceptPositionOrContainer(@NotNull InternalBannerOptions other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.c == other.c && this.d == other.d && this.e == other.e) {
            return true;
        }
        return false;
    }

    @NotNull
    public final BannerSize getBannerSize() {
        return this.c;
    }

    public final ViewGroup getContainer() {
        return this.b;
    }

    public final int getPosition() {
        return this.a;
    }

    @NotNull
    public final BannerOptions.RefreshMode getRefreshMode() {
        return this.e;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.a * 31;
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            i = viewGroup.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.c.hashCode() + ((i3 + i) * 31)) * 31;
        if (this.d) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return this.e.hashCode() + ((i2 + hashCode) * 31);
    }

    public final boolean isAdaptive() {
        return this.d;
    }

    public final void setAdaptive(boolean z) {
        this.d = z;
    }

    public final void setBannerSize(@NotNull BannerSize bannerSize) {
        Intrinsics.checkNotNullParameter(bannerSize, "<set-?>");
        this.c = bannerSize;
    }

    public final void setContainer(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void setPosition(int i) {
        this.b = null;
        this.a = i;
    }

    public final void setRefreshMode(@NotNull BannerOptions.RefreshMode refreshMode) {
        Intrinsics.checkNotNullParameter(refreshMode, "<set-?>");
        this.e = refreshMode;
    }

    @NotNull
    public String toString() {
        return "(position: " + this.a + ", container: " + this.b + ')';
    }
}
