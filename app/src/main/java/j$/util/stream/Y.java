package j$.util.stream;
/* loaded from: classes4.dex */
final class Y extends AbstractC1771j0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC1730b abstractC1730b, int i, int i2) {
        super(abstractC1730b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1730b
    public final InterfaceC1798o2 I0(int i, InterfaceC1798o2 interfaceC1798o2) {
        switch (this.m) {
            case 0:
                return new X(0, interfaceC1798o2);
            default:
                return interfaceC1798o2;
        }
    }
}
