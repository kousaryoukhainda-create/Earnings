package j$.util.function;

import java.util.function.LongToDoubleFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class T {
    public final /* synthetic */ LongToDoubleFunction a;

    private /* synthetic */ T(LongToDoubleFunction longToDoubleFunction) {
        this.a = longToDoubleFunction;
    }

    public static /* synthetic */ T a(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return new T(longToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToDoubleFunction longToDoubleFunction = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return longToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
