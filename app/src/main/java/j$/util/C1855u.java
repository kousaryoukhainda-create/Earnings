package j$.util;

import j$.util.function.C1712z;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.u */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1855u implements PrimitiveIterator.OfInt {
    public final /* synthetic */ InterfaceC1856v a;

    private /* synthetic */ C1855u(InterfaceC1856v interfaceC1856v) {
        this.a = interfaceC1856v;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt b(InterfaceC1856v interfaceC1856v) {
        if (interfaceC1856v == null) {
            return null;
        }
        return interfaceC1856v instanceof C1854t ? ((C1854t) interfaceC1856v).a : new C1855u(interfaceC1856v);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1856v interfaceC1856v = this.a;
        if (obj instanceof C1855u) {
            obj = ((C1855u) obj).a;
        }
        return interfaceC1856v.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.a.c(C1712z.a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
