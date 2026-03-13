package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: sI  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2662sI {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2662sI.class, Object.class, "_cur");
    private volatile Object _cur = new C2834uI(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2834uI c2834uI = (C2834uI) atomicReferenceFieldUpdater.get(this);
            int a2 = c2834uI.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                C2834uI c = c2834uI.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2834uI, c) && atomicReferenceFieldUpdater.get(this) == c2834uI) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2834uI c2834uI = (C2834uI) atomicReferenceFieldUpdater.get(this);
            if (c2834uI.b()) {
                return;
            }
            C2834uI c = c2834uI.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2834uI, c) && atomicReferenceFieldUpdater.get(this) == c2834uI) {
            }
        }
    }

    public final int c() {
        C2834uI c2834uI = (C2834uI) a.get(this);
        c2834uI.getClass();
        long j = C2834uI.f.get(c2834uI);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2834uI c2834uI = (C2834uI) atomicReferenceFieldUpdater.get(this);
            Object d = c2834uI.d();
            if (d != C2834uI.g) {
                return d;
            }
            C2834uI c = c2834uI.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2834uI, c) && atomicReferenceFieldUpdater.get(this) == c2834uI) {
            }
        }
    }
}
