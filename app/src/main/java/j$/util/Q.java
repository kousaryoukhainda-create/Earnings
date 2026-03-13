package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes4.dex */
final class Q implements InterfaceC1856v, j$.util.function.B, InterfaceC1716j {
    boolean a = false;
    int b;
    final /* synthetic */ H c;

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    @Override // j$.util.A
    /* renamed from: c */
    public final void forEachRemaining(j$.util.function.B b) {
        Objects.requireNonNull(b);
        while (hasNext()) {
            b.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (e0.a) {
            e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.InterfaceC1856v, j$.util.InterfaceC1716j
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.B) {
            forEachRemaining((j$.util.function.B) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!e0.a) {
            while (hasNext()) {
                consumer.accept(Integer.valueOf(nextInt()));
            }
            return;
        }
        e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(H h) {
        this.c = h;
    }

    @Override // j$.util.function.B
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.g(this);
        }
        return this.a;
    }

    @Override // j$.util.InterfaceC1856v
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
