package j$.util.function;

import java.util.function.IntPredicate;
/* loaded from: classes4.dex */
public final /* synthetic */ class D {
    public final /* synthetic */ IntPredicate a;

    private /* synthetic */ D(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    public static /* synthetic */ D a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new D(intPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntPredicate intPredicate = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return intPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
