package com.applovin.impl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g6 implements fd {
    private final bl a;
    private final a b;
    private qi c;
    private fd d;
    private boolean f = true;
    private boolean g;

    /* loaded from: classes.dex */
    public interface a {
        void a(ph phVar);
    }

    public g6(a aVar, l3 l3Var) {
        this.b = aVar;
        this.a = new bl(l3Var);
    }

    @Override // com.applovin.impl.fd
    public ph a() {
        fd fdVar = this.d;
        if (fdVar != null) {
            return fdVar.a();
        }
        return this.a.a();
    }

    public void b(qi qiVar) {
        fd fdVar;
        fd l = qiVar.l();
        if (l == null || l == (fdVar = this.d)) {
            return;
        }
        if (fdVar == null) {
            this.d = l;
            this.c = qiVar;
            l.a(this.a.a());
            return;
        }
        throw z7.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void c() {
        this.g = false;
        this.a.c();
    }

    @Override // com.applovin.impl.fd
    public long p() {
        if (this.f) {
            return this.a.p();
        }
        return ((fd) b1.a(this.d)).p();
    }

    private void c(boolean z) {
        if (a(z)) {
            this.f = true;
            if (this.g) {
                this.a.b();
                return;
            }
            return;
        }
        fd fdVar = (fd) b1.a(this.d);
        long p = fdVar.p();
        if (this.f) {
            if (p < this.a.p()) {
                this.a.c();
                return;
            }
            this.f = false;
            if (this.g) {
                this.a.b();
            }
        }
        this.a.a(p);
        ph a2 = fdVar.a();
        if (a2.equals(this.a.a())) {
            return;
        }
        this.a.a(a2);
        this.b.a(a2);
    }

    public void a(qi qiVar) {
        if (qiVar == this.c) {
            this.d = null;
            this.c = null;
            this.f = true;
        }
    }

    public void b() {
        this.g = true;
        this.a.b();
    }

    public void a(long j) {
        this.a.a(j);
    }

    @Override // com.applovin.impl.fd
    public void a(ph phVar) {
        fd fdVar = this.d;
        if (fdVar != null) {
            fdVar.a(phVar);
            phVar = this.d.a();
        }
        this.a.a(phVar);
    }

    public long b(boolean z) {
        c(z);
        return p();
    }

    private boolean a(boolean z) {
        qi qiVar = this.c;
        return qiVar == null || qiVar.c() || (!this.c.d() && (z || this.c.j()));
    }
}
