package j$.util.stream;
/* loaded from: classes4.dex */
final class X extends AbstractC1768i2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i, InterfaceC1798o2 interfaceC1798o2) {
        super(interfaceC1798o2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            default:
                this.a.accept(i);
                return;
        }
    }
}
