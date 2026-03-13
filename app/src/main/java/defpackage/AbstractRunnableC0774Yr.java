package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: Yr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0774Yr implements Runnable, Comparable, InterfaceC0435Lp {
    private volatile Object _heap;
    public long b;
    public int c = -1;

    public AbstractRunnableC0774Yr(long j) {
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.b - ((AbstractRunnableC0774Yr) obj).b) > 0L ? 1 : ((this.b - ((AbstractRunnableC0774Yr) obj).b) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.InterfaceC0435Lp
    public final void dispose() {
        C0800Zr c0800Zr;
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0754Xx c0754Xx = AbstractC2870uj.c;
                if (obj == c0754Xx) {
                    return;
                }
                if (obj instanceof C0800Zr) {
                    c0800Zr = (C0800Zr) obj;
                } else {
                    c0800Zr = null;
                }
                if (c0800Zr != null) {
                    c0800Zr.c(this);
                }
                this._heap = c0754Xx;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2647s60 e() {
        Object obj = this._heap;
        if (obj instanceof C2647s60) {
            return (C2647s60) obj;
        }
        return null;
    }

    public final int f(long j, C0800Zr c0800Zr, AbstractC0892as abstractC0892as) {
        AbstractRunnableC0774Yr abstractRunnableC0774Yr;
        boolean z;
        synchronized (this) {
            if (this._heap == AbstractC2870uj.c) {
                return 2;
            }
            synchronized (c0800Zr) {
                AbstractRunnableC0774Yr[] abstractRunnableC0774YrArr = c0800Zr.a;
                if (abstractRunnableC0774YrArr != null) {
                    abstractRunnableC0774Yr = abstractRunnableC0774YrArr[0];
                } else {
                    abstractRunnableC0774Yr = null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0892as.i;
                abstractC0892as.getClass();
                if (AbstractC0892as.k.get(abstractC0892as) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (abstractRunnableC0774Yr == null) {
                    c0800Zr.c = j;
                } else {
                    long j2 = abstractRunnableC0774Yr.b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c0800Zr.c > 0) {
                        c0800Zr.c = j;
                    }
                }
                long j3 = this.b;
                long j4 = c0800Zr.c;
                if (j3 - j4 < 0) {
                    this.b = j4;
                }
                c0800Zr.a(this);
                return 0;
            }
        }
    }

    public final void g(C0800Zr c0800Zr) {
        if (this._heap != AbstractC2870uj.c) {
            this._heap = c0800Zr;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + ']';
    }
}
