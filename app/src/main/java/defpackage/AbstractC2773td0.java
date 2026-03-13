package defpackage;
/* renamed from: td0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2773td0 implements InterfaceC0975bp {
    public int a;
    public C0427Lh b;
    public PX c;
    public int d;
    public final C3224yp e = new C3224yp(this);
    public int f = 0;
    public boolean g = false;
    public final C1307ep h = new C1307ep(this);
    public final C1307ep i = new C1307ep(this);
    public int j = 1;

    public AbstractC2773td0(C0427Lh c0427Lh) {
        this.b = c0427Lh;
    }

    public static void b(C1307ep c1307ep, C1307ep c1307ep2, int i) {
        c1307ep.l.add(c1307ep2);
        c1307ep.f = i;
        c1307ep2.k.add(c1307ep);
    }

    public static C1307ep h(C2866uh c2866uh) {
        C2866uh c2866uh2 = c2866uh.f;
        if (c2866uh2 == null) {
            return null;
        }
        int A = AbstractC0324Hi.A(c2866uh2.e);
        C0427Lh c0427Lh = c2866uh2.d;
        if (A != 1) {
            if (A != 2) {
                if (A != 3) {
                    if (A != 4) {
                        if (A != 5) {
                            return null;
                        }
                        return c0427Lh.e.k;
                    }
                    return c0427Lh.e.i;
                }
                return c0427Lh.d.i;
            }
            return c0427Lh.e.h;
        }
        return c0427Lh.d.h;
    }

    public static C1307ep i(C2866uh c2866uh, int i) {
        AbstractC2773td0 abstractC2773td0;
        C2866uh c2866uh2 = c2866uh.f;
        if (c2866uh2 == null) {
            return null;
        }
        C0427Lh c0427Lh = c2866uh2.d;
        if (i == 0) {
            abstractC2773td0 = c0427Lh.d;
        } else {
            abstractC2773td0 = c0427Lh.e;
        }
        int A = AbstractC0324Hi.A(c2866uh2.e);
        if (A != 1 && A != 2) {
            if (A != 3 && A != 4) {
                return null;
            }
            return abstractC2773td0.i;
        }
        return abstractC2773td0.h;
    }

    public final void c(C1307ep c1307ep, C1307ep c1307ep2, int i, C3224yp c3224yp) {
        c1307ep.l.add(c1307ep2);
        c1307ep.l.add(this.e);
        c1307ep.h = i;
        c1307ep.i = c3224yp;
        c1307ep2.k.add(c1307ep);
        c3224yp.k.add(c1307ep);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0427Lh c0427Lh = this.b;
            int i3 = c0427Lh.v;
            max = Math.max(c0427Lh.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0427Lh c0427Lh2 = this.b;
            int i4 = c0427Lh2.y;
            max = Math.max(c0427Lh2.x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        C3224yp c3224yp = this.e;
        if (c3224yp.j) {
            return c3224yp.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.a == 3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.C2866uh r12, defpackage.C2866uh r13, int r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2773td0.l(uh, uh, int):void");
    }
}
