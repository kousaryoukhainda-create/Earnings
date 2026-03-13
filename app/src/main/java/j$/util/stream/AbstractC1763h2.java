package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.Objects;
/* renamed from: j$.util.stream.h2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1763h2 implements InterfaceC1783l2 {
    protected final InterfaceC1798o2 a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        s((Double) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return j$.com.android.tools.r8.a.a(this, interfaceC1699l);
    }

    @Override // j$.util.stream.InterfaceC1783l2
    public final /* synthetic */ void s(Double d) {
        AbstractC1840x0.e(this, d);
    }

    public AbstractC1763h2(InterfaceC1798o2 interfaceC1798o2) {
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
