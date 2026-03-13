package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: hg  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1549hg {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1549hg.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(AbstractC1549hg.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC1549hg(AbstractC2851uZ abstractC2851uZ) {
        this._prev = abstractC2851uZ;
    }

    public final void a() {
        c.lazySet(this, null);
    }

    public final AbstractC1549hg b() {
        Object obj = b.get(this);
        if (obj == AbstractC1522hL.g) {
            return null;
        }
        return (AbstractC1549hg) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC1549hg abstractC1549hg;
        AbstractC1549hg b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            AbstractC1549hg abstractC1549hg2 = (AbstractC1549hg) atomicReferenceFieldUpdater.get(this);
            while (abstractC1549hg2 != null && abstractC1549hg2.c()) {
                abstractC1549hg2 = (AbstractC1549hg) atomicReferenceFieldUpdater.get(abstractC1549hg2);
            }
            AbstractC1549hg b3 = b();
            Intrinsics.b(b3);
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                if (((AbstractC1549hg) obj) == null) {
                    abstractC1549hg = null;
                } else {
                    abstractC1549hg = abstractC1549hg2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, abstractC1549hg)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (abstractC1549hg2 != null) {
                b.set(abstractC1549hg2, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (abstractC1549hg2 == null || !abstractC1549hg2.c()) {
                    return;
                }
            }
        }
    }
}
