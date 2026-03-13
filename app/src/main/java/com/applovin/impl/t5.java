package com.applovin.impl;
/* loaded from: classes.dex */
public class t5 implements s4 {
    private final long b = -9223372036854775807L;
    private final long a = -9223372036854775807L;
    private final boolean c = false;

    @Override // com.applovin.impl.s4
    public boolean a(qh qhVar) {
        qhVar.u();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean b(qh qhVar) {
        qhVar.b();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean c(qh qhVar) {
        if (!this.c) {
            qhVar.B();
            return true;
        } else if (b() && qhVar.y()) {
            a(qhVar, -this.a);
            return true;
        } else {
            return true;
        }
    }

    @Override // com.applovin.impl.s4
    public boolean d(qh qhVar) {
        if (!this.c) {
            qhVar.w();
            return true;
        } else if (a() && qhVar.y()) {
            a(qhVar, this.b);
            return true;
        } else {
            return true;
        }
    }

    @Override // com.applovin.impl.s4
    public boolean e(qh qhVar) {
        qhVar.D();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a(qh qhVar, int i, long j) {
        qhVar.a(i, j);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean b(qh qhVar, boolean z) {
        qhVar.a(z);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a(qh qhVar, int i) {
        qhVar.a(i);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean b() {
        return !this.c || this.a > 0;
    }

    @Override // com.applovin.impl.s4
    public boolean a(qh qhVar, boolean z) {
        qhVar.b(z);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a() {
        return !this.c || this.b > 0;
    }

    private static void a(qh qhVar, long j) {
        long currentPosition = qhVar.getCurrentPosition() + j;
        long duration = qhVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        qhVar.a(Math.max(currentPosition, 0L));
    }
}
