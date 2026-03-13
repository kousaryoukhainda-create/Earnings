package com.applovin.impl;
/* loaded from: classes.dex */
public final class bl implements fd {
    private final l3 a;
    private boolean b;
    private long c;
    private long d;
    private ph f = ph.d;

    public bl(l3 l3Var) {
        this.a = l3Var;
    }

    @Override // com.applovin.impl.fd
    public ph a() {
        return this.f;
    }

    public void b() {
        if (!this.b) {
            this.d = this.a.c();
            this.b = true;
        }
    }

    public void c() {
        if (this.b) {
            a(p());
            this.b = false;
        }
    }

    @Override // com.applovin.impl.fd
    public long p() {
        long a;
        long j = this.c;
        if (this.b) {
            long c = this.a.c() - this.d;
            ph phVar = this.f;
            if (phVar.a == 1.0f) {
                a = t2.a(c);
            } else {
                a = phVar.a(c);
            }
            return j + a;
        }
        return j;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.c();
        }
    }

    @Override // com.applovin.impl.fd
    public void a(ph phVar) {
        if (this.b) {
            a(p());
        }
        this.f = phVar;
    }
}
