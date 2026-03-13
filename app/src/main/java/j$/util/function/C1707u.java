package j$.util.function;

import j$.util.function.Function;
/* renamed from: j$.util.function.u  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1707u implements java.util.function.Function {
    public final /* synthetic */ Function a;

    private /* synthetic */ C1707u(Function function) {
        this.a = function;
    }

    public static /* synthetic */ java.util.function.Function a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).a : function instanceof UnaryOperator ? t0.a((UnaryOperator) function) : new C1707u(function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return a(this.a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.a;
        if (obj instanceof C1707u) {
            obj = ((C1707u) obj).a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
