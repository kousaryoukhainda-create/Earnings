package com.applovin.impl;

import com.applovin.impl.fo;
import com.applovin.impl.qh;
/* loaded from: classes.dex */
public abstract class d2 implements qh {
    protected final fo.d a = new fo.d();

    private int J() {
        int m = m();
        if (m == 1) {
            return 0;
        }
        return m;
    }

    @Override // com.applovin.impl.qh
    public final void B() {
        b(-F());
    }

    @Override // com.applovin.impl.qh
    public final void D() {
        if (!n().c() && !d()) {
            boolean L = L();
            if (N() && !y()) {
                if (L) {
                    Q();
                }
            } else if (L && getCurrentPosition() <= q()) {
                Q();
            } else {
                a(0L);
            }
        }
    }

    public final long G() {
        fo n = n();
        if (n.c()) {
            return -9223372036854775807L;
        }
        return n.a(t(), this.a).d();
    }

    public final int H() {
        fo n = n();
        if (n.c()) {
            return -1;
        }
        return n.a(t(), J(), r());
    }

    public final int I() {
        fo n = n();
        if (n.c()) {
            return -1;
        }
        return n.b(t(), J(), r());
    }

    public final boolean K() {
        if (H() != -1) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (I() != -1) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        fo n = n();
        if (!n.c() && n.a(t(), this.a).j) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        fo n = n();
        if (!n.c() && n.a(t(), this.a).e()) {
            return true;
        }
        return false;
    }

    public final void O() {
        c(t());
    }

    public final void P() {
        int H = H();
        if (H != -1) {
            c(H);
        }
    }

    public final void Q() {
        int I = I();
        if (I != -1) {
            c(I);
        }
    }

    @Override // com.applovin.impl.qh
    public final void a(long j) {
        a(t(), j);
    }

    @Override // com.applovin.impl.qh
    public final boolean b(int i) {
        return i().a(i);
    }

    public final void c(int i) {
        a(i, -9223372036854775807L);
    }

    @Override // com.applovin.impl.qh
    public final boolean isPlaying() {
        if (o() == 3 && l() && j() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.qh
    public final void u() {
        if (!n().c() && !d()) {
            if (K()) {
                P();
            } else if (N() && M()) {
                O();
            }
        }
    }

    @Override // com.applovin.impl.qh
    public final void w() {
        b(e());
    }

    @Override // com.applovin.impl.qh
    public final boolean y() {
        fo n = n();
        if (!n.c() && n.a(t(), this.a).i) {
            return true;
        }
        return false;
    }

    private void b(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0L));
    }

    public qh.b a(qh.b bVar) {
        boolean z = true;
        return new qh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d()).a(11, (!y() || d()) ? false : false).a();
    }
}
