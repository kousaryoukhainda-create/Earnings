package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: uI  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2834uI {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C2834uI.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C2834uI.class, "_state");
    public static final C0754Xx g = new C0754Xx("REMOVE_FROZEN", 7);
    private volatile Object _next;
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    public C2834uI(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.C2834uI.f
            long r2 = r6.get(r14)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r4 = 1
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto L18
            r4 = 2
        L18:
            return r4
        L19:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r2
            r0 = 30
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r5 = r10 + 2
            int r9 = r14.c
            r5 = r5 & r9
            r11 = r1 & r9
            if (r5 != r11) goto L32
            return r4
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.d
            boolean r5 = r14.b
            r12 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L51
            r5 = r10 & r9
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.a
            if (r2 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r12
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r4
        L51:
            int r1 = r10 + 1
            r1 = r1 & r12
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r1
            long r0 = r12 << r0
            long r4 = r4 | r0
            r0 = r6
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r9
            r11.set(r0, r15)
            r0 = r14
        L6c:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L95
            uI r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof defpackage.C2748tI
            if (r4 == 0) goto L92
            tI r3 = (defpackage.C2748tI) r3
            int r3 = r3.a
            if (r3 != r10) goto L92
            r1.set(r2, r15)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 != 0) goto L6c
        L95:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2834uI.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final C2834uI c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C2834uI c2834uI = (C2834uI) atomicReferenceFieldUpdater.get(this);
            if (c2834uI != null) {
                return c2834uI;
            }
            C2834uI c2834uI2 = new C2834uI(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new C2748tI(i);
                }
                c2834uI2.d.set(c2834uI2.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(c2834uI2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2834uI2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            int i4 = i & i3;
            if ((i2 & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = this.b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else if (obj instanceof C2748tI) {
                return null;
            } else {
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                } else if (z) {
                    C2834uI c2834uI = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j3 = atomicLongFieldUpdater2.get(c2834uI);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c2834uI = c2834uI.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c2834uI, j3, (j3 & (-1073741824)) | j2)) {
                                c2834uI.d.set(c2834uI.c & i5, null);
                                c2834uI = null;
                            } else {
                                continue;
                            }
                        }
                        if (c2834uI == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
