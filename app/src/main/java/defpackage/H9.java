package defpackage;

import java.util.ArrayList;
/* renamed from: H9  reason: default package */
/* loaded from: classes.dex */
public final class H9 extends C0427Lh {
    public C0427Lh[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final void N(int i, C2687sd0 c2687sd0, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            C0427Lh c0427Lh = this.p0[i2];
            ArrayList arrayList2 = c2687sd0.a;
            if (!arrayList2.contains(c0427Lh)) {
                arrayList2.add(c0427Lh);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            Wh0.B(this.p0[i3], i, arrayList, c2687sd0);
        }
    }

    public final boolean O() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            C0427Lh c0427Lh = this.p0[i4];
            if ((this.s0 || c0427Lh.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !c0427Lh.y()) || (((i3 = this.r0) == 2 || i3 == 3) && !c0427Lh.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.q0; i6++) {
            C0427Lh c0427Lh2 = this.p0[i6];
            if (this.s0 || c0427Lh2.c()) {
                if (!z2) {
                    int i7 = this.r0;
                    if (i7 == 0) {
                        i5 = c0427Lh2.g(2).c();
                    } else if (i7 == 1) {
                        i5 = c0427Lh2.g(4).c();
                    } else if (i7 == 2) {
                        i5 = c0427Lh2.g(3).c();
                    } else if (i7 == 3) {
                        i5 = c0427Lh2.g(5).c();
                    }
                    z2 = true;
                }
                int i8 = this.r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0427Lh2.g(2).c());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0427Lh2.g(4).c());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0427Lh2.g(3).c());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0427Lh2.g(5).c());
                }
            }
        }
        int i9 = i5 + this.t0;
        int i10 = this.r0;
        if (i10 != 0 && i10 != 1) {
            G(i9, i9);
        } else {
            F(i9, i9);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // defpackage.C0427Lh
    public final void b(UG ug, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        C2866uh[] c2866uhArr = this.P;
        C2866uh c2866uh = this.H;
        c2866uhArr[0] = c2866uh;
        C2866uh c2866uh2 = this.I;
        int i5 = 2;
        c2866uhArr[2] = c2866uh2;
        C2866uh c2866uh3 = this.J;
        c2866uhArr[1] = c2866uh3;
        C2866uh c2866uh4 = this.K;
        c2866uhArr[3] = c2866uh4;
        for (C2866uh c2866uh5 : c2866uhArr) {
            c2866uh5.i = ug.k(c2866uh5);
        }
        int i6 = this.r0;
        if (i6 >= 0 && i6 < 4) {
            C2866uh c2866uh6 = c2866uhArr[i6];
            if (!this.u0) {
                O();
            }
            if (this.u0) {
                this.u0 = false;
                int i7 = this.r0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        ug.d(c2866uh2.i, this.Y);
                        ug.d(c2866uh4.i, this.Y);
                        return;
                    }
                    return;
                }
                ug.d(c2866uh.i, this.X);
                ug.d(c2866uh3.i, this.X);
                return;
            }
            for (int i8 = 0; i8 < this.q0; i8++) {
                C0427Lh c0427Lh = this.p0[i8];
                if ((this.s0 || c0427Lh.c()) && ((((i4 = this.r0) == 0 || i4 == 1) && c0427Lh.o0[0] == 3 && c0427Lh.H.f != null && c0427Lh.J.f != null) || ((i4 == 2 || i4 == 3) && c0427Lh.o0[1] == 3 && c0427Lh.I.f != null && c0427Lh.K.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!c2866uh.e() && !c2866uh3.e()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!c2866uh2.e() && !c2866uh4.e()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.r0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                i = 5;
            } else {
                i = 4;
            }
            int i9 = 0;
            while (i9 < this.q0) {
                C0427Lh c0427Lh2 = this.p0[i9];
                if (this.s0 || c0427Lh2.c()) {
                    X20 k = ug.k(c0427Lh2.P[this.r0]);
                    int i10 = this.r0;
                    C2866uh c2866uh7 = c0427Lh2.P[i10];
                    c2866uh7.i = k;
                    C2866uh c2866uh8 = c2866uh7.f;
                    if (c2866uh8 != null && c2866uh8.d == this) {
                        i2 = c2866uh7.g;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        C1329f5 l = ug.l();
                        X20 m = ug.m();
                        m.f = 0;
                        l.b(c2866uh6.i, k, m, this.t0 + i2);
                        ug.c(l);
                    } else {
                        C1329f5 l2 = ug.l();
                        X20 m2 = ug.m();
                        m2.f = 0;
                        l2.c(c2866uh6.i, k, m2, this.t0 - i2);
                        ug.c(l2);
                    }
                    ug.e(c2866uh6.i, k, this.t0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i11 = this.r0;
            if (i11 == 0) {
                ug.e(c2866uh3.i, c2866uh.i, 0, 8);
                ug.e(c2866uh.i, this.S.J.i, 0, 4);
                ug.e(c2866uh.i, this.S.H.i, 0, 0);
            } else if (i11 == 1) {
                ug.e(c2866uh.i, c2866uh3.i, 0, 8);
                ug.e(c2866uh.i, this.S.H.i, 0, 4);
                ug.e(c2866uh.i, this.S.J.i, 0, 0);
            } else if (i11 == 2) {
                ug.e(c2866uh4.i, c2866uh2.i, 0, 8);
                ug.e(c2866uh2.i, this.S.K.i, 0, 4);
                ug.e(c2866uh2.i, this.S.I.i, 0, 0);
            } else if (i11 == 3) {
                ug.e(c2866uh2.i, c2866uh4.i, 0, 8);
                ug.e(c2866uh2.i, this.S.I.i, 0, 4);
                ug.e(c2866uh2.i, this.S.K.i, 0, 0);
            }
        }
    }

    @Override // defpackage.C0427Lh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.C0427Lh
    public final String toString() {
        String h = AbstractC0324Hi.h(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            C0427Lh c0427Lh = this.p0[i];
            if (i > 0) {
                h = AbstractC0324Hi.f(h, ", ");
            }
            StringBuilder l = AbstractC0324Hi.l(h);
            l.append(c0427Lh.g0);
            h = l.toString();
        }
        return AbstractC0324Hi.f(h, "}");
    }

    @Override // defpackage.C0427Lh
    public final boolean y() {
        return this.u0;
    }

    @Override // defpackage.C0427Lh
    public final boolean z() {
        return this.u0;
    }
}
