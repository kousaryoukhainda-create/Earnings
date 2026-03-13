package j$.util.function;

import j$.util.function.IntFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class C implements java.util.function.IntFunction {
    public final /* synthetic */ IntFunction a;

    private /* synthetic */ C(IntFunction intFunction) {
        this.a = intFunction;
    }

    public static /* synthetic */ java.util.function.IntFunction a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).a : new C(intFunction);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntFunction intFunction = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return intFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
