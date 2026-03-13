package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes4.dex */
final class T implements r, InterfaceC1699l, InterfaceC1716j {
    boolean a = false;
    double b;
    final /* synthetic */ E c;

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return j$.com.android.tools.r8.a.a(this, interfaceC1699l);
    }

    @Override // j$.util.A
    /* renamed from: e */
    public final void forEachRemaining(InterfaceC1699l interfaceC1699l) {
        Objects.requireNonNull(interfaceC1699l);
        while (hasNext()) {
            interfaceC1699l.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (e0.a) {
            e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.r, j$.util.InterfaceC1716j
    public final void a(Consumer consumer) {
        if (consumer instanceof InterfaceC1699l) {
            forEachRemaining((InterfaceC1699l) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!e0.a) {
            while (hasNext()) {
                consumer.accept(Double.valueOf(nextDouble()));
            }
            return;
        }
        e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(E e) {
        this.c = e;
    }

    @Override // j$.util.function.InterfaceC1699l
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.q(this);
        }
        return this.a;
    }

    @Override // j$.util.r
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
