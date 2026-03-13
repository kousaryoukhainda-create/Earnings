package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1858x implements InterfaceC1860z, InterfaceC1716j {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ C1858x(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ InterfaceC1860z b(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C1859y ? ((C1859y) ofLong).a : new C1858x(ofLong);
    }

    @Override // j$.util.InterfaceC1860z, j$.util.InterfaceC1716j
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.InterfaceC1860z
    public final /* synthetic */ void d(j$.util.function.N n) {
        this.a.forEachRemaining(j$.util.function.M.a(n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.a;
        if (obj instanceof C1858x) {
            obj = ((C1858x) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.InterfaceC1860z, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.InterfaceC1860z
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
