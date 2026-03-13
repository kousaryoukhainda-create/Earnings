package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes4.dex */
final class S implements InterfaceC1860z, j$.util.function.N, InterfaceC1716j {
    boolean a = false;
    long b;
    final /* synthetic */ K c;

    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }

    @Override // j$.util.A
    /* renamed from: d */
    public final void forEachRemaining(j$.util.function.N n) {
        Objects.requireNonNull(n);
        while (hasNext()) {
            n.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (e0.a) {
            e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.InterfaceC1860z, j$.util.InterfaceC1716j
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.N) {
            forEachRemaining((j$.util.function.N) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!e0.a) {
            while (hasNext()) {
                consumer.accept(Long.valueOf(nextLong()));
            }
            return;
        }
        e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(K k) {
        this.c = k;
    }

    @Override // j$.util.function.N
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.j(this);
        }
        return this.a;
    }

    @Override // j$.util.InterfaceC1860z
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
