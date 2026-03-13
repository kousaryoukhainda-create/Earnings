package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class S implements J3, K3 {
    private final boolean a;

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

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void n() {
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void o(long j) {
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ boolean r() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public S(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.J3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return EnumC1739c3.r;
    }

    @Override // j$.util.stream.J3
    public final Object c(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        if (this.a) {
            new T(abstractC1730b, spliterator, this).invoke();
            return null;
        }
        new U(abstractC1730b, spliterator, abstractC1730b.N0(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.J3
    public final Object a(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        abstractC1730b.r0(spliterator, abstractC1730b.N0(this));
        return null;
    }
}
