package j$.util.function;

import java.util.function.IntUnaryOperator;
/* loaded from: classes4.dex */
public final /* synthetic */ class G {
    public final /* synthetic */ IntUnaryOperator a;

    private /* synthetic */ G(IntUnaryOperator intUnaryOperator) {
        this.a = intUnaryOperator;
    }

    public static /* synthetic */ G a(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return new G(intUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntUnaryOperator intUnaryOperator = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return intUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
