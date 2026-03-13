package j$.util.function;

import java.util.function.ToIntFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements p0 {
    public final /* synthetic */ ToIntFunction a;

    private /* synthetic */ n0(ToIntFunction toIntFunction) {
        this.a = toIntFunction;
    }

    public static /* synthetic */ p0 a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof o0 ? ((o0) toIntFunction).a : new n0(toIntFunction);
    }

    @Override // j$.util.function.p0
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.a;
        if (obj instanceof n0) {
            obj = ((n0) obj).a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
