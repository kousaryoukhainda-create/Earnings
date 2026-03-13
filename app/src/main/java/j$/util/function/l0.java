package j$.util.function;

import java.util.function.ToDoubleFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements ToDoubleFunction {
    public final /* synthetic */ m0 a;

    private /* synthetic */ l0(m0 m0Var) {
        this.a = m0Var;
    }

    public static /* synthetic */ ToDoubleFunction a(m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return m0Var instanceof k0 ? ((k0) m0Var).a : new l0(m0Var);
    }

    @Override // java.util.function.ToDoubleFunction
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        m0 m0Var = this.a;
        if (obj instanceof l0) {
            obj = ((l0) obj).a;
        }
        return m0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
