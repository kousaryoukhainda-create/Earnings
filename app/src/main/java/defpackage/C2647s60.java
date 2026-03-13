package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: s60  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2647s60 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C2647s60.class, "_size");
    private volatile int _size;
    public AbstractRunnableC0774Yr[] a;

    public final void a(AbstractRunnableC0774Yr abstractRunnableC0774Yr) {
        abstractRunnableC0774Yr.g((C0800Zr) this);
        AbstractRunnableC0774Yr[] abstractRunnableC0774YrArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (abstractRunnableC0774YrArr == null) {
            abstractRunnableC0774YrArr = new AbstractRunnableC0774Yr[4];
            this.a = abstractRunnableC0774YrArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0774YrArr.length) {
            Object[] copyOf = Arrays.copyOf(abstractRunnableC0774YrArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            abstractRunnableC0774YrArr = (AbstractRunnableC0774Yr[]) copyOf;
            this.a = abstractRunnableC0774YrArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0774YrArr[i] = abstractRunnableC0774Yr;
        abstractRunnableC0774Yr.c = i;
        e(i);
    }

    public final AbstractRunnableC0774Yr b() {
        AbstractRunnableC0774Yr abstractRunnableC0774Yr;
        synchronized (this) {
            AbstractRunnableC0774Yr[] abstractRunnableC0774YrArr = this.a;
            if (abstractRunnableC0774YrArr != null) {
                abstractRunnableC0774Yr = abstractRunnableC0774YrArr[0];
            } else {
                abstractRunnableC0774Yr = null;
            }
        }
        return abstractRunnableC0774Yr;
    }

    public final void c(AbstractRunnableC0774Yr abstractRunnableC0774Yr) {
        synchronized (this) {
            if (abstractRunnableC0774Yr.e() != null) {
                d(abstractRunnableC0774Yr.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractRunnableC0774Yr d(int r9) {
        /*
            r8 = this;
            Yr[] r0 = r8.a
            kotlin.jvm.internal.Intrinsics.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C2647s60.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            Yr[] r5 = r8.a
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.b(r9)
            r2 = 0
            r9.g(r2)
            r9.c = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2647s60.d(int):Yr");
    }

    public final void e(int i) {
        while (i > 0) {
            AbstractRunnableC0774Yr[] abstractRunnableC0774YrArr = this.a;
            Intrinsics.b(abstractRunnableC0774YrArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0774Yr abstractRunnableC0774Yr = abstractRunnableC0774YrArr[i2];
            Intrinsics.b(abstractRunnableC0774Yr);
            AbstractRunnableC0774Yr abstractRunnableC0774Yr2 = abstractRunnableC0774YrArr[i];
            Intrinsics.b(abstractRunnableC0774Yr2);
            if (abstractRunnableC0774Yr.compareTo(abstractRunnableC0774Yr2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        AbstractRunnableC0774Yr[] abstractRunnableC0774YrArr = this.a;
        Intrinsics.b(abstractRunnableC0774YrArr);
        AbstractRunnableC0774Yr abstractRunnableC0774Yr = abstractRunnableC0774YrArr[i2];
        Intrinsics.b(abstractRunnableC0774Yr);
        AbstractRunnableC0774Yr abstractRunnableC0774Yr2 = abstractRunnableC0774YrArr[i];
        Intrinsics.b(abstractRunnableC0774Yr2);
        abstractRunnableC0774YrArr[i] = abstractRunnableC0774Yr;
        abstractRunnableC0774YrArr[i2] = abstractRunnableC0774Yr2;
        abstractRunnableC0774Yr.c = i;
        abstractRunnableC0774Yr2.c = i2;
    }
}
