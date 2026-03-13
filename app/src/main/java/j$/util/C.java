package j$.util;

import j$.util.function.C1698k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.Comparator;
import java.util.Spliterator;
/* loaded from: classes4.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ Spliterator.OfDouble a;

    private /* synthetic */ C(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ E b(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof D ? ((D) ofDouble).a : new C(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.E
    public final /* synthetic */ void e(InterfaceC1699l interfaceC1699l) {
        this.a.forEachRemaining(C1698k.a(interfaceC1699l));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfDouble) obj);
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

    @Override // j$.util.E
    public final /* synthetic */ boolean q(InterfaceC1699l interfaceC1699l) {
        return this.a.tryAdvance(C1698k.a(interfaceC1699l));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean t(Consumer consumer) {
        return this.a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ E trySplit() {
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
