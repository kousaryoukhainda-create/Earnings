package defpackage;

import com.applovin.impl.adview.a;
import com.applovin.impl.sb;
import com.applovin.impl.sdk.h;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.fyber.fairbid.sdk.mediation.adapter.mintegral.MintegralAdapter;
/* renamed from: f6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1331f6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC1331f6(int i, int i2, Object obj) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.b) {
            case 0:
                C1503h6 c1503h6 = ((C1417g6) this.d).b;
                c1503h6.getClass();
                int i = this.c;
                if (i != -3 && i != -2) {
                    if (i != -1) {
                        if (i != 1) {
                            BK.t(i, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        c1503h6.c(2);
                        SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss = c1503h6.c;
                        if (surfaceHolder$CallbackC0619Ss != null) {
                            C0697Vs c0697Vs = surfaceHolder$CallbackC0619Ss.b;
                            c0697Vs.A(1, 1, c0697Vs.o());
                            return;
                        }
                        return;
                    }
                    SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss2 = c1503h6.c;
                    if (surfaceHolder$CallbackC0619Ss2 != null) {
                        C0697Vs c0697Vs2 = surfaceHolder$CallbackC0619Ss2.b;
                        c0697Vs2.A(-1, 2, c0697Vs2.o());
                    }
                    c1503h6.a();
                    c1503h6.c(1);
                    return;
                }
                if (i != -2) {
                    S5 s5 = c1503h6.d;
                    if (s5 != null && s5.a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        c1503h6.c(4);
                        return;
                    }
                }
                SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss3 = c1503h6.c;
                if (surfaceHolder$CallbackC0619Ss3 != null) {
                    C0697Vs c0697Vs3 = surfaceHolder$CallbackC0619Ss3.b;
                    c0697Vs3.A(0, 1, c0697Vs3.o());
                }
                c1503h6.c(3);
                return;
            case 1:
                MaxAdPlacer.a((MaxAdPlacer) this.d, this.c);
                return;
            case 2:
                MintegralAdapter.a(this.c, (MintegralAdapter) this.d);
                return;
            case 3:
                ((AbstractC2618rm) this.d).F(this.c);
                return;
            case 4:
                ((a) this.d).a(this.c);
                return;
            case 5:
                h.b((h.a) this.d, this.c);
                return;
            default:
                ((sb) this.d).a(this.c);
                return;
        }
    }

    public /* synthetic */ RunnableC1331f6(int i, MintegralAdapter mintegralAdapter) {
        this.b = 2;
        this.c = i;
        this.d = mintegralAdapter;
    }
}
