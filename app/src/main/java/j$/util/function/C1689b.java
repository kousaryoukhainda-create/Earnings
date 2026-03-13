package j$.util.function;

import j$.util.function.BiFunction;
import j$.util.function.Function;
/* renamed from: j$.util.function.b  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1689b implements java.util.function.BiFunction {
    public final /* synthetic */ BiFunction a;

    private /* synthetic */ C1689b(BiFunction biFunction) {
        this.a = biFunction;
    }

    public static /* synthetic */ java.util.function.BiFunction a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).a : biFunction instanceof BinaryOperator ? C1692e.a((BinaryOperator) biFunction) : new C1689b(biFunction);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.a;
        if (obj instanceof C1689b) {
            obj = ((C1689b) obj).a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
