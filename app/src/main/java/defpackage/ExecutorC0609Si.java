package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Si  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0609Si implements Executor, Closeable {
    public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(ExecutorC0609Si.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(ExecutorC0609Si.class, "controlState");
    public static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0609Si.class, "_isTerminated");
    public static final C0754Xx m = new C0754Xx("NOT_IN_STACK", 7);
    private volatile int _isTerminated;
    public final int b;
    public final int c;
    private volatile long controlState;
    public final long d;
    public final String f;
    public final XA g;
    public final XA h;
    public final C2762tW i;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r3v8, types: [sI, XA] */
    /* JADX WARN: Type inference failed for: r3v9, types: [sI, XA] */
    public ExecutorC0609Si(int i, int i2, String str, long j2) {
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.f = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j2 > 0) {
                        this.g = new C2662sI();
                        this.h = new C2662sI();
                        this.i = new C2762tW((i + 1) * 2);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(Kh0.g(j2, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(AbstractC2437ph.c(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(AbstractC0324Hi.d(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z;
        synchronized (this.i) {
            try {
                if (l.get(this) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = k;
                long j2 = atomicLongFieldUpdater.get(this);
                int i = (int) (j2 & 2097151);
                int i2 = i - ((int) ((j2 & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                if (i >= this.c) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.i.b(i3) == null) {
                    C0583Ri c0583Ri = new C0583Ri(this, i3);
                    this.i.c(i3, c0583Ri);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        c0583Ri.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, EI ei, boolean z) {
        K50 p50;
        boolean z2;
        long j2;
        C0583Ri c0583Ri;
        boolean a;
        int i;
        Q50.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof K50) {
            p50 = (K50) runnable;
            p50.b = nanoTime;
            p50.c = ei;
        } else {
            p50 = new P50(runnable, nanoTime, ei);
        }
        boolean z3 = false;
        if (p50.c.a == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        if (z2) {
            j2 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j2 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0583Ri) {
            c0583Ri = (C0583Ri) currentThread;
        } else {
            c0583Ri = null;
        }
        if (c0583Ri == null || !Intrinsics.a(c0583Ri.j, this)) {
            c0583Ri = null;
        }
        if (c0583Ri != null && (i = c0583Ri.d) != 5 && (p50.c.a != 0 || i != 2)) {
            c0583Ri.i = true;
            De0 de0 = c0583Ri.b;
            if (z) {
                p50 = de0.a(p50);
            } else {
                de0.getClass();
                K50 k50 = (K50) De0.b.getAndSet(de0, p50);
                if (k50 == null) {
                    p50 = null;
                } else {
                    p50 = de0.a(k50);
                }
            }
        }
        if (p50 != null) {
            if (p50.c.a == 1) {
                a = this.h.a(p50);
            } else {
                a = this.g.a(p50);
            }
            if (!a) {
                throw new RejectedExecutionException(AbstractC0324Hi.h(new StringBuilder(), this.f, " was terminated"));
            }
        }
        if (z && c0583Ri != null) {
            z3 = true;
        }
        if (z2) {
            if (!z3 && !h() && !f(j2)) {
                h();
            }
        } else if (!z3 && !h() && !f(atomicLongFieldUpdater.get(this))) {
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 == null) goto L46;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ExecutorC0609Si.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.C0583Ri
            r3 = 0
            if (r1 == 0) goto L18
            Ri r0 = (defpackage.C0583Ri) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            Si r1 = r0.j
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            tW r1 = r8.i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ExecutorC0609Si.k     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L77
            r1 = 1
        L37:
            tW r4 = r8.i
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.Intrinsics.b(r4)
            Ri r4 = (defpackage.C0583Ri) r4
            if (r4 == r0) goto L72
        L44:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L44
        L53:
            De0 r4 = r4.b
            XA r6 = r8.h
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.De0.b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            K50 r7 = (defpackage.K50) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            K50 r7 = r4.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r5) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            XA r1 = r8.h
            r1.b()
            XA r1 = r8.g
            r1.b()
        L81:
            if (r0 == 0) goto L89
            K50 r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            XA r1 = r8.g
            java.lang.Object r1 = r1.d()
            K50 r1 = (defpackage.K50) r1
            if (r1 != 0) goto Lb0
            XA r1 = r8.h
            java.lang.Object r1 = r1.d()
            K50 r1 = (defpackage.K50) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0609Si.j
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0609Si.k
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExecutorC0609Si.close():void");
    }

    public final void e(C0583Ri c0583Ri, int i, int i2) {
        while (true) {
            long j2 = j.get(this);
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = c0583Ri.c();
                    while (true) {
                        if (c == m) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            C0583Ri c0583Ri2 = (C0583Ri) c;
                            i3 = c0583Ri2.b();
                            if (i3 != 0) {
                                break;
                            }
                            c = c0583Ri2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (j.compareAndSet(this, j2, j3 | i3)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, Q50.g, false);
    }

    public final boolean f(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.b;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        C0754Xx c0754Xx;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long j2 = atomicLongFieldUpdater.get(this);
            C0583Ri c0583Ri = (C0583Ri) this.i.b((int) (2097151 & j2));
            if (c0583Ri == null) {
                c0583Ri = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = c0583Ri.c();
                while (true) {
                    c0754Xx = m;
                    if (c == c0754Xx) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        C0583Ri c0583Ri2 = (C0583Ri) c;
                        i = c0583Ri2.b();
                        if (i != 0) {
                            break;
                        }
                        c = c0583Ri2.c();
                    }
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i)) {
                    c0583Ri.g(c0754Xx);
                }
            }
            if (c0583Ri == null) {
                return false;
            }
            if (C0583Ri.k.compareAndSet(c0583Ri, -1, 0)) {
                LockSupport.unpark(c0583Ri);
                return true;
            }
        }
    }

    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        C2762tW c2762tW = this.i;
        int a = c2762tW.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            C0583Ri c0583Ri = (C0583Ri) c2762tW.b(i7);
            if (c0583Ri != null) {
                De0 de0 = c0583Ri.b;
                de0.getClass();
                if (De0.b.get(de0) != null) {
                    i = (De0.c.get(de0) - De0.d.get(de0)) + 1;
                } else {
                    i = De0.c.get(de0) - De0.d.get(de0);
                }
                int A = AbstractC0324Hi.A(c0583Ri.d);
                if (A != 0) {
                    if (A != 1) {
                        if (A != 2) {
                            if (A != 3) {
                                if (A == 4) {
                                    i6++;
                                }
                            } else {
                                i5++;
                                if (i > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i3++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i2++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j2 = k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f);
        sb4.append('@');
        sb4.append(AbstractC2618rm.x(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.b;
        sb4.append(i8);
        sb4.append(", max = ");
        AbstractC2437ph.u(sb4, this.c, "}, Worker States {CPU = ", i2, ", blocking = ");
        AbstractC2437ph.u(sb4, i3, ", parked = ", i4, ", dormant = ");
        AbstractC2437ph.u(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.g.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.h.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
