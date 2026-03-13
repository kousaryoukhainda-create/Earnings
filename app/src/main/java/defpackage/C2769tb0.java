package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
/* renamed from: tb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2769tb0 {
    public final C0364Iw a;
    public final C2597rb0 b;
    public final Choreographer$FrameCallbackC2683sb0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Iw] */
    public C2769tb0(Context context) {
        DisplayManager displayManager;
        C2597rb0 c2597rb0;
        ?? obj = new Object();
        obj.a = new C0338Hw();
        obj.b = new C0338Hw();
        obj.d = -9223372036854775807L;
        this.a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c2597rb0 = null;
        } else {
            c2597rb0 = new C2597rb0(this, displayManager);
        }
        this.b = c2597rb0;
        this.c = c2597rb0 != null ? Choreographer$FrameCallbackC2683sb0.g : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(C2769tb0 c2769tb0, Display display) {
        c2769tb0.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c2769tb0.k = refreshRate;
            c2769tb0.l = (refreshRate * 80) / 100;
            return;
        }
        Wh0.o0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        c2769tb0.k = -9223372036854775807L;
        c2769tb0.l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Ha0.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            AbstractC2512qb0.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = defpackage.Ha0.a
            r1 = 30
            if (r0 < r1) goto L8e
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L8e
        Lc:
            Iw r0 = r9.a
            Hw r2 = r0.a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3a
            Hw r2 = r0.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            Hw r2 = r0.a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3c
        L37:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3c
        L3a:
            float r2 = r9.f
        L3c:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L43
            return
        L43:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L81
            Hw r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L72
            Hw r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L60
            Hw r0 = r0.a
            long r0 = r0.f
            goto L65
        L60:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L72
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L74
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
        L74:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8e
            goto L88
        L81:
            if (r5 == 0) goto L84
            goto L88
        L84:
            int r0 = r0.e
            if (r0 < r1) goto L8e
        L88:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2769tb0.c():void");
    }

    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Ha0.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (z && this.h == f) {
                        return;
                    }
                    this.h = f;
                    AbstractC2512qb0.a(surface, f);
                }
            }
            f = 0.0f;
            if (z) {
            }
            this.h = f;
            AbstractC2512qb0.a(surface, f);
        }
    }
}
