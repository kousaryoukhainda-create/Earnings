package j$.util.function;

import java.util.function.LongConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class L implements N {
    public final /* synthetic */ LongConsumer a;

    private /* synthetic */ L(LongConsumer longConsumer) {
        this.a = longConsumer;
    }

    public static /* synthetic */ N a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof M ? ((M) longConsumer).a : new L(longConsumer);
    }

    @Override // j$.util.function.N
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongConsumer longConsumer = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return longConsumer.equals(obj);
    }

    @Override // j$.util.function.N
    public final /* synthetic */ N f(N n) {
        return a(this.a.andThen(M.a(n)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
