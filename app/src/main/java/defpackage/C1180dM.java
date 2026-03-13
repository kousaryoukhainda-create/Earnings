package defpackage;

import androidx.media3.common.b;
import java.util.List;
/* renamed from: dM  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180dM implements InterfaceC1225dt {
    public final InterfaceC1225dt a;
    public final I70 b;

    public C1180dM(InterfaceC1225dt interfaceC1225dt, I70 i70) {
        this.a = interfaceC1225dt;
        this.b = i70;
    }

    @Override // defpackage.InterfaceC1225dt
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.InterfaceC1225dt
    public final void b(long j, long j2, long j3, List list, InterfaceC1891jK[] interfaceC1891jKArr) {
        this.a.b(j, j2, j3, list, interfaceC1891jKArr);
    }

    @Override // defpackage.InterfaceC1225dt
    public final int c(b bVar) {
        return this.a.u(this.b.b(bVar));
    }

    @Override // defpackage.InterfaceC1225dt
    public final I70 d() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1225dt
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180dM)) {
            return false;
        }
        C1180dM c1180dM = (C1180dM) obj;
        if (this.a.equals(c1180dM.a) && this.b.equals(c1180dM.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC1225dt
    public final boolean f(long j, AbstractC3202yd abstractC3202yd, List list) {
        return this.a.f(j, abstractC3202yd, list);
    }

    @Override // defpackage.InterfaceC1225dt
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.InterfaceC1225dt
    public final b h(int i) {
        return this.b.d[this.a.j(i)];
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.InterfaceC1225dt
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.InterfaceC1225dt
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override // defpackage.InterfaceC1225dt
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int m() {
        return this.a.m();
    }

    @Override // defpackage.InterfaceC1225dt
    public final b n() {
        return this.b.d[this.a.m()];
    }

    @Override // defpackage.InterfaceC1225dt
    public final int o() {
        return this.a.o();
    }

    @Override // defpackage.InterfaceC1225dt
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override // defpackage.InterfaceC1225dt
    public final void q(float f) {
        this.a.q(f);
    }

    @Override // defpackage.InterfaceC1225dt
    public final Object r() {
        return this.a.r();
    }

    @Override // defpackage.InterfaceC1225dt
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.InterfaceC1225dt
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int u(int i) {
        return this.a.u(i);
    }
}
