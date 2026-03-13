package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class P3 extends AbstractC1753f2 implements c4 {
    final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(AbstractC1758g2 abstractC1758g2, int i, Predicate predicate) {
        super(abstractC1758g2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC1730b
    final Spliterator G0(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        if (EnumC1739c3.ORDERED.q(abstractC1730b.B0())) {
            return F0(abstractC1730b, spliterator, new J(25)).spliterator();
        }
        return new j4(abstractC1730b.O0(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.AbstractC1730b
    final J0 F0(AbstractC1730b abstractC1730b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new e4(this, abstractC1730b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1730b
    public final InterfaceC1798o2 I0(int i, InterfaceC1798o2 interfaceC1798o2) {
        return new O3(this, interfaceC1798o2, false);
    }

    @Override // j$.util.stream.c4
    public final d4 m(B0 b0, boolean z) {
        return new O3(this, b0, z);
    }
}
