package j$.util.function;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.function.k */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1698k implements DoubleConsumer {
    public final /* synthetic */ InterfaceC1699l a;

    private /* synthetic */ C1698k(InterfaceC1699l interfaceC1699l) {
        this.a = interfaceC1699l;
    }

    public static /* synthetic */ DoubleConsumer a(InterfaceC1699l interfaceC1699l) {
        if (interfaceC1699l == null) {
            return null;
        }
        return interfaceC1699l instanceof C1697j ? ((C1697j) interfaceC1699l).a : new C1698k(interfaceC1699l);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.a.l(C1697j.a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1699l interfaceC1699l = this.a;
        if (obj instanceof C1698k) {
            obj = ((C1698k) obj).a;
        }
        return interfaceC1699l.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
