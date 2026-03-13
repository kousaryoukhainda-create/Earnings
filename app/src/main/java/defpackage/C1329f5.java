package defpackage;

import java.util.ArrayList;
/* renamed from: f5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1329f5 {
    public final Y4 d;
    public X20 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public C1329f5(C3244z4 c3244z4) {
        this.d = new Y4(this, c3244z4);
    }

    public final void a(UG ug, int i) {
        this.d.g(ug.j(i), 1.0f);
        this.d.g(ug.j(i), -1.0f);
    }

    public final void b(X20 x20, X20 x202, X20 x203, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.g(x20, -1.0f);
            this.d.g(x202, 1.0f);
            this.d.g(x203, 1.0f);
            return;
        }
        this.d.g(x20, 1.0f);
        this.d.g(x202, -1.0f);
        this.d.g(x203, -1.0f);
    }

    public final void c(X20 x20, X20 x202, X20 x203, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.g(x20, -1.0f);
            this.d.g(x202, 1.0f);
            this.d.g(x203, -1.0f);
            return;
        }
        this.d.g(x20, 1.0f);
        this.d.g(x202, -1.0f);
        this.d.g(x203, 1.0f);
    }

    public X20 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final X20 f(boolean[] zArr, X20 x20) {
        int i;
        int d = this.d.d();
        X20 x202 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                X20 e = this.d.e(i2);
                if ((zArr == null || !zArr[e.c]) && e != x20 && (((i = e.n) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    x202 = e;
                }
            }
        }
        return x202;
    }

    public final void g(X20 x20) {
        X20 x202 = this.a;
        if (x202 != null) {
            this.d.g(x202, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float h = this.d.h(x20, true) * (-1.0f);
        this.a = x20;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        Y4 y4 = this.d;
        int i = y4.h;
        for (int i2 = 0; i != -1 && i2 < y4.a; i2++) {
            float[] fArr = y4.g;
            fArr[i] = fArr[i] / h;
            i = y4.f[i];
        }
    }

    public final void h(UG ug, X20 x20, boolean z) {
        if (x20 != null && x20.h) {
            float c = this.d.c(x20);
            this.b = (x20.g * c) + this.b;
            this.d.h(x20, z);
            if (z) {
                x20.b(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                ug.a = true;
            }
        }
    }

    public void i(UG ug, C1329f5 c1329f5, boolean z) {
        Y4 y4 = this.d;
        y4.getClass();
        float c = y4.c(c1329f5.a);
        y4.h(c1329f5.a, z);
        Y4 y42 = c1329f5.d;
        int d = y42.d();
        for (int i = 0; i < d; i++) {
            X20 e = y42.e(i);
            y4.a(e, y42.c(e) * c, z);
        }
        this.b = (c1329f5.b * c) + this.b;
        if (z) {
            c1329f5.a.b(this);
        }
        if (this.a != null && this.d.d() == 0) {
            this.e = true;
            ug.a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            X20 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            X20 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r1)
            float r1 = r10.b
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.AbstractC0324Hi.l(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            Y4 r5 = r10.d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9d
            Y4 r6 = r10.d
            X20 r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L9a
        L47:
            Y4 r7 = r10.d
            float r7 = r7.f(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L9a
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L67
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L77
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L77
        L67:
            if (r8 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r1)
            goto L77
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r1)
            goto L64
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r6)
            goto L99
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L99:
            r1 = 1
        L9a:
            int r3 = r3 + 1
            goto L3c
        L9d:
            if (r1 != 0) goto La5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.AbstractC0324Hi.f(r0, r1)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1329f5.toString():java.lang.String");
    }
}
