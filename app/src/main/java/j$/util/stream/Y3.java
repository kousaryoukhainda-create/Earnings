package j$.util.stream;
/* loaded from: classes4.dex */
final class Y3 extends AbstractC1763h2 {
    boolean b;
    final /* synthetic */ Z3 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Z3 z3, InterfaceC1798o2 interfaceC1798o2) {
        super(interfaceC1798o2);
        this.c = z3;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(double d) {
        if (this.b) {
            boolean test = this.c.m.a.test(d);
            this.b = test;
            if (test) {
                this.a.accept(d);
            }
        }
    }

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
    public final boolean r() {
        return !this.b || this.a.r();
    }
}
