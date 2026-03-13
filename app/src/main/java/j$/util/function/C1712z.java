package j$.util.function;

import java.util.function.IntConsumer;
/* renamed from: j$.util.function.z */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1712z implements B {
    public final /* synthetic */ IntConsumer a;

    private /* synthetic */ C1712z(IntConsumer intConsumer) {
        this.a = intConsumer;
    }

    public static /* synthetic */ B a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof A ? ((A) intConsumer).a : new C1712z(intConsumer);
    }

    @Override // j$.util.function.B
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntConsumer intConsumer = this.a;
        if (obj instanceof C1712z) {
            obj = ((C1712z) obj).a;
        }
        return intConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.B
    public final /* synthetic */ B m(B b) {
        return a(this.a.andThen(A.a(b)));
    }
}
