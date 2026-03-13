package j$.util.function;

import java.util.function.IntConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class A implements IntConsumer {
    public final /* synthetic */ B a;

    private /* synthetic */ A(B b) {
        this.a = b;
    }

    public static /* synthetic */ IntConsumer a(B b) {
        if (b == null) {
            return null;
        }
        return b instanceof C1712z ? ((C1712z) b).a : new A(b);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.a.m(C1712z.a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        B b = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return b.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
