package j$.util.stream;
/* loaded from: classes4.dex */
final class U3 extends AbstractC1773j2 {
    boolean b;
    final /* synthetic */ V3 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(V3 v3, InterfaceC1798o2 interfaceC1798o2) {
        super(interfaceC1798o2);
        this.c = v3;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC1773j2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final void accept(long j) {
        if (this.b) {
            boolean test = this.c.m.a.test(j);
            this.b = test;
            if (test) {
                this.a.accept(j);
            }
        }
    }

    @Override // j$.util.stream.AbstractC1773j2, j$.util.stream.InterfaceC1798o2
    public final boolean r() {
        return !this.b || this.a.r();
    }
}
