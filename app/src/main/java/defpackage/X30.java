package defpackage;

import android.os.SystemClock;
/* renamed from: X30  reason: default package */
/* loaded from: classes.dex */
public final class X30 implements InterfaceC1977kK {
    public final C2903v50 b;
    public boolean c;
    public long d;
    public long f;
    public YR g = YR.d;

    public X30(C2903v50 c2903v50) {
        this.b = c2903v50;
    }

    @Override // defpackage.InterfaceC1977kK
    public final void a(YR yr) {
        if (this.c) {
            d(b());
        }
        this.g = yr;
    }

    @Override // defpackage.InterfaceC1977kK
    public final long b() {
        long j;
        long j2 = this.d;
        if (this.c) {
            this.b.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
            YR yr = this.g;
            if (yr.a == 1.0f) {
                j = Ha0.M(elapsedRealtime);
            } else {
                j = elapsedRealtime * yr.c;
            }
            return j2 + j;
        }
        return j2;
    }

    @Override // defpackage.InterfaceC1977kK
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final void d(long j) {
        this.d = j;
        if (this.c) {
            this.b.getClass();
            this.f = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.InterfaceC1977kK
    public final YR e() {
        return this.g;
    }

    public final void f() {
        if (!this.c) {
            this.b.getClass();
            this.f = SystemClock.elapsedRealtime();
            this.c = true;
        }
    }
}
