package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1778k2 implements InterfaceC1798o2 {
    protected final InterfaceC1798o2 a;

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void accept(double d) {
        AbstractC1840x0.b();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void accept(int i) {
        AbstractC1840x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final /* synthetic */ void accept(long j) {
        AbstractC1840x0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public AbstractC1778k2(InterfaceC1798o2 interfaceC1798o2) {
        Objects.requireNonNull(interfaceC1798o2);
        this.a = interfaceC1798o2;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public void o(long j) {
        this.a.o(j);
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public void n() {
        this.a.n();
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public boolean r() {
        return this.a.r();
    }
}
