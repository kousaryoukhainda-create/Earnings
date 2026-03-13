package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1787m1 extends AbstractC1792n1 {
    @Override // j$.util.Spliterator
    public final boolean t(Consumer consumer) {
        J0 b;
        if (h()) {
            boolean t = this.d.t(consumer);
            if (!t) {
                if (this.c == null && (b = AbstractC1792n1.b(this.e)) != null) {
                    Spliterator spliterator = b.spliterator();
                    this.d = spliterator;
                    return spliterator.t(consumer);
                }
                this.a = null;
            }
            return t;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque f = f();
                while (true) {
                    J0 b = AbstractC1792n1.b(f);
                    if (b != null) {
                        b.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                spliterator.a(consumer);
            }
        } else {
            do {
            } while (t(consumer));
        }
    }
}
