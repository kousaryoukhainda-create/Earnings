package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: dF  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1173dF extends C2576rI implements InterfaceC0435Lp, BD, Function1 {
    public C2230nF f;

    @Override // defpackage.BD
    public final C2668sO b() {
        return null;
    }

    @Override // defpackage.InterfaceC0435Lp
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        C2230nF h = h();
        while (true) {
            Object x = h.x();
            if (x instanceof AbstractC1173dF) {
                if (x == this) {
                    C2539qr c2539qr = AbstractC1424g90.i;
                    do {
                        atomicReferenceFieldUpdater2 = C2230nF.b;
                        if (atomicReferenceFieldUpdater2.compareAndSet(h, x, c2539qr)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(h) == x);
                } else {
                    return;
                }
            } else if (!(x instanceof BD) || ((BD) x).b() == null) {
                return;
            } else {
                while (true) {
                    Object e = e();
                    if (e instanceof C1190dW) {
                        C2576rI c2576rI = ((C1190dW) e).a;
                        return;
                    } else if (e == this) {
                        C2576rI c2576rI2 = (C2576rI) e;
                        return;
                    } else {
                        Intrinsics.c(e, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        C2576rI c2576rI3 = (C2576rI) e;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2576rI.d;
                        C1190dW c1190dW = (C1190dW) atomicReferenceFieldUpdater3.get(c2576rI3);
                        if (c1190dW == null) {
                            c1190dW = new C1190dW(c2576rI3);
                            atomicReferenceFieldUpdater3.lazySet(c2576rI3, c1190dW);
                        }
                        do {
                            atomicReferenceFieldUpdater = C2576rI.b;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, e, c1190dW)) {
                                c2576rI3.c();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == e);
                    }
                }
            }
        }
    }

    public YE getParent() {
        return h();
    }

    public final C2230nF h() {
        C2230nF c2230nF = this.f;
        if (c2230nF != null) {
            return c2230nF;
        }
        Intrinsics.f("job");
        throw null;
    }

    public abstract void i(Throwable th);

    @Override // defpackage.BD
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.C2576rI
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2618rm.x(this) + "[job@" + AbstractC2618rm.x(h()) + ']';
    }
}
