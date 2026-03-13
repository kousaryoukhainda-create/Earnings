package j$.util.function;

import java.util.function.IntToDoubleFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class E {
    public final /* synthetic */ IntToDoubleFunction a;

    private /* synthetic */ E(IntToDoubleFunction intToDoubleFunction) {
        this.a = intToDoubleFunction;
    }

    public static /* synthetic */ E a(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return new E(intToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToDoubleFunction intToDoubleFunction = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return intToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
