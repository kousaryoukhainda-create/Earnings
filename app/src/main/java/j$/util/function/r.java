package j$.util.function;

import java.util.function.DoubleToLongFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ DoubleToLongFunction a;

    private /* synthetic */ r(DoubleToLongFunction doubleToLongFunction) {
        this.a = doubleToLongFunction;
    }

    public static /* synthetic */ r a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return new r(doubleToLongFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToLongFunction doubleToLongFunction = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return doubleToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
