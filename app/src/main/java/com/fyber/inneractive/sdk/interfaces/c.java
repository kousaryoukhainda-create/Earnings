package com.fyber.inneractive.sdk.interfaces;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
/* loaded from: classes.dex */
public interface c extends InneractiveAdRenderer {

    /* loaded from: classes.dex */
    public interface a {
        void destroy();

        void disableCloseButton();

        void dismissAd(boolean z);

        View getCloseButton();

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void secondEndCardWasDisplayed();

        void setActivityOrientation(boolean z, Orientation orientation);

        void showCloseButton(boolean z, int i, int i2);

        void showCloseCountdown();

        void updateCloseCountdown(int i);

        boolean wasDismissedByUser();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    void a(a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException;

    void a(b bVar);

    void b();

    void b(boolean z);

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void destroy();

    void m();

    void o();

    void t();

    boolean v();
}
