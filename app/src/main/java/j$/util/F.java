package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
/* loaded from: classes4.dex */
public final /* synthetic */ class F implements H {
    public final /* synthetic */ Spliterator.OfInt a;

    private /* synthetic */ F(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ H b(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof G ? ((G) ofInt).a : new F(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.H
    public final /* synthetic */ void c(j$.util.function.B b) {
        this.a.forEachRemaining(j$.util.function.A.a(b));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.H
    public final /* synthetic */ boolean g(j$.util.function.B b) {
        return this.a.tryAdvance(j$.util.function.A.a(b));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean t(Consumer consumer) {
        return this.a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ H trySplit() {
        return b(this.a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.b(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.b(this.a.trySplit());
    }
}
