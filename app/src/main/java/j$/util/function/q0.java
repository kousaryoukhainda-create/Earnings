package j$.util.function;

import java.util.function.ToLongFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements s0 {
    public final /* synthetic */ ToLongFunction a;

    private /* synthetic */ q0(ToLongFunction toLongFunction) {
        this.a = toLongFunction;
    }

    public static /* synthetic */ s0 a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof r0 ? ((r0) toLongFunction).a : new q0(toLongFunction);
    }

    @Override // j$.util.function.s0
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.a;
        if (obj instanceof q0) {
            obj = ((q0) obj).a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
