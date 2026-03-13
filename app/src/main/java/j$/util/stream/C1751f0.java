package j$.util.stream;
/* renamed from: j$.util.stream.f0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1751f0 extends AbstractC1773j2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1730b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1751f0(AbstractC1730b abstractC1730b, InterfaceC1798o2 interfaceC1798o2, int i) {
        super(interfaceC1798o2);
        this.b = i;
        this.c = abstractC1730b;
    }

    @Override // j$.util.stream.AbstractC1773j2, j$.util.stream.InterfaceC1798o2
    public void o(long j) {
        switch (this.b) {
            case 4:
                this.a.o(-1L);
                return;
            default:
                super.o(j);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC1798o2) ((j$.util.function.Q) ((C1819t) this.c).n).apply(j));
                return;
            case 1:
                this.a.accept(((j$.util.function.V) ((C1834w) this.c).n).a.applyAsLong(j));
                return;
            case 2:
                this.a.accept(((j$.util.function.U) ((C1829v) this.c).n).a.applyAsInt(j));
                return;
            case 3:
                this.a.accept(((j$.util.function.T) ((C1824u) this.c).n).a.applyAsDouble(j));
                return;
            case 4:
                if (((j$.util.function.S) ((C1834w) this.c).n).a.test(j)) {
                    this.a.accept(j);
                    return;
                }
                return;
            default:
                ((j$.util.function.N) ((C1834w) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
