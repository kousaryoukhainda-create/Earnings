package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1820t0 implements InterfaceC1798o2 {
    boolean a;
    boolean b;

    @Override // j$.util.stream.InterfaceC1798o2
    public /* synthetic */ void accept(double d) {
        AbstractC1840x0.b();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public /* synthetic */ void accept(int i) {
        AbstractC1840x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
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
    public final /* synthetic */ void o(long j) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1820t0(EnumC1825u0 enumC1825u0) {
        boolean z;
        z = enumC1825u0.b;
        this.b = !z;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final boolean r() {
        return this.a;
    }
}
