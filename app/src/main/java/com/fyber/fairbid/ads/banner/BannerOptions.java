package com.fyber.fairbid.ads.banner;

import android.view.ViewGroup;
import com.fyber.fairbid.ads.banner.internal.InternalBannerOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class BannerOptions {
    @NotNull
    public final InternalBannerOptions a = new InternalBannerOptions();

    @Metadata
    /* loaded from: classes.dex */
    public enum RefreshMode {
        AUTO,
        OFF,
        MANUAL;

        RefreshMode() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BannerOptions.class.equals(obj.getClass())) {
            return Intrinsics.a(this.a, ((BannerOptions) obj).a);
        }
        return false;
    }

    @NotNull
    public final InternalBannerOptions getInternalOptions() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final BannerOptions placeAtTheBottom() {
        this.a.setPosition(80);
        return this;
    }

    @NotNull
    public final BannerOptions placeAtTheTop() {
        this.a.setPosition(48);
        return this;
    }

    @NotNull
    public final BannerOptions placeInContainer(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.a.setContainer(viewGroup);
        return this;
    }

    @NotNull
    public final BannerOptions setAdaptive(boolean z) {
        this.a.setAdaptive(z);
        return this;
    }

    @NotNull
    public final BannerOptions setRefreshMode(@NotNull RefreshMode refreshMode) {
        Intrinsics.checkNotNullParameter(refreshMode, "refreshMode");
        this.a.setRefreshMode(refreshMode);
        return this;
    }

    @NotNull
    public final BannerOptions withSize(@NotNull BannerSize bannerSize) {
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        this.a.setBannerSize(bannerSize);
        return this;
    }
}
