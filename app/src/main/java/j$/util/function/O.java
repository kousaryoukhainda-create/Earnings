package j$.util.function;

import java.util.function.LongFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class O implements Q {
    public final /* synthetic */ LongFunction a;

    private /* synthetic */ O(LongFunction longFunction) {
        this.a = longFunction;
    }

    public static /* synthetic */ Q a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof P ? ((P) longFunction).a : new O(longFunction);
    }

    @Override // j$.util.function.Q
    public final /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongFunction longFunction = this.a;
        if (obj instanceof O) {
            obj = ((O) obj).a;
        }
        return longFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
