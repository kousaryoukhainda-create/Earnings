package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
/* renamed from: j$.util.t */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1854t implements InterfaceC1856v, InterfaceC1716j {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ C1854t(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ InterfaceC1856v b(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C1855u ? ((C1855u) ofInt).a : new C1854t(ofInt);
    }

    @Override // j$.util.InterfaceC1856v, j$.util.InterfaceC1716j
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.InterfaceC1856v
    public final /* synthetic */ void c(j$.util.function.B b) {
        this.a.forEachRemaining(j$.util.function.A.a(b));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.a;
        if (obj instanceof C1854t) {
            obj = ((C1854t) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.InterfaceC1856v, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.InterfaceC1856v
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
