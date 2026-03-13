package j$.util;

import j$.util.function.C1698k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.PrimitiveIterator;
/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1722p implements r, InterfaceC1716j {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ C1722p(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ r b(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C1723q ? ((C1723q) ofDouble).a : new C1722p(ofDouble);
    }

    @Override // j$.util.r, j$.util.InterfaceC1716j
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.r
    public final /* synthetic */ void e(InterfaceC1699l interfaceC1699l) {
        this.a.forEachRemaining(C1698k.a(interfaceC1699l));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.a;
        if (obj instanceof C1722p) {
            obj = ((C1722p) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.r, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.r
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
