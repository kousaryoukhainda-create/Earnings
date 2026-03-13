package j$.util.function;

import java.util.function.DoubleBinaryOperator;
/* renamed from: j$.util.function.f  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1693f implements InterfaceC1695h {
    public final /* synthetic */ DoubleBinaryOperator a;

    private /* synthetic */ C1693f(DoubleBinaryOperator doubleBinaryOperator) {
        this.a = doubleBinaryOperator;
    }

    public static /* synthetic */ InterfaceC1695h a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C1694g ? ((C1694g) doubleBinaryOperator).a : new C1693f(doubleBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC1695h
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleBinaryOperator doubleBinaryOperator = this.a;
        if (obj instanceof C1693f) {
            obj = ((C1693f) obj).a;
        }
        return doubleBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
