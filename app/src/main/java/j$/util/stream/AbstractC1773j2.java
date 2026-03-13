package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.j2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1773j2 implements InterfaceC1793n2 {
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

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        k((Long) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }

    @Override // j$.util.stream.InterfaceC1793n2
    public final /* synthetic */ void k(Long l) {
        AbstractC1840x0.i(this, l);
    }

    public AbstractC1773j2(InterfaceC1798o2 interfaceC1798o2) {
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
