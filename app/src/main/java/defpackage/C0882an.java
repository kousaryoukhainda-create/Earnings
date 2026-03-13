package defpackage;

import java.io.IOException;
/* renamed from: an  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882an {
    public final C3026wb a;
    public final AbstractC2161mW b;
    public final C1365fa c;
    public final InterfaceC2101ll d;
    public final long e;
    public final long f;

    public C0882an(long j, AbstractC2161mW abstractC2161mW, C1365fa c1365fa, C3026wb c3026wb, long j2, InterfaceC2101ll interfaceC2101ll) {
        this.e = j;
        this.b = abstractC2161mW;
        this.c = c1365fa;
        this.f = j2;
        this.a = c3026wb;
        this.d = interfaceC2101ll;
    }

    public final C0882an a(long j, AbstractC2161mW abstractC2161mW) {
        long q;
        InterfaceC2101ll c = this.b.c();
        InterfaceC2101ll c2 = abstractC2161mW.c();
        if (c == null) {
            return new C0882an(j, abstractC2161mW, this.c, this.a, this.f, c);
        } else if (!c.w()) {
            return new C0882an(j, abstractC2161mW, this.c, this.a, this.f, c2);
        } else {
            long B = c.B(j);
            if (B == 0) {
                return new C0882an(j, abstractC2161mW, this.c, this.a, this.f, c2);
            }
            B10.w(c2);
            long y = c.y();
            long a = c.a(y);
            long j2 = B + y;
            long j3 = j2 - 1;
            long a2 = c.a(j3);
            long y2 = c2.y();
            long a3 = c2.a(y2);
            long j4 = this.f;
            int i = ((c.e(j3, j) + a2) > a3 ? 1 : ((c.e(j3, j) + a2) == a3 ? 0 : -1));
            if (i == 0) {
                q = (j2 - y2) + j4;
            } else if (i >= 0) {
                if (a3 < a) {
                    q = j4 - (c2.q(a, j) - y);
                } else {
                    q = (c.q(a3, j) - y2) + j4;
                }
            } else {
                throw new IOException();
            }
            return new C0882an(j, abstractC2161mW, this.c, this.a, q, c2);
        }
    }

    public final long b(long j) {
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        return interfaceC2101ll.h(this.e, j) + this.f;
    }

    public final long c(long j) {
        long b = b(j);
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        return (interfaceC2101ll.C(this.e, j) + b) - 1;
    }

    public final long d() {
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        return interfaceC2101ll.B(this.e);
    }

    public final long e(long j) {
        long f = f(j);
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        return interfaceC2101ll.e(j - this.f, this.e) + f;
    }

    public final long f(long j) {
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        return interfaceC2101ll.a(j - this.f);
    }

    public final boolean g(long j, long j2) {
        InterfaceC2101ll interfaceC2101ll = this.d;
        B10.w(interfaceC2101ll);
        if (interfaceC2101ll.w() || j2 == -9223372036854775807L || e(j) <= j2) {
            return true;
        }
        return false;
    }
}
