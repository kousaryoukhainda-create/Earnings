package j$.util.function;

import java.util.function.LongBinaryOperator;
/* loaded from: classes4.dex */
public final /* synthetic */ class H implements J {
    public final /* synthetic */ LongBinaryOperator a;

    private /* synthetic */ H(LongBinaryOperator longBinaryOperator) {
        this.a = longBinaryOperator;
    }

    public static /* synthetic */ J a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof I ? ((I) longBinaryOperator).a : new H(longBinaryOperator);
    }

    @Override // j$.util.function.J
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongBinaryOperator longBinaryOperator = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return longBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
