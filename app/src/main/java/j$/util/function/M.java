package j$.util.function;

import java.util.function.LongConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class M implements LongConsumer {
    public final /* synthetic */ N a;

    private /* synthetic */ M(N n) {
        this.a = n;
    }

    public static /* synthetic */ LongConsumer a(N n) {
        if (n == null) {
            return null;
        }
        return n instanceof L ? ((L) n).a : new M(n);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.a.f(L.a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N n = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
