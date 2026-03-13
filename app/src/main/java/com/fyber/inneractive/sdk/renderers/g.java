package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.fairbid.internal.Constants;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.measurement.tracker.c;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifier;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.q;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.u;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.web.i;
/* loaded from: classes.dex */
public class g extends r<b0, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b, z.b {
    public InneractiveAdViewUnitController m;
    public IAmraidWebViewController n;
    public i.h o;
    public ViewGroup q;
    public RelativeLayout r;
    public Runnable t;
    public com.fyber.inneractive.sdk.renderers.b z;
    public long l = 0;
    public boolean p = false;
    public long s = 0;
    public int u = 0;
    public long v = 0;
    public boolean w = false;
    public boolean x = true;
    public boolean y = false;

    /* loaded from: classes.dex */
    public static class a extends RelativeLayout {
        public final float a;

        public a(Context context, float f) {
            super(context);
            this.a = f;
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i2) <= 0)) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int size3 = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                float f = this.a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            }
            super.onMeasure(i3, i2);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BANNER_WIDTH(Constants.BANNER_FALLBACK_AD_WIDTH),
        BANNER_HEIGHT(50),
        BANNER_TABLET_HEIGHT(90),
        BANNER_TABLET_WIDTH(728),
        RECTANGLE_HEIGHT(250),
        RECTANGLE_WIDTH(300);
        
        public final int value;

        b(int i) {
            this.value = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public int A() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.b != null && iAmraidWebViewController.o()) {
                return p.b(this.n.b.getWidth());
            }
            return p.b(this.n.e0);
        }
        return -1;
    }

    public final void J() {
        if (this.t != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            q.b.removeCallbacks(this.t);
            this.t = null;
        }
    }

    public final void K() {
        com.fyber.inneractive.sdk.renderers.b bVar = this.z;
        if (bVar != null) {
            bVar.c();
        }
        if (this.n != null) {
            J();
            AdContent adcontent = this.b;
            if (adcontent != 0) {
                ((b0) adcontent).a();
            }
            this.n = null;
            this.b = null;
            ViewGroup viewGroup = this.q;
            if (viewGroup != null) {
                viewGroup.removeView(this.r);
            }
            RelativeLayout relativeLayout = this.r;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                this.r = null;
            }
        }
        this.w = false;
    }

    public final int L() {
        t tVar;
        int intValue;
        int i = this.u;
        if (i == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i > 0) {
            IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.u));
            intValue = this.u;
        } else {
            com.fyber.inneractive.sdk.config.b0 b0Var = this.a.getAdContent().d;
            if (b0Var != null && (tVar = ((a0) b0Var).c) != null) {
                Integer num = tVar.a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        return intValue * 1000;
    }

    public final void M() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null && iAmraidWebViewController.b != null) {
            IAlog.a("%srefreshing ad", IAlog.a(this));
            if ((!this.n.o() || this.n.s()) && (inneractiveAdViewUnitController = this.m) != null) {
                this.s = 0L;
                inneractiveAdViewUnitController.refreshAd();
            }
        }
    }

    public final void N() {
        com.fyber.inneractive.sdk.web.g gVar;
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null && (gVar = iAmraidWebViewController.b) != null && gVar.getIsVisible() && this.s != 0 && !this.n.o() && !this.n.s()) {
            if (!this.x) {
                if (this.l < System.currentTimeMillis() - this.s) {
                    this.v = 1L;
                } else {
                    this.v = this.l - (System.currentTimeMillis() - this.s);
                }
            }
            IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.v));
            a(this.v, false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public void b(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, c.EnumC0075c.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.util.z.b
    public void c(boolean z) {
        IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        if (z) {
            d(false);
            com.fyber.inneractive.sdk.renderers.b bVar = this.z;
            if (bVar == null || !bVar.h) {
                return;
            }
            bVar.c();
            return;
        }
        N();
        com.fyber.inneractive.sdk.renderers.b bVar2 = this.z;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.o() || this.n.s()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void d(boolean z) {
        if (this.t != null) {
            this.x = z;
            J();
            this.v = this.l - (System.currentTimeMillis() - this.s);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.v), Long.valueOf(this.l));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        J();
        K();
        this.o = null;
        z.a.a.a.remove(this);
        Runnable runnable = this.t;
        if (runnable != null) {
            q.b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        return this.n.e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        return this.n.f0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void r() {
        com.fyber.inneractive.sdk.web.g gVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null && (gVar = iAmraidWebViewController.b) != null) {
            if (gVar.getIsVisible() && !z.a.a.b && !this.n.o() && !this.n.s()) {
                IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
                long L = L();
                this.l = L;
                if (L != 0) {
                    a(10000L, false);
                    return;
                }
                return;
            }
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.v = 1L;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void u() {
        com.fyber.inneractive.sdk.renderers.b bVar = this.z;
        if (bVar != null) {
            bVar.c();
        }
        RelativeLayout relativeLayout = this.r;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.r = null;
        }
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.q = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public View y() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public int z() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.b != null && iAmraidWebViewController.o()) {
                return p.b(this.n.b.getHeight());
            }
            return p.b(this.n.f0);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(com.fyber.inneractive.sdk.flow.q qVar) {
        return qVar instanceof b0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        RelativeLayout relativeLayout;
        t tVar;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.a;
        if (inneractiveAdSpot == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.p = false;
        this.e = false;
        if (viewGroup != null) {
            this.q = viewGroup;
            this.m = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.y) {
            K();
            if (this.a.getAdContent() instanceof b0) {
                this.b = (b0) this.a.getAdContent();
                this.f = false;
            } else {
                IAlog.e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.a.getAdContent());
                return;
            }
        }
        Object obj = this.b;
        IAmraidWebViewController iAmraidWebViewController = obj != null ? ((b0) obj).i : null;
        this.n = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.o == null) {
                this.o = new e(this);
            }
            iAmraidWebViewController.setListener(this.o);
            b0 b0Var = (b0) this.b;
            InneractiveAdRequest inneractiveAdRequest = b0Var.a;
            com.fyber.inneractive.sdk.config.b0 b0Var2 = b0Var.d;
            if (b0Var2 != null && (tVar = ((a0) b0Var2).c) != null && (unitDisplayType = tVar.b) != null && unitDisplayType.isFullscreenUnit()) {
                a aVar = new a(this.q.getContext(), 1.5f);
                this.r = aVar;
                this.n.a(aVar, new ViewGroup.LayoutParams(-1, -1));
                this.q.addView(this.r, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.r = new a(this.q.getContext(), 0.0f);
                b0 b0Var3 = (b0) this.b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) b0Var3.b;
                q0 a2 = a(fVar.e, fVar.f, b0Var3.d);
                this.n.setAdDefaultSize(a2.a, a2.b);
                IAmraidWebViewController iAmraidWebViewController2 = this.n;
                com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController2.b;
                if (gVar == null && p.a != null) {
                    if (!this.y) {
                        this.y = true;
                        iAmraidWebViewController2.b = iAmraidWebViewController2.a(((b0) this.b).c);
                        try {
                            iAmraidWebViewController2.h();
                            iAmraidWebViewController2.b.loadDataWithBaseURL(iAmraidWebViewController2.p, iAmraidWebViewController2.q, "text/html", "utf-8", null);
                        } catch (Throwable unused) {
                            a(a2);
                        }
                    } else {
                        a(a2);
                    }
                } else {
                    ViewParent parent = gVar != null ? gVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(gVar);
                    }
                    this.n.a(this.r, u.a(a2.a, a2.b, 13));
                    this.q.addView(this.r, new ViewGroup.LayoutParams(-2, -2));
                    InneractiveAdSpot inneractiveAdSpot2 = this.a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && this.q != null) {
                        com.fyber.inneractive.sdk.flow.e eVar = new com.fyber.inneractive.sdk.flow.e(this.a.getAdContent().a, this.a.getAdContent().d(), this.a.getAdContent().c);
                        RelativeLayout relativeLayout2 = (RelativeLayout) View.inflate(this.q.getContext(), R.layout.fyber_ad_identifier_relative_layout, null);
                        eVar.a(relativeLayout2, FyberAdIdentifier.Corner.BOTTOM_LEFT);
                        relativeLayout2.setVisibility(0);
                        relativeLayout2.setGravity(83);
                        IAmraidWebViewController iAmraidWebViewController3 = this.n;
                        if (iAmraidWebViewController3 == null) {
                            viewGroup2 = null;
                        } else {
                            viewGroup2 = iAmraidWebViewController3.b;
                            if (viewGroup2 != null && viewGroup2.getParent() != null) {
                                viewGroup2 = (ViewGroup) viewGroup2.getParent();
                            }
                        }
                        if (viewGroup2 != null && y() != null) {
                            ViewGroup.LayoutParams layoutParams = y().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController4 = this.n;
                            viewGroup2.addView(relativeLayout2, layoutParams);
                            iAmraidWebViewController4.a(relativeLayout2, c.EnumC0075c.IdentifierView);
                        }
                    }
                }
            }
            AdContent adcontent = this.b;
            com.fyber.inneractive.sdk.response.f fVar2 = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((b0) adcontent).b : null;
            if (fVar2 != null && (relativeLayout = this.r) != null) {
                com.fyber.inneractive.sdk.renderers.b bVar = new com.fyber.inneractive.sdk.renderers.b(fVar2, relativeLayout, new d(this));
                this.z = bVar;
                bVar.i = false;
                bVar.e = 1;
                bVar.f = 0.0f;
                int i = fVar2.t;
                if (i >= 1) {
                    bVar.e = Math.min(i, 100);
                }
                float f = fVar2.u;
                if (f >= -1.0f) {
                    bVar.f = f;
                }
                if (bVar.f >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    bVar.d = 0.0f;
                    bVar.g = System.currentTimeMillis();
                    bVar.h = true;
                    bVar.a();
                }
            }
        } else {
            IAlog.e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", obj);
        }
        z zVar = z.a.a;
        if (zVar.a.contains(this)) {
            return;
        }
        zVar.a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public void c(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.b(view);
        }
    }

    public final void a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.g gVar;
        if (!TextUtils.isEmpty(this.a.getMediationNameString()) || j == 0 || (this.a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.u == -1 || (iAmraidWebViewController = this.n) == null || (gVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!gVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.s = System.currentTimeMillis();
        this.l = z ? this.l : j;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j), Long.valueOf(this.l));
        if (j > 1) {
            Runnable runnable = this.t;
            if (runnable != null) {
                q.b.removeCallbacks(runnable);
            }
            J();
            f fVar = new f(this);
            this.t = fVar;
            q.b.postDelayed(fVar, j);
            return;
        }
        M();
    }

    public static q0 a(int i, int i2, com.fyber.inneractive.sdk.config.b0 b0Var) {
        int a2;
        int a3;
        t tVar;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            a2 = p.a(i);
            a3 = p.a(i2);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (b0Var != null && (tVar = ((a0) b0Var).c) != null) {
                unitDisplayType = tVar.b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                a2 = p.a(b.RECTANGLE_WIDTH.value);
                a3 = p.a(b.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.n.o()) {
                a2 = p.a(b.BANNER_TABLET_WIDTH.value);
                a3 = p.a(b.BANNER_TABLET_HEIGHT.value);
            } else {
                a2 = p.a(b.BANNER_WIDTH.value);
                a3 = p.a(b.BANNER_HEIGHT.value);
            }
        }
        IAlog.d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(a2), Integer.valueOf(a3));
        return new q0(a2, a3);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        return view.equals(this.q);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i) {
        this.u = i;
    }

    public final void a(q0 q0Var) {
        FrameLayout frameLayout = new FrameLayout(this.q.getContext());
        frameLayout.setBackgroundResource(R.color.blank_background);
        this.q.removeAllViews();
        this.q.addView(frameLayout, new FrameLayout.LayoutParams(q0Var.a, q0Var.b, 17));
    }
}
