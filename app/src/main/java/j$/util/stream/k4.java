package j$.util.stream;

import j$.util.AbstractC1685d;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
abstract class k4 implements Spliterator {
    final Spliterator a;
    final AtomicBoolean b;
    boolean c;
    int d;

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1685d.k(this, i);
    }

    abstract Spliterator v(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public void a(Consumer consumer) {
        do {
        } while (t(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(Spliterator spliterator) {
        this.c = true;
        this.a = spliterator;
        this.b = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(Spliterator spliterator, k4 k4Var) {
        this.c = true;
        this.a = spliterator;
        this.b = k4Var.b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.a.trySplit();
        if (trySplit != null) {
            return v(trySplit);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }
}
