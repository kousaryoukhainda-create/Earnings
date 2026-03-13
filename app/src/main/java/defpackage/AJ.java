package defpackage;
/* renamed from: AJ  reason: default package */
/* loaded from: classes.dex */
public final class AJ extends Re0 {
    public final boolean n;
    public final D60 o;
    public final C60 p;
    public C3179yJ q;
    public C3093xJ r;
    public boolean s;
    public boolean t;
    public boolean u;

    public AJ(P9 p9, boolean z) {
        super(p9);
        boolean z2;
        if (z && p9.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.n = z2;
        this.o = new D60();
        this.p = new C60();
        E60 h = p9.h();
        if (h != null) {
            this.q = new C3179yJ(h, null, null);
            this.u = true;
            return;
        }
        this.q = new C3179yJ(new C3265zJ(p9.i()), D60.q, C3179yJ.e);
    }

    @Override // defpackage.Re0
    public final C1892jL B(C1892jL c1892jL) {
        Object obj = c1892jL.a;
        Object obj2 = this.q.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C3179yJ.e;
        }
        return c1892jL.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.Re0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.E60 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AJ.C(E60):void");
    }

    @Override // defpackage.Re0
    public final void E() {
        if (!this.n) {
            this.s = true;
            D();
        }
    }

    @Override // defpackage.P9
    /* renamed from: F */
    public final C3093xJ b(C1892jL c1892jL, C0172Bm c0172Bm, long j) {
        boolean z;
        C3093xJ c3093xJ = new C3093xJ(c1892jL, c0172Bm, j);
        if (c3093xJ.f == null) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        c3093xJ.f = this.m;
        if (this.t) {
            Object obj = this.q.d;
            Object obj2 = c1892jL.a;
            if (obj != null && obj2.equals(C3179yJ.e)) {
                obj2 = this.q.d;
            }
            c3093xJ.c(c1892jL.a(obj2));
        } else {
            this.r = c3093xJ;
            if (!this.s) {
                this.s = true;
                D();
            }
        }
        return c3093xJ;
    }

    public final boolean G(long j) {
        C3093xJ c3093xJ = this.r;
        int b = this.q.b(c3093xJ.b.a);
        if (b == -1) {
            return false;
        }
        C3179yJ c3179yJ = this.q;
        C60 c60 = this.p;
        c3179yJ.f(b, c60, false);
        long j2 = c60.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c3093xJ.i = j;
        return true;
    }

    @Override // defpackage.P9
    public final void p(InterfaceC1179dL interfaceC1179dL) {
        C3093xJ c3093xJ = (C3093xJ) interfaceC1179dL;
        if (c3093xJ.g != null) {
            P9 p9 = c3093xJ.f;
            p9.getClass();
            p9.p(c3093xJ.g);
        }
        if (interfaceC1179dL == this.r) {
            this.r = null;
        }
    }

    @Override // defpackage.AbstractC0606Sf, defpackage.P9
    public final void r() {
        this.t = false;
        this.s = false;
        super.r();
    }

    @Override // defpackage.Re0, defpackage.P9
    public final void u(VK vk) {
        if (this.u) {
            C3179yJ c3179yJ = this.q;
            this.q = new C3179yJ(new C2157mS(this.q.b, vk), c3179yJ.c, c3179yJ.d);
        } else {
            this.q = new C3179yJ(new C3265zJ(vk), D60.q, C3179yJ.e);
        }
        this.m.u(vk);
    }

    @Override // defpackage.AbstractC0606Sf, defpackage.P9
    public final void k() {
    }
}
