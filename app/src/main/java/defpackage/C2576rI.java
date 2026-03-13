package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: rI  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2576rI {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C2576rI.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C2576rI.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C2576rI.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r6 = ((defpackage.C1190dW) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r5.get(r4) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2576rI c() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C2576rI.c
            java.lang.Object r1 = r0.get(r9)
            rI r1 = (defpackage.C2576rI) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C2576rI.b
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.g()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof defpackage.AbstractC2241nQ
            if (r7 == 0) goto L38
            nQ r6 = (defpackage.AbstractC2241nQ) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof defpackage.C1190dW
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            dW r6 = (defpackage.C1190dW) r6
            rI r6 = r6.a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            rI r3 = (defpackage.C2576rI) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.c(r6, r4)
            r4 = r6
            rI r4 = (defpackage.C2576rI) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2576rI.c():rI");
    }

    public final void d(C2576rI c2576rI) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            C2576rI c2576rI2 = (C2576rI) atomicReferenceFieldUpdater.get(c2576rI);
            if (e() != c2576rI) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2576rI, c2576rI2, this)) {
                if (atomicReferenceFieldUpdater.get(c2576rI) != c2576rI2) {
                    break;
                }
            }
            if (g()) {
                c2576rI.c();
                return;
            }
            return;
        }
    }

    public final Object e() {
        while (true) {
            Object obj = b.get(this);
            if (!(obj instanceof AbstractC2241nQ)) {
                return obj;
            }
            ((AbstractC2241nQ) obj).a(this);
        }
    }

    public final C2576rI f() {
        C1190dW c1190dW;
        C2576rI c2576rI;
        Object e = e();
        if (e instanceof C1190dW) {
            c1190dW = (C1190dW) e;
        } else {
            c1190dW = null;
        }
        if (c1190dW == null || (c2576rI = c1190dW.a) == null) {
            Intrinsics.c(e, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C2576rI) e;
        }
        return c2576rI;
    }

    public boolean g() {
        return e() instanceof C1190dW;
    }

    public String toString() {
        return new LT(this, AbstractC2618rm.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC2618rm.x(this);
    }
}
