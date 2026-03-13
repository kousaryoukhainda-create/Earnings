package defpackage;

import java.util.Iterator;
/* renamed from: AB  reason: default package */
/* loaded from: classes.dex */
public final class AB extends AbstractC2773td0 {
    @Override // defpackage.InterfaceC0975bp
    public final void a(InterfaceC0975bp interfaceC0975bp) {
        H9 h9 = (H9) this.b;
        int i = h9.r0;
        C1307ep c1307ep = this.h;
        Iterator it = c1307ep.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1307ep) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            c1307ep.d(i2 + h9.t0);
        } else {
            c1307ep.d(i3 + h9.t0);
        }
    }

    @Override // defpackage.AbstractC2773td0
    public final void d() {
        C0427Lh c0427Lh = this.b;
        if (c0427Lh instanceof H9) {
            C1307ep c1307ep = this.h;
            c1307ep.b = true;
            H9 h9 = (H9) c0427Lh;
            int i = h9.r0;
            boolean z = h9.s0;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c1307ep.e = 7;
                            while (i2 < h9.q0) {
                                C0427Lh c0427Lh2 = h9.p0[i2];
                                if (z || c0427Lh2.f0 != 8) {
                                    C1307ep c1307ep2 = c0427Lh2.e.i;
                                    c1307ep2.k.add(c1307ep);
                                    c1307ep.l.add(c1307ep2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    c1307ep.e = 6;
                    while (i2 < h9.q0) {
                        C0427Lh c0427Lh3 = h9.p0[i2];
                        if (z || c0427Lh3.f0 != 8) {
                            C1307ep c1307ep3 = c0427Lh3.e.h;
                            c1307ep3.k.add(c1307ep);
                            c1307ep.l.add(c1307ep3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                c1307ep.e = 5;
                while (i2 < h9.q0) {
                    C0427Lh c0427Lh4 = h9.p0[i2];
                    if (z || c0427Lh4.f0 != 8) {
                        C1307ep c1307ep4 = c0427Lh4.d.i;
                        c1307ep4.k.add(c1307ep);
                        c1307ep.l.add(c1307ep4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            c1307ep.e = 4;
            while (i2 < h9.q0) {
                C0427Lh c0427Lh5 = h9.p0[i2];
                if (z || c0427Lh5.f0 != 8) {
                    C1307ep c1307ep5 = c0427Lh5.d.h;
                    c1307ep5.k.add(c1307ep);
                    c1307ep.l.add(c1307ep5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // defpackage.AbstractC2773td0
    public final void e() {
        C0427Lh c0427Lh = this.b;
        if (c0427Lh instanceof H9) {
            int i = ((H9) c0427Lh).r0;
            C1307ep c1307ep = this.h;
            if (i != 0 && i != 1) {
                c0427Lh.Y = c1307ep.g;
            } else {
                c0427Lh.X = c1307ep.g;
            }
        }
    }

    @Override // defpackage.AbstractC2773td0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.AbstractC2773td0
    public final boolean k() {
        return false;
    }

    public final void m(C1307ep c1307ep) {
        C1307ep c1307ep2 = this.h;
        c1307ep2.k.add(c1307ep);
        c1307ep.l.add(c1307ep2);
    }
}
