package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: BZ  reason: default package */
/* loaded from: classes2.dex */
public abstract class BZ {
    public static final C2765tZ a = new C2765tZ(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(C2765tZ segment) {
        int i;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f == null && segment.g == null) {
            if (segment.d) {
                return;
            }
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
            C2765tZ c2765tZ = a;
            C2765tZ c2765tZ2 = (C2765tZ) atomicReference.getAndSet(c2765tZ);
            if (c2765tZ2 == c2765tZ) {
                return;
            }
            if (c2765tZ2 != null) {
                i = c2765tZ2.c;
            } else {
                i = 0;
            }
            if (i >= 65536) {
                atomicReference.set(c2765tZ2);
                return;
            }
            segment.f = c2765tZ2;
            segment.b = 0;
            segment.c = i + 8192;
            atomicReference.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final C2765tZ b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        C2765tZ c2765tZ = a;
        C2765tZ c2765tZ2 = (C2765tZ) atomicReference.getAndSet(c2765tZ);
        if (c2765tZ2 == c2765tZ) {
            return new C2765tZ();
        }
        if (c2765tZ2 == null) {
            atomicReference.set(null);
            return new C2765tZ();
        }
        atomicReference.set(c2765tZ2.f);
        c2765tZ2.f = null;
        c2765tZ2.c = 0;
        return c2765tZ2;
    }
}
