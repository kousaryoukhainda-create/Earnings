package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: Ri  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0583Ri extends Thread {
    public static final AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(C0583Ri.class, "workerCtl");
    public final De0 b;
    public final C2847uV c;
    public int d;
    public long f;
    public long g;
    public int h;
    public boolean i;
    private volatile int indexInArray;
    public final /* synthetic */ ExecutorC0609Si j;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [uV, java.lang.Object] */
    public C0583Ri(ExecutorC0609Si executorC0609Si, int i) {
        this.j = executorC0609Si;
        setDaemon(true);
        this.b = new De0();
        this.c = new Object();
        this.d = 4;
        this.nextParkedWorker = ExecutorC0609Si.m;
        AU.b.getClass();
        this.h = AU.c.a().nextInt();
        f(i);
    }

    public final K50 a(boolean z) {
        K50 e;
        K50 e2;
        ExecutorC0609Si executorC0609Si;
        long j;
        int i = this.d;
        boolean z2 = true;
        K50 k50 = null;
        De0 de0 = this.b;
        ExecutorC0609Si executorC0609Si2 = this.j;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0609Si.k;
            do {
                executorC0609Si = this.j;
                j = atomicLongFieldUpdater.get(executorC0609Si);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    de0.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = De0.b;
                        K50 k502 = (K50) atomicReferenceFieldUpdater.get(de0);
                        if (k502 != null && k502.c.a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(de0, k502, null)) {
                                if (atomicReferenceFieldUpdater.get(de0) != k502) {
                                    break;
                                }
                            }
                            k50 = k502;
                            break loop1;
                        }
                    }
                    int i2 = De0.d.get(de0);
                    int i3 = De0.c.get(de0);
                    while (true) {
                        if (i2 != i3 && De0.e.get(de0) != 0) {
                            i3--;
                            K50 c = de0.c(i3, true);
                            if (c != null) {
                                k50 = c;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (k50 == null) {
                        K50 k503 = (K50) executorC0609Si2.h.d();
                        if (k503 == null) {
                            return i(1);
                        }
                        return k503;
                    }
                    return k50;
                }
            } while (!ExecutorC0609Si.k.compareAndSet(executorC0609Si, j, j - 4398046511104L));
            this.d = 1;
        }
        if (z) {
            if (d(executorC0609Si2.b * 2) != 0) {
                z2 = false;
            }
            if (!z2 || (e2 = e()) == null) {
                de0.getClass();
                K50 k504 = (K50) De0.b.getAndSet(de0, null);
                if (k504 == null) {
                    k504 = de0.b();
                }
                if (k504 == null) {
                    if (!z2 && (e = e()) != null) {
                        return e;
                    }
                } else {
                    return k504;
                }
            } else {
                return e2;
            }
        } else {
            K50 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    public final K50 e() {
        int d = d(2);
        ExecutorC0609Si executorC0609Si = this.j;
        if (d == 0) {
            K50 k50 = (K50) executorC0609Si.g.d();
            if (k50 != null) {
                return k50;
            }
            return (K50) executorC0609Si.h.d();
        }
        K50 k502 = (K50) executorC0609Si.h.d();
        if (k502 != null) {
            return k502;
        }
        return (K50) executorC0609Si.g.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.j.f);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.d;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            ExecutorC0609Si.k.addAndGet(this.j, 4398046511104L);
        }
        if (i2 != i) {
            this.d = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.K50 i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0583Ri.i(int):K50");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0583Ri.run():void");
    }
}
