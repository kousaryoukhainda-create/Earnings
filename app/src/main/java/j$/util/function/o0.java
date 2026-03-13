package j$.util.function;

import java.util.function.ToIntFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements ToIntFunction {
    public final /* synthetic */ p0 a;

    private /* synthetic */ o0(p0 p0Var) {
        this.a = p0Var;
    }

    public static /* synthetic */ ToIntFunction a(p0 p0Var) {
        if (p0Var == null) {
            return null;
        }
        return p0Var instanceof n0 ? ((n0) p0Var).a : new o0(p0Var);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        p0 p0Var = this.a;
        if (obj instanceof o0) {
            obj = ((o0) obj).a;
        }
        return p0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
