package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1782l1 extends AbstractC1792n1 implements j$.util.N {
    @Override // j$.util.N
    /* renamed from: tryAdvance */
    public final boolean q(Object obj) {
        I0 i0;
        if (h()) {
            boolean tryAdvance = ((j$.util.N) this.d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.c == null && (i0 = (I0) AbstractC1792n1.b(this.e)) != null) {
                    j$.util.N spliterator = i0.spliterator();
                    this.d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.a = null;
            }
            return tryAdvance;
        }
        return false;
    }

    @Override // j$.util.N
    /* renamed from: forEachRemaining */
    public final void e(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque f = f();
                while (true) {
                    I0 i0 = (I0) AbstractC1792n1.b(f);
                    if (i0 != null) {
                        i0.g(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.N) spliterator).forEachRemaining(obj);
            }
        } else {
            do {
            } while (q(obj));
        }
    }
}
