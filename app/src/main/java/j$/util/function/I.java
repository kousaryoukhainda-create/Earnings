package j$.util.function;

import java.util.function.LongBinaryOperator;
/* loaded from: classes4.dex */
public final /* synthetic */ class I implements LongBinaryOperator {
    public final /* synthetic */ J a;

    private /* synthetic */ I(J j) {
        this.a = j;
    }

    public static /* synthetic */ LongBinaryOperator a(J j) {
        if (j == null) {
            return null;
        }
        return j instanceof H ? ((H) j).a : new I(j);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        J j = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
