package j$.util.function;

import java.util.function.DoubleUnaryOperator;
/* renamed from: j$.util.function.s  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1705s {
    public final /* synthetic */ DoubleUnaryOperator a;

    private /* synthetic */ C1705s(DoubleUnaryOperator doubleUnaryOperator) {
        this.a = doubleUnaryOperator;
    }

    public static /* synthetic */ C1705s a(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return new C1705s(doubleUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleUnaryOperator doubleUnaryOperator = this.a;
        if (obj instanceof C1705s) {
            obj = ((C1705s) obj).a;
        }
        return doubleUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
