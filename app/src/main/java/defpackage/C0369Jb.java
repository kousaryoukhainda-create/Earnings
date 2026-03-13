package defpackage;

import java.util.ArrayList;
/* renamed from: Jb  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0369Jb implements InterfaceC2327oQ, Cloneable {
    public final L5 d;
    public int g;
    public C1938js h;
    public byte[] b = new byte[64];
    public int c = 0;
    public int f = 0;
    public int i = 0;

    public C0369Jb(L5 l5, int i) {
        this.d = l5;
        this.g = i;
        this.h = new C1938js(l5);
    }

    public final void A(int i) {
        if (i < 4) {
            B(i + 63);
        } else if (i < 256) {
            B(55);
            a(i);
        } else {
            B(196);
            B(55);
            o(i);
        }
    }

    public final void B(int i) {
        a(i);
        F(InterfaceC2327oQ.Y7[i]);
    }

    public final void C(int i, AbstractC2013kk abstractC2013kk) {
        abstractC2013kk.getClass();
        if (abstractC2013kk instanceof C2614rk) {
            if (abstractC2013kk != AbstractC2013kk.b && abstractC2013kk != AbstractC2013kk.c && abstractC2013kk != AbstractC2013kk.d && abstractC2013kk != AbstractC2013kk.e && abstractC2013kk != AbstractC2013kk.f) {
                if (abstractC2013kk == AbstractC2013kk.g) {
                    A(i);
                    return;
                } else if (abstractC2013kk == AbstractC2013kk.h) {
                    k(i);
                    return;
                } else if (abstractC2013kk == AbstractC2013kk.i) {
                    h(i);
                    return;
                } else {
                    throw new RuntimeException("void type?");
                }
            }
            u(i);
            return;
        }
        d(i);
    }

    public final Object D() {
        C0369Jb c0369Jb = (C0369Jb) super.clone();
        c0369Jb.b = (byte[]) this.b.clone();
        return c0369Jb;
    }

    public final byte[] E() {
        int i = this.c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, 0, bArr, 0, i);
        return bArr;
    }

    public final void F(int i) {
        int i2 = this.i + i;
        this.i = i2;
        if (i2 > this.f) {
            this.f = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [P5, me] */
    public final C2173me G() {
        int i = this.f;
        int i2 = this.g;
        byte[] E = E();
        C1938js c1938js = this.h;
        ?? p5 = new P5(this.d, "Code", (byte[]) null);
        p5.f = i;
        p5.g = i2;
        p5.d = E;
        p5.h = c1938js;
        p5.i = new ArrayList();
        return p5;
    }

    public final void H(int i, int i2) {
        if (i >= 0 && this.c > i) {
            this.b[i] = (byte) i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void I(int i, int i2) {
        H(i, i2 >> 8);
        H(i + 1, i2);
    }

    public final void a(int i) {
        l(1);
        this.b[this.c - 1] = (byte) i;
    }

    public final void c(int i) {
        if (i < 4) {
            B(i + 42);
        } else if (i < 256) {
            B(25);
            a(i);
        } else {
            B(196);
            B(25);
            o(i);
        }
    }

    public final Object clone() {
        try {
            C0369Jb c0369Jb = (C0369Jb) D();
            c0369Jb.h = (C1938js) this.h.clone();
            return c0369Jb;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(int i) {
        if (i < 4) {
            B(i + 75);
        } else if (i < 256) {
            B(58);
            a(i);
        } else {
            B(196);
            B(58);
            o(i);
        }
    }

    public final void e(double d) {
        if (d != 0.0d && d != 1.0d) {
            B(20);
            o(this.d.d(d));
            return;
        }
        B(((int) d) + 14);
    }

    public final void g(int i) {
        if (i < 4) {
            B(i + 38);
        } else if (i < 256) {
            B(24);
            a(i);
        } else {
            B(196);
            B(24);
            o(i);
        }
    }

    public final void h(int i) {
        if (i < 4) {
            B(i + 71);
        } else if (i < 256) {
            B(57);
            a(i);
        } else {
            B(196);
            B(57);
            o(i);
        }
    }

    public final void i(float f) {
        if (f != 0.0f && f != 1.0f && f != 2.0f) {
            w(this.d.f(f));
        } else {
            B(((int) f) + 11);
        }
    }

    public final void j(int i) {
        if (i < 4) {
            B(i + 34);
        } else if (i < 256) {
            B(23);
            a(i);
        } else {
            B(196);
            B(23);
            o(i);
        }
    }

    public final void k(int i) {
        if (i < 4) {
            B(i + 67);
        } else if (i < 256) {
            B(56);
            a(i);
        } else {
            B(196);
            B(56);
            o(i);
        }
    }

    public final void l(int i) {
        int i2 = this.c;
        int i3 = i2 + i;
        byte[] bArr = this.b;
        if (i3 > bArr.length) {
            int i4 = i2 << 1;
            if (i4 >= i3) {
                i3 = i4;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.b = bArr2;
        }
        this.c += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [mE, kh] */
    public final void m(int i) {
        if (i < 6 && -2 < i) {
            B(i + 3);
        } else if (i <= 127 && -128 <= i) {
            B(16);
            a(i);
        } else if (i <= 32767 && -32768 <= i) {
            B(17);
            a(i >> 8);
            a(i);
        } else {
            L5 l5 = this.d;
            ?? abstractC2007kh = new AbstractC2007kh(l5.a);
            abstractC2007kh.b = i;
            w(l5.g(abstractC2007kh));
        }
    }

    public final void n(int i) {
        if (i < 4) {
            B(i + 26);
        } else if (i < 256) {
            B(21);
            a(i);
        } else {
            B(196);
            B(21);
            o(i);
        }
    }

    public final void o(int i) {
        l(2);
        byte[] bArr = this.b;
        int i2 = this.c;
        bArr[i2 - 2] = (byte) (i >> 8);
        bArr[i2 - 1] = (byte) i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [IN, kh] */
    /* JADX WARN: Type inference failed for: r1v2, types: [IN, kh] */
    public final void p(String str, int i, String str2, boolean z) {
        int g;
        L5 l5 = this.d;
        if (z) {
            int j = l5.j(str);
            int j2 = l5.j(str2);
            ?? abstractC2007kh = new AbstractC2007kh(l5.a);
            abstractC2007kh.b = j;
            abstractC2007kh.c = j2;
            g = l5.g(new C2229nE(i, l5.g(abstractC2007kh), l5.a, 0));
        } else {
            int j3 = l5.j(str);
            int j4 = l5.j(str2);
            ?? abstractC2007kh2 = new AbstractC2007kh(l5.a);
            abstractC2007kh2.b = j3;
            abstractC2007kh2.c = j4;
            g = l5.g(new C2229nE(i, l5.g(abstractC2007kh2), l5.a, 1));
        }
        a(183);
        o(g);
        F(AbstractC0957bf.r(str2, true) - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [IN, kh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [IN, kh] */
    public final void q(AbstractC2013kk abstractC2013kk, String str, String str2) {
        boolean u;
        int g;
        if (abstractC2013kk == null) {
            u = false;
        } else {
            u = abstractC2013kk.u();
        }
        int b = this.d.b(abstractC2013kk);
        a(184);
        L5 l5 = this.d;
        if (u) {
            int j = l5.j(str);
            int j2 = l5.j(str2);
            ?? abstractC2007kh = new AbstractC2007kh(l5.a);
            abstractC2007kh.b = j;
            abstractC2007kh.c = j2;
            g = l5.g(new C2229nE(b, l5.g(abstractC2007kh), l5.a, 0));
        } else {
            int j3 = l5.j(str);
            int j4 = l5.j(str2);
            ?? abstractC2007kh2 = new AbstractC2007kh(l5.a);
            abstractC2007kh2.b = j3;
            abstractC2007kh2.c = j4;
            g = l5.g(new C2229nE(b, l5.g(abstractC2007kh2), l5.a, 1));
        }
        o(g);
        F(AbstractC0957bf.r(str2, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [IN, kh] */
    public final void r(String str, String str2, String str3) {
        int c = this.d.c(str);
        a(184);
        L5 l5 = this.d;
        int j = l5.j(str2);
        int j2 = l5.j(str3);
        ?? abstractC2007kh = new AbstractC2007kh(l5.a);
        abstractC2007kh.b = j;
        abstractC2007kh.c = j2;
        o(l5.g(new C2229nE(c, l5.g(abstractC2007kh), l5.a, 1)));
        F(AbstractC0957bf.r(str3, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [IN, kh] */
    public final void s(int i, String str, String str2) {
        a(182);
        L5 l5 = this.d;
        int j = l5.j(str);
        int j2 = l5.j(str2);
        ?? abstractC2007kh = new AbstractC2007kh(l5.a);
        abstractC2007kh.b = j;
        abstractC2007kh.c = j2;
        o(l5.g(new C2229nE(i, l5.g(abstractC2007kh), l5.a, 1)));
        F(AbstractC0957bf.r(str2, true) - 1);
    }

    public final void u(int i) {
        if (i < 4) {
            B(i + 59);
        } else if (i < 256) {
            B(54);
            a(i);
        } else {
            B(196);
            B(54);
            o(i);
        }
    }

    public final void v(long j) {
        if (j != 0 && j != 1) {
            B(20);
            o(this.d.i(j));
            return;
        }
        B(((int) j) + 9);
    }

    public final void w(int i) {
        if (i > 255) {
            B(19);
            o(i);
            return;
        }
        B(18);
        a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [u40, kh] */
    public final void x(String str) {
        L5 l5 = this.d;
        int j = l5.j(str);
        ?? abstractC2007kh = new AbstractC2007kh(l5.a);
        abstractC2007kh.b = j;
        w(l5.g(abstractC2007kh));
    }

    public final void y(int i) {
        if (i < 4) {
            B(i + 30);
        } else if (i < 256) {
            B(22);
            a(i);
        } else {
            B(196);
            B(22);
            o(i);
        }
    }

    public final int z(int i, AbstractC2013kk abstractC2013kk) {
        abstractC2013kk.getClass();
        if (abstractC2013kk instanceof C2614rk) {
            if (abstractC2013kk != AbstractC2013kk.b && abstractC2013kk != AbstractC2013kk.c && abstractC2013kk != AbstractC2013kk.d && abstractC2013kk != AbstractC2013kk.e && abstractC2013kk != AbstractC2013kk.f) {
                if (abstractC2013kk == AbstractC2013kk.g) {
                    y(i);
                    return 2;
                } else if (abstractC2013kk == AbstractC2013kk.h) {
                    j(i);
                    return 1;
                } else if (abstractC2013kk == AbstractC2013kk.i) {
                    g(i);
                    return 2;
                } else {
                    throw new RuntimeException("void type?");
                }
            }
            n(i);
            return 1;
        }
        c(i);
        return 1;
    }
}
