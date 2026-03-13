package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.HashSet;
/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1790n extends AbstractC1778k2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1790n(AbstractC1730b abstractC1730b, InterfaceC1798o2 interfaceC1798o2, int i) {
        super(interfaceC1798o2);
        this.b = i;
        this.c = abstractC1730b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1790n(InterfaceC1798o2 interfaceC1798o2) {
        super(interfaceC1798o2);
        this.b = 0;
    }

    @Override // j$.util.stream.AbstractC1778k2, j$.util.stream.InterfaceC1798o2
    public void n() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.n();
                return;
            default:
                super.n();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1778k2, j$.util.stream.InterfaceC1798o2
    public void o(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.o(-1L);
                return;
            case 1:
            default:
                super.o(j);
                return;
            case 2:
                this.a.o(-1L);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((HashSet) this.c).contains(obj)) {
                    return;
                }
                ((HashSet) this.c).add(obj);
                this.a.accept((InterfaceC1798o2) obj);
                return;
            case 1:
                ((Consumer) ((C1819t) this.c).n).accept(obj);
                this.a.accept((InterfaceC1798o2) obj);
                return;
            case 2:
                if (((Predicate) ((C1819t) this.c).n).test(obj)) {
                    this.a.accept((InterfaceC1798o2) obj);
                    return;
                }
                return;
            case 3:
                this.a.accept((InterfaceC1798o2) ((C1743d2) this.c).n.apply(obj));
                return;
            case 4:
                this.a.accept(((j$.util.function.p0) ((C1829v) this.c).n).applyAsInt(obj));
                return;
            case 5:
                this.a.accept(((j$.util.function.s0) ((C1834w) this.c).n).applyAsLong(obj));
                return;
            default:
                this.a.accept(((j$.util.function.m0) ((C1824u) this.c).n).applyAsDouble(obj));
                return;
        }
    }
}
