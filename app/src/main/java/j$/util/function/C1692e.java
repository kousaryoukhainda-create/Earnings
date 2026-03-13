package j$.util.function;

import j$.util.function.Function;
/* renamed from: j$.util.function.e */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1692e implements java.util.function.BinaryOperator {
    public final /* synthetic */ BinaryOperator a;

    private /* synthetic */ C1692e(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ java.util.function.BinaryOperator a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C1691d ? ((C1691d) binaryOperator).a : new C1692e(binaryOperator);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return C1689b.a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BinaryOperator binaryOperator = this.a;
        if (obj instanceof C1692e) {
            obj = ((C1692e) obj).a;
        }
        return binaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
