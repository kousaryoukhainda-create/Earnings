package defpackage;
/* renamed from: bs  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0978bs extends AbstractC0531Pi {
    public static final /* synthetic */ int h = 0;
    public long d;
    public boolean f;
    public W4 g;

    public final void h(boolean z) {
        long j;
        long j2 = this.d;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.d = j3;
        if (j3 <= 0 && this.f) {
            shutdown();
        }
    }

    public abstract Thread i();

    public final void j(boolean z) {
        long j;
        long j2 = this.d;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.d = j + j2;
        if (!z) {
            this.f = true;
        }
    }

    public abstract long k();

    public final boolean l() {
        Object removeFirst;
        W4 w4 = this.g;
        if (w4 == null) {
            return false;
        }
        if (w4.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = w4.removeFirst();
        }
        AbstractC0305Gp abstractC0305Gp = (AbstractC0305Gp) removeFirst;
        if (abstractC0305Gp == null) {
            return false;
        }
        abstractC0305Gp.run();
        return true;
    }

    public void m(long j, AbstractRunnableC0774Yr abstractRunnableC0774Yr) {
        RunnableC2105ln.l.t(j, abstractRunnableC0774Yr);
    }

    public abstract void shutdown();
}
