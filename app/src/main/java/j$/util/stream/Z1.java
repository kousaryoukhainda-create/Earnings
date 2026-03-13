package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes4.dex */
abstract class Z1 extends U1 implements T1 {
    long b;

    public /* synthetic */ void accept(double d) {
        AbstractC1840x0.b();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC1840x0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1840x0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void n() {
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void i(T1 t1) {
        this.b += ((Z1) t1).b;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.U1, j$.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }
}
