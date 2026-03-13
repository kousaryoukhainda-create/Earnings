package j$.util.function;

import java.util.function.LongFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class P implements LongFunction {
    public final /* synthetic */ Q a;

    private /* synthetic */ P(Q q) {
        this.a = q;
    }

    public static /* synthetic */ LongFunction a(Q q) {
        if (q == null) {
            return null;
        }
        return q instanceof O ? ((O) q).a : new P(q);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Q q = this.a;
        if (obj instanceof P) {
            obj = ((P) obj).a;
        }
        return q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
