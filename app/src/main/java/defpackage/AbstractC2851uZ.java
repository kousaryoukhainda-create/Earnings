package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: uZ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2851uZ extends AbstractC1549hg implements InterfaceC2840uO {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(AbstractC2851uZ.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long d;

    public AbstractC2851uZ(long j, AbstractC2851uZ abstractC2851uZ, int i) {
        super(abstractC2851uZ);
        this.d = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // defpackage.AbstractC1549hg
    public final boolean c() {
        if (f.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC0428Li interfaceC0428Li);

    public final void h() {
        if (f.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
