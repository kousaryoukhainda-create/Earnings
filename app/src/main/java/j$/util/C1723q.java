package j$.util;

import j$.util.function.C1697j;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.q */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1723q implements PrimitiveIterator.OfDouble {
    public final /* synthetic */ r a;

    private /* synthetic */ C1723q(r rVar) {
        this.a = rVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble b(r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar instanceof C1722p ? ((C1722p) rVar).a : new C1723q(rVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.a;
        if (obj instanceof C1723q) {
            obj = ((C1723q) obj).a;
        }
        return rVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.a.e(C1697j.a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
