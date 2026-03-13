package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C1703p;
import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Z3 extends A {
    final /* synthetic */ C1703p m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(B b, int i, C1703p c1703p) {
        super(b, i, 0);
        this.m = c1703p;
    }

    @Override // j$.util.stream.AbstractC1730b
    final Spliterator G0(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        if (EnumC1739c3.ORDERED.q(abstractC1730b.B0())) {
            return F0(abstractC1730b, spliterator, new C1838w3(6)).spliterator();
        }
        return new g4((j$.util.E) abstractC1730b.O0(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.AbstractC1730b
    final J0 F0(AbstractC1730b abstractC1730b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new f4(this, abstractC1730b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1730b
    public final InterfaceC1798o2 I0(int i, InterfaceC1798o2 interfaceC1798o2) {
        return new Y3(this, interfaceC1798o2);
    }
}
