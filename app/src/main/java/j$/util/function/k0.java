package j$.util.function;

import java.util.function.ToDoubleFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements m0 {
    public final /* synthetic */ ToDoubleFunction a;

    private /* synthetic */ k0(ToDoubleFunction toDoubleFunction) {
        this.a = toDoubleFunction;
    }

    public static /* synthetic */ m0 a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof l0 ? ((l0) toDoubleFunction).a : new k0(toDoubleFunction);
    }

    @Override // j$.util.function.m0
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.a;
        if (obj instanceof k0) {
            obj = ((k0) obj).a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
