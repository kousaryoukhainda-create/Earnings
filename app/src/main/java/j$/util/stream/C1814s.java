package j$.util.stream;

import j$.util.function.C1703p;
import j$.util.function.C1704q;
import j$.util.function.C1705s;
import j$.util.function.InterfaceC1699l;
import j$.util.function.InterfaceC1702o;
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1814s extends AbstractC1763h2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1730b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1814s(AbstractC1730b abstractC1730b, InterfaceC1798o2 interfaceC1798o2, int i) {
        super(interfaceC1798o2);
        this.b = i;
        this.c = abstractC1730b;
    }

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
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

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC1798o2) ((InterfaceC1702o) ((C1819t) this.c).n).apply(d));
                return;
            case 1:
                this.a.accept(((C1705s) ((C1824u) this.c).n).a.applyAsDouble(d));
                return;
            case 2:
                this.a.accept(((C1704q) ((C1829v) this.c).n).a.applyAsInt(d));
                return;
            case 3:
                this.a.accept(((j$.util.function.r) ((C1834w) this.c).n).a.applyAsLong(d));
                return;
            case 4:
                if (((C1703p) ((C1824u) this.c).n).a.test(d)) {
                    this.a.accept(d);
                    return;
                }
                return;
            default:
                ((InterfaceC1699l) ((C1824u) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
