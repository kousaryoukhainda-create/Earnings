package j$.util.function;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.function.j  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1697j implements InterfaceC1699l {
    public final /* synthetic */ DoubleConsumer a;

    private /* synthetic */ C1697j(DoubleConsumer doubleConsumer) {
        this.a = doubleConsumer;
    }

    public static /* synthetic */ InterfaceC1699l a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C1698k ? ((C1698k) doubleConsumer).a : new C1697j(doubleConsumer);
    }

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleConsumer doubleConsumer = this.a;
        if (obj instanceof C1697j) {
            obj = ((C1697j) obj).a;
        }
        return doubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return a(this.a.andThen(C1698k.a(interfaceC1699l)));
    }
}
