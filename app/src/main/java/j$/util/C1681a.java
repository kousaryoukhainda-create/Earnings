package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1681a implements Spliterator {
    private final java.util.List a;
    private int b;
    private int c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1685d.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1685d.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1681a(java.util.List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    private C1681a(C1681a c1681a, int i, int i2) {
        this.a = c1681a.a;
        this.b = i;
        this.c = i2;
    }

    private int b() {
        int i = this.c;
        if (i < 0) {
            int size = this.a.size();
            this.c = size;
            return size;
        }
        return i;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int b = b();
        int i = this.b;
        int i2 = (b + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C1681a(this, i, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean t(Consumer consumer) {
        consumer.getClass();
        int b = b();
        int i = this.b;
        if (i < b) {
            this.b = i + 1;
            try {
                consumer.accept(this.a.get(i));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int b = b();
        this.b = b;
        for (int i = this.b; i < b; i++) {
            try {
                consumer.accept(this.a.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return b() - this.b;
    }
}
