package j$.util.function;

import java.util.function.LongUnaryOperator;
/* loaded from: classes4.dex */
public final /* synthetic */ class V {
    public final /* synthetic */ LongUnaryOperator a;

    private /* synthetic */ V(LongUnaryOperator longUnaryOperator) {
        this.a = longUnaryOperator;
    }

    public static /* synthetic */ V a(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return new V(longUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongUnaryOperator longUnaryOperator = this.a;
        if (obj instanceof V) {
            obj = ((V) obj).a;
        }
        return longUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
