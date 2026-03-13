package j$.util.function;

import j$.util.function.BiFunction;
/* renamed from: j$.util.function.d */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1691d implements BinaryOperator {
    public final /* synthetic */ java.util.function.BinaryOperator a;

    private /* synthetic */ C1691d(java.util.function.BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ BinaryOperator a(java.util.function.BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C1692e ? ((C1692e) binaryOperator).a : new C1691d(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.a.andThen(C1707u.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.BinaryOperator binaryOperator = this.a;
        if (obj instanceof C1691d) {
            obj = ((C1691d) obj).a;
        }
        return binaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
