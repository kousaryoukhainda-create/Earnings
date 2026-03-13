package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: De0  reason: default package */
/* loaded from: classes2.dex */
public final class De0 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(De0.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(De0.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(De0.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(De0.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray((int) UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final K50 a(K50 k50) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return k50;
        }
        if (k50.c.a == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, k50);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final K50 b() {
        K50 k50;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (k50 = (K50) this.a.getAndSet(i2, null)) != null) {
                if (k50.c.a == 1) {
                    e.decrementAndGet(this);
                }
                return k50;
            }
        }
    }

    public final K50 c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        K50 k50 = (K50) atomicReferenceArray.get(i2);
        if (k50 != null) {
            boolean z2 = true;
            if (k50.c.a != 1) {
                z2 = false;
            }
            if (z2 == z) {
                while (!atomicReferenceArray.compareAndSet(i2, k50, null)) {
                    if (atomicReferenceArray.get(i2) != k50) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return k50;
            }
        }
        return null;
    }
}
