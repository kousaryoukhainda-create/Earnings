package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
/* renamed from: UG  reason: default package */
/* loaded from: classes.dex */
public final class UG {
    public static boolean p = false;
    public static int q = 1000;
    public final C0940bT c;
    public C1329f5[] f;
    public final C3244z4 l;
    public C1329f5 o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public X20[] m = new X20[q];
    public int n = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [bT, java.lang.Object, f5] */
    public UG() {
        this.f = null;
        this.f = new C1329f5[32];
        s();
        C3244z4 c3244z4 = new C3244z4(9);
        c3244z4.c = new C3188yS();
        c3244z4.d = new C3188yS();
        c3244z4.f = new X20[32];
        this.l = c3244z4;
        ?? c1329f5 = new C1329f5(c3244z4);
        c1329f5.f = new X20[UserVerificationMethods.USER_VERIFY_PATTERN];
        c1329f5.g = new X20[UserVerificationMethods.USER_VERIFY_PATTERN];
        c1329f5.h = 0;
        c1329f5.i = new C0647Tu(24, (Object) c1329f5, false);
        this.c = c1329f5;
        this.o = new C1329f5(c3244z4);
    }

    public static int n(Object obj) {
        X20 x20 = ((C2866uh) obj).i;
        if (x20 != null) {
            return (int) (x20.g + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final X20 a(int i) {
        C3188yS c3188yS = (C3188yS) this.l.d;
        int i2 = c3188yS.b;
        X20 x20 = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c3188yS.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c3188yS.b = i3;
            x20 = r4;
        }
        X20 x202 = x20;
        if (x202 == null) {
            x202 = new X20(i);
            x202.n = i;
        } else {
            x202.e();
            x202.n = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (X20[]) Arrays.copyOf(this.m, i6);
        }
        X20[] x20Arr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        x20Arr[i7] = x202;
        return x202;
    }

    public final void b(X20 x20, X20 x202, int i, float f, X20 x203, X20 x204, int i2, int i3) {
        C1329f5 l = l();
        if (x202 == x203) {
            l.d.g(x20, 1.0f);
            l.d.g(x204, 1.0f);
            l.d.g(x202, -2.0f);
        } else if (f == 0.5f) {
            l.d.g(x20, 1.0f);
            l.d.g(x202, -1.0f);
            l.d.g(x203, -1.0f);
            l.d.g(x204, 1.0f);
            if (i > 0 || i2 > 0) {
                l.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            l.d.g(x20, -1.0f);
            l.d.g(x202, 1.0f);
            l.b = i;
        } else if (f >= 1.0f) {
            l.d.g(x204, -1.0f);
            l.d.g(x203, 1.0f);
            l.b = -i2;
        } else {
            float f2 = 1.0f - f;
            l.d.g(x20, f2 * 1.0f);
            l.d.g(x202, f2 * (-1.0f));
            l.d.g(x203, (-1.0f) * f);
            l.d.g(x204, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
        if (r4.m <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e0, code lost:
        if (r4.m <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
        if (r4.m <= 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fb, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0105, code lost:
        if (r4.m <= 1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.C1329f5 r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UG.c(f5):void");
    }

    public final void d(X20 x20, int i) {
        int i2 = x20.d;
        if (i2 == -1) {
            x20.f(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                X20 x202 = ((X20[]) this.l.f)[i3];
            }
        } else if (i2 != -1) {
            C1329f5 c1329f5 = this.f[i2];
            if (c1329f5.e) {
                c1329f5.b = i;
            } else if (c1329f5.d.d() == 0) {
                c1329f5.e = true;
                c1329f5.b = i;
            } else {
                C1329f5 l = l();
                if (i < 0) {
                    l.b = i * (-1);
                    l.d.g(x20, 1.0f);
                } else {
                    l.b = i;
                    l.d.g(x20, -1.0f);
                }
                c(l);
            }
        } else {
            C1329f5 l2 = l();
            l2.a = x20;
            float f = i;
            x20.g = f;
            l2.b = f;
            l2.e = true;
            c(l2);
        }
    }

    public final void e(X20 x20, X20 x202, int i, int i2) {
        if (i2 == 8 && x202.h && x20.d == -1) {
            x20.f(this, x202.g + i);
            return;
        }
        C1329f5 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        if (!z) {
            l.d.g(x20, -1.0f);
            l.d.g(x202, 1.0f);
        } else {
            l.d.g(x20, 1.0f);
            l.d.g(x202, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(X20 x20, X20 x202, int i, int i2) {
        C1329f5 l = l();
        X20 m = m();
        m.f = 0;
        l.b(x20, x202, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(X20 x20, X20 x202, int i, int i2) {
        C1329f5 l = l();
        X20 m = m();
        m.f = 0;
        l.c(x20, x202, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(C1329f5 c1329f5) {
        int i;
        if (c1329f5.e) {
            c1329f5.a.f(this, c1329f5.b);
        } else {
            C1329f5[] c1329f5Arr = this.f;
            int i2 = this.j;
            c1329f5Arr[i2] = c1329f5;
            X20 x20 = c1329f5.a;
            x20.d = i2;
            this.j = i2 + 1;
            x20.g(this, c1329f5);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                C1329f5 c1329f52 = this.f[i3];
                if (c1329f52 != null && c1329f52.e) {
                    c1329f52.a.f(this, c1329f52.b);
                    ((C3188yS) this.l.c).b(c1329f52);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        C1329f5[] c1329f5Arr2 = this.f;
                        int i6 = i4 - 1;
                        C1329f5 c1329f53 = c1329f5Arr2[i4];
                        c1329f5Arr2[i6] = c1329f53;
                        X20 x202 = c1329f53.a;
                        if (x202.d == i4) {
                            x202.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            C1329f5 c1329f5 = this.f[i];
            c1329f5.a.g = c1329f5.b;
        }
    }

    public final X20 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        X20 a = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a.c = i2;
        a.f = i;
        ((X20[]) this.l.f)[i2] = a;
        C0940bT c0940bT = this.c;
        c0940bT.i.c = a;
        float[] fArr = a.j;
        Arrays.fill(fArr, 0.0f);
        fArr[a.f] = 1.0f;
        c0940bT.j(a);
        return a;
    }

    public final X20 k(Object obj) {
        X20 x20 = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof C2866uh) {
            C2866uh c2866uh = (C2866uh) obj;
            x20 = c2866uh.i;
            if (x20 == null) {
                c2866uh.h();
                x20 = c2866uh.i;
            }
            int i = x20.c;
            C3244z4 c3244z4 = this.l;
            if (i == -1 || i > this.b || ((X20[]) c3244z4.f)[i] == null) {
                if (i != -1) {
                    x20.e();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                x20.c = i2;
                x20.n = 1;
                ((X20[]) c3244z4.f)[i2] = x20;
            }
        }
        return x20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final C1329f5 l() {
        C1329f5 c1329f5;
        C3244z4 c3244z4 = this.l;
        C3188yS c3188yS = (C3188yS) c3244z4.c;
        int i = c3188yS.b;
        if (i > 0) {
            int i2 = i - 1;
            ?? r4 = c3188yS.a;
            ?? r5 = r4[i2];
            r4[i2] = 0;
            c3188yS.b = i2;
            c1329f5 = r5;
        } else {
            c1329f5 = null;
        }
        C1329f5 c1329f52 = c1329f5;
        if (c1329f52 == null) {
            return new C1329f5(c3244z4);
        }
        c1329f52.a = null;
        c1329f52.d.b();
        c1329f52.b = 0.0f;
        c1329f52.e = false;
        return c1329f52;
    }

    public final X20 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        X20 a = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        a.c = i;
        ((X20[]) this.l.f)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (C1329f5[]) Arrays.copyOf(this.f, i);
        C3244z4 c3244z4 = this.l;
        c3244z4.f = (X20[]) Arrays.copyOf((X20[]) c3244z4.f, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        C0940bT c0940bT = this.c;
        if (c0940bT.e()) {
            i();
        } else if (this.g) {
            for (int i = 0; i < this.j; i++) {
                if (!this.f[i].e) {
                    q(c0940bT);
                    return;
                }
            }
            i();
        } else {
            q(c0940bT);
        }
    }

    public final void q(C0940bT c0940bT) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            C1329f5 c1329f5 = this.f[i];
            int i2 = 1;
            if (c1329f5.a.n != 1) {
                float f = 0.0f;
                if (c1329f5.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.j) {
                            C1329f5 c1329f52 = this.f[i4];
                            if (c1329f52.a.n != i2 && !c1329f52.e && c1329f52.b < f) {
                                int d = c1329f52.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    X20 e = c1329f52.d.e(i8);
                                    float c = c1329f52.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.i[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = e.c;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            C1329f5 c1329f53 = this.f[i5];
                            c1329f53.a.d = -1;
                            c1329f53.g(((X20[]) this.l.f)[i6]);
                            X20 x20 = c1329f53.a;
                            x20.d = i5;
                            x20.g(this, c1329f53);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0940bT);
        i();
    }

    public final void r(C1329f5 c1329f5) {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            int i3 = 1;
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            X20 x20 = c1329f5.a;
            if (x20 != null) {
                this.h[x20.c] = true;
            }
            X20 d = c1329f5.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i4 = d.c;
                if (zArr[i4]) {
                    return;
                }
                zArr[i4] = true;
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                while (i5 < this.j) {
                    C1329f5 c1329f52 = this.f[i5];
                    if (c1329f52.a.n != i3 && !c1329f52.e) {
                        Y4 y4 = c1329f52.d;
                        int i7 = y4.h;
                        if (i7 != -1) {
                            for (int i8 = 0; i7 != -1 && i8 < y4.a; i8++) {
                                if (y4.e[i7] == d.c) {
                                    z = true;
                                    break;
                                }
                                i7 = y4.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = c1329f52.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-c1329f52.b) / c;
                                if (f2 < f) {
                                    f = f2;
                                    i6 = i5;
                                }
                            }
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 > -1) {
                    C1329f5 c1329f53 = this.f[i6];
                    c1329f53.a.d = -1;
                    c1329f53.g(d);
                    X20 x202 = c1329f53.a;
                    x202.d = i6;
                    x202.g(this, c1329f53);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            C1329f5 c1329f5 = this.f[i];
            if (c1329f5 != null) {
                ((C3188yS) this.l.c).b(c1329f5);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        C3244z4 c3244z4;
        int i = 0;
        while (true) {
            c3244z4 = this.l;
            X20[] x20Arr = (X20[]) c3244z4.f;
            if (i >= x20Arr.length) {
                break;
            }
            X20 x20 = x20Arr[i];
            if (x20 != null) {
                x20.e();
            }
            i++;
        }
        C3188yS c3188yS = (C3188yS) c3244z4.d;
        X20[] x20Arr2 = this.m;
        int i2 = this.n;
        c3188yS.getClass();
        if (i2 > x20Arr2.length) {
            i2 = x20Arr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            X20 x202 = x20Arr2[i3];
            int i4 = c3188yS.b;
            Object[] objArr = c3188yS.a;
            if (i4 < objArr.length) {
                objArr[i4] = x202;
                c3188yS.b = i4 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((X20[]) c3244z4.f, (Object) null);
        this.b = 0;
        C0940bT c0940bT = this.c;
        c0940bT.h = 0;
        c0940bT.b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.j; i5++) {
            C1329f5 c1329f5 = this.f[i5];
        }
        s();
        this.j = 0;
        this.o = new C1329f5(c3244z4);
    }
}
