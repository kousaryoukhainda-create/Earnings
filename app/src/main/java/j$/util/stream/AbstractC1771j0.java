package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1771j0 extends AbstractC1776k0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1771j0(AbstractC1730b abstractC1730b, int i, int i2) {
        super(abstractC1730b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC1730b
    final boolean H0() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC1730b, j$.util.stream.InterfaceC1760h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1791n0 parallel() {
        switch (this.l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC1730b, j$.util.stream.InterfaceC1760h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1791n0 sequential() {
        switch (this.l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }
}
