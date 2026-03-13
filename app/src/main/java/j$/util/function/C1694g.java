package j$.util.function;

import java.util.function.DoubleBinaryOperator;
/* renamed from: j$.util.function.g  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1694g implements DoubleBinaryOperator {
    public final /* synthetic */ InterfaceC1695h a;

    private /* synthetic */ C1694g(InterfaceC1695h interfaceC1695h) {
        this.a = interfaceC1695h;
    }

    public static /* synthetic */ DoubleBinaryOperator a(InterfaceC1695h interfaceC1695h) {
        if (interfaceC1695h == null) {
            return null;
        }
        return interfaceC1695h instanceof C1693f ? ((C1693f) interfaceC1695h).a : new C1694g(interfaceC1695h);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1695h interfaceC1695h = this.a;
        if (obj instanceof C1694g) {
            obj = ((C1694g) obj).a;
        }
        return interfaceC1695h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
