package com.fyber.fairbid;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.internal.Logger;
import com.mbridge.msdk.out.MBBannerView;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class td implements BannerWrapper {
    @NotNull
    public final MBBannerView a;
    @NotNull
    public final ActivityProvider b;
    @NotNull
    public final SoftReference<Activity> c;
    @NotNull
    public final a d;

    /* loaded from: classes.dex */
    public static final class a extends C1097g {
        public a() {
        }

        @Override // com.fyber.fairbid.C1097g, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.a(activity, td.this.c.get())) {
                Logger.debug("MintegralBannerWrapper - calling banner.onPause()");
                td.this.a.onPause();
            }
        }

        @Override // com.fyber.fairbid.C1097g, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.a(activity, td.this.c.get())) {
                Logger.debug("MintegralBannerWrapper - calling banner.onResume()");
                td.this.a.onResume();
            }
        }
    }

    public td(@NotNull MBBannerView banner, @NotNull ActivityProvider activityProvider, @NotNull Activity hostActivity) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        this.a = banner;
        this.b = activityProvider;
        this.c = new SoftReference<>(hostActivity);
        a aVar = new a();
        this.d = aVar;
        activityProvider.a((C1097g) aVar);
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean canRefresh() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean destroyBanner(boolean z) {
        this.a.release();
        this.c.clear();
        this.b.a((Application.ActivityLifecycleCallbacks) this.d);
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdHeight() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.width;
        }
        return 0;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    @NotNull
    public final View getRealBannerView() {
        return this.a;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean isUsingFullWidth() {
        return false;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean isViewAvailable() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final /* synthetic */ void onBannerAttachedToView() {
        G9.a(this);
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final void setSizeChangeListener(BannerWrapper.OnSizeChangeListener onSizeChangeListener) {
    }
}
