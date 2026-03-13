package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1768i2 implements InterfaceC1788m2 {
    protected final InterfaceC1798o2 a;

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void accept(double d) {
        AbstractC1840x0.b();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final /* synthetic */ void accept(long j) {
        AbstractC1840x0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    @Override // j$.util.stream.InterfaceC1788m2
    public final /* synthetic */ void p(Integer num) {
        AbstractC1840x0.g(this, num);
    }

    public AbstractC1768i2(InterfaceC1798o2 interfaceC1798o2) {
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
