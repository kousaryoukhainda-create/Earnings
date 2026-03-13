package com.fyber.fairbid.common.banner;

import android.view.View;
/* loaded from: classes.dex */
public interface BannerWrapper {

    /* loaded from: classes.dex */
    public interface OnSizeChangeListener {
        void onSizeChange(int i, int i2);
    }

    boolean canRefresh();

    boolean destroyBanner(boolean z);

    int getAdHeight();

    int getAdWidth();

    View getRealBannerView();

    boolean isUsingFullWidth();

    boolean isViewAvailable();

    void onBannerAttachedToView();

    void setSizeChangeListener(OnSizeChangeListener onSizeChangeListener);
}
