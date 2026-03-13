package j$.util.stream;

import j$.util.AbstractC1685d;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1792n1 implements Spliterator {
    J0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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
    public AbstractC1792n1(J0 j0) {
        this.a = j0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque f() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q = this.a.q();
        while (true) {
            q--;
            if (q < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(q));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static J0 b(ArrayDeque arrayDeque) {
        while (true) {
            J0 j0 = (J0) arrayDeque.pollFirst();
            if (j0 == null) {
                return null;
            }
            if (j0.q() == 0) {
                if (j0.count() > 0) {
                    return j0;
                }
            } else {
                for (int q = j0.q() - 1; q >= 0; q--) {
                    arrayDeque.addFirst(j0.a(q));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque f = f();
                this.e = f;
                J0 b = b(f);
                if (b != null) {
                    this.d = b.spliterator();
                    return true;
                }
                this.a = null;
                return false;
            }
            this.d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        J0 j0 = this.a;
        if (j0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < j0.q() - 1) {
            J0 j02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return j02.a(i).spliterator();
        }
        J0 a = this.a.a(this.b);
        this.a = a;
        if (a.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        J0 j03 = this.a;
        this.b = 1;
        return j03.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.q(); i++) {
            j += this.a.a(i).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
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
}
