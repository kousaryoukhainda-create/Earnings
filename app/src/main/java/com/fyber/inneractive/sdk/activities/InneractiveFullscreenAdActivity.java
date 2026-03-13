package com.fyber.inneractive.sdk.activities;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.c0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements c.a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public ViewGroup b;
    public InneractiveAdSpot c;
    public com.fyber.inneractive.sdk.interfaces.c d;
    public CloseButtonFlowManager i;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public final Runnable mHideNavigationBarTask = new a();

    /* loaded from: classes.dex */
    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.c getFullscreenRenderer();
    }

    /* loaded from: classes.dex */
    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!InneractiveFullscreenAdActivity.this.isFinishing()) {
                InneractiveFullscreenAdActivity.this.hideNavigationBar();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                q.b.postDelayed(InneractiveFullscreenAdActivity.this.mHideNavigationBarTask, 3000L);
            }
        }
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        q.b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void destroy() {
        if (!isFinishing() && this.b != null) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        closeButtonFlowManager.c.setVisibility(8);
        closeButtonFlowManager.a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void dismissAd(boolean z) {
        this.h = z;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public View getCloseButton() {
        return this.i.e;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public ViewGroup getLayout() {
        return this.b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new b());
    }

    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(UserVerificationMethods.USER_VERIFY_ALL);
        getWindow().addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && (((r) cVar) instanceof com.fyber.inneractive.sdk.renderers.k)) {
            setTheme(16973831);
            requestWindowFeature(67108864);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        c0 c0Var = ((a0) this.c.getAdContent().d).f;
        if (c0Var != null) {
            Orientation orientation = c0Var.e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean isCloseButtonDisplay() {
        if (this.i.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
        if (cVar == null || !cVar.v()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
        if (cVar != null) {
            int i = configuration.orientation;
            if (i != this.e) {
                this.e = i;
                cVar.b();
                return;
            }
            int i2 = this.f;
            int i3 = configuration.screenHeightDp;
            if (i2 != i3 || this.g != configuration.screenWidthDp) {
                this.f = i3;
                this.g = configuration.screenWidthDp;
                cVar.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [AdContent extends com.fyber.inneractive.sdk.flow.q, com.fyber.inneractive.sdk.flow.q] */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener, EventsListener extends com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener] */
    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.e("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.c = inneractiveAdSpot;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && this.c.getAdContent().d != null) {
            InneractiveUnitController selectedUnitController = this.c.getSelectedUnitController();
            if (selectedUnitController != null && (selectedUnitController instanceof FullScreenRendererProvider)) {
                com.fyber.inneractive.sdk.interfaces.c fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.d = fullscreenRenderer;
                initWindowFeatures(fullscreenRenderer);
                super.onCreate(bundle);
                IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.c.getLocalUniqueId());
                this.e = getResources().getConfiguration().orientation;
                this.f = getResources().getConfiguration().screenHeightDp;
                this.g = getResources().getConfiguration().screenWidthDp;
                if (this.d != null) {
                    try {
                        setContentView(R.layout.ia_fullscreen_activity);
                        this.b = (ViewGroup) findViewById(R.id.ia_ad_content);
                        this.i = new CloseButtonFlowManager(this);
                        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
                        InneractiveAdSpot inneractiveAdSpot2 = this.c;
                        z zVar = (z) cVar;
                        zVar.a = inneractiveAdSpot2;
                        zVar.b = inneractiveAdSpot2.getAdContent();
                        zVar.c = inneractiveAdSpot2.getSelectedUnitController().getEventsListener();
                        zVar.v.a = inneractiveAdSpot2;
                        try {
                            this.d.a(this, this);
                            this.c.getAdContent().e = true;
                            return;
                        } catch (Resources.NotFoundException e) {
                            IAlog.e("Interstitial Activity: %s", e.getMessage());
                            finish();
                            return;
                        } catch (InneractiveUnitController.AdDisplayError e2) {
                            IAlog.e("Interstitial Activity: %s", e2.getMessage());
                            finish();
                            return;
                        }
                    } catch (Throwable th) {
                        t.a(th, this.c.getAdContent().a, this.c.getAdContent().d());
                        finish();
                        return;
                    }
                }
                IAlog.e("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
                finish();
                return;
            }
            IAlog.e("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        InneractiveUnitController selectedUnitController;
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.c;
        if (inneractiveAdSpot == null) {
            selectedUnitController = null;
        } else {
            selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        }
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
        if (cVar != null) {
            cVar.m();
            this.d.destroy();
            this.d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
            if (cVar != null) {
                cVar.m();
                this.d.destroy();
                this.d = null;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.t();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideNavigationBar();
            com.fyber.inneractive.sdk.interfaces.c cVar = this.d;
            if (cVar != null) {
                cVar.o();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.t();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void secondEndCardWasDisplayed() {
        this.i.f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseButton(boolean z, int i, int i2) {
        int i3;
        int i4;
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (z && !closeButtonFlowManager.f) {
            closeButtonFlowManager.a.setAlpha(0.0f);
            closeButtonFlowManager.d.setAlpha(0.0f);
        } else {
            closeButtonFlowManager.a.setAlpha(1.0f);
            closeButtonFlowManager.d.setAlpha(1.0f);
        }
        closeButtonFlowManager.b.setText("");
        closeButtonFlowManager.b.setVisibility(8);
        if (i >= 5) {
            int round = Math.round((p.b() * i) + 0.5f);
            closeButtonFlowManager.d.getLayoutParams().width = round;
            closeButtonFlowManager.d.getLayoutParams().height = round;
        }
        if (i2 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closeButtonFlowManager.a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) closeButtonFlowManager.c.getLayoutParams();
            int round2 = Math.round((p.b() * i2) + 0.5f);
            int i5 = ((FrameLayout.LayoutParams) closeButtonFlowManager.d.getLayoutParams()).width;
            int i6 = round2 - i5;
            if (round2 > i5 && i6 > (i4 = layoutParams.rightMargin)) {
                int i7 = (i5 / 2) + (round2 / 2) + i4;
                layoutParams2.width = i7;
                layoutParams2.height = i7;
                layoutParams.gravity = 53;
                i3 = 0;
            } else {
                layoutParams2.width = round2;
                layoutParams2.height = round2;
                i3 = layoutParams.rightMargin;
                if (i6 < i3) {
                    i3 -= i6 / 2;
                }
            }
            layoutParams2.setMargins(i3, i3, i3, i3);
            layoutParams2.gravity = 17;
        }
        closeButtonFlowManager.a.setVisibility(0);
        closeButtonFlowManager.d.setVisibility(0);
        closeButtonFlowManager.c.setVisibility(0);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        closeButtonFlowManager.b.setBackgroundResource(R.drawable.ia_round_overlay_bg);
        closeButtonFlowManager.a.setVisibility(0);
        closeButtonFlowManager.b.setVisibility(0);
        closeButtonFlowManager.d.setVisibility(8);
        closeButtonFlowManager.c.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        closeButtonFlowManager.getClass();
        if (i > 0) {
            closeButtonFlowManager.b.setText(Integer.toString(i));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean wasDismissedByUser() {
        return this.h;
    }
}
