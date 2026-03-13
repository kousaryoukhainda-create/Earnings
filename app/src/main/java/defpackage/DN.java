package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: DN  reason: default package */
/* loaded from: classes2.dex */
public final class DN extends IZ implements AN {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(DN.class, Object.class, "owner");
    private volatile Object owner;

    public DN(boolean z) {
        super(z ? 1 : 0);
        C0754Xx c0754Xx;
        if (z) {
            c0754Xx = null;
        } else {
            c0754Xx = AbstractC2618rm.e;
        }
        this.owner = c0754Xx;
    }

    public final boolean c() {
        if (Math.max(IZ.f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(AbstractC3040wi frame) {
        boolean e = e(null);
        B90 b90 = B90.a;
        if (!e) {
            C1911jc V = AbstractC0867af0.V(B10.N(frame));
            try {
                a(new CN(this, V));
                Object r = V.r();
                EnumC0661Ui enumC0661Ui = EnumC0661Ui.b;
                if (r == enumC0661Ui) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (r != enumC0661Ui) {
                    r = b90;
                }
                if (r == enumC0661Ui) {
                    return r;
                }
                return b90;
            } catch (Throwable th) {
                V.z();
                throw th;
            }
        }
        return b90;
    }

    public final boolean e(Object obj) {
        int i;
        char c;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IZ.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                if (i2 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (!c()) {
                                c2 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != AbstractC2618rm.e) {
                                if (obj2 == obj) {
                                    c2 = 1;
                                } else {
                                    c2 = 2;
                                }
                            }
                        }
                        if (c2 != 1) {
                            if (c2 == 2) {
                                break;
                            }
                        } else {
                            c = 2;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c = 0;
                    break;
                }
            }
        }
        c = 1;
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0754Xx c0754Xx = AbstractC2618rm.e;
            if (obj2 != c0754Xx) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0754Xx)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC2618rm.x(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + ']';
    }
}
