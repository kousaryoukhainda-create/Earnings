package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.y */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1859y implements PrimitiveIterator.OfLong {
    public final /* synthetic */ InterfaceC1860z a;

    private /* synthetic */ C1859y(InterfaceC1860z interfaceC1860z) {
        this.a = interfaceC1860z;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong b(InterfaceC1860z interfaceC1860z) {
        if (interfaceC1860z == null) {
            return null;
        }
        return interfaceC1860z instanceof C1858x ? ((C1858x) interfaceC1860z).a : new C1859y(interfaceC1860z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1860z interfaceC1860z = this.a;
        if (obj instanceof C1859y) {
            obj = ((C1859y) obj).a;
        }
        return interfaceC1860z.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.a.d(j$.util.function.L.a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
