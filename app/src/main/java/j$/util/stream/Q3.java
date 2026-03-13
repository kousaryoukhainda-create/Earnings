package j$.util.stream;
/* loaded from: classes4.dex */
final class Q3 extends AbstractC1768i2 {
    boolean b;
    final /* synthetic */ R3 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(R3 r3, InterfaceC1798o2 interfaceC1798o2) {
        super(interfaceC1798o2);
        this.c = r3;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC1768i2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(int i) {
        if (this.b) {
            boolean test = this.c.m.a.test(i);
            this.b = test;
            if (test) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.AbstractC1768i2, j$.util.stream.InterfaceC1798o2
    public final boolean r() {
        return !this.b || this.a.r();
    }
}
