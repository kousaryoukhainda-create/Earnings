package j$.util.function;

import java.util.function.IntToLongFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class F {
    public final /* synthetic */ IntToLongFunction a;

    private /* synthetic */ F(IntToLongFunction intToLongFunction) {
        this.a = intToLongFunction;
    }

    public static /* synthetic */ F a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return new F(intToLongFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToLongFunction intToLongFunction = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return intToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
