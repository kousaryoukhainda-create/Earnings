package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes4.dex */
final class U extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC1798o2 b;
    private final AbstractC1730b c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(AbstractC1730b abstractC1730b, Spliterator spliterator, InterfaceC1798o2 interfaceC1798o2) {
        super(null);
        this.b = interfaceC1798o2;
        this.c = abstractC1730b;
        this.a = spliterator;
        this.d = 0L;
    }

    U(U u, Spliterator spliterator) {
        super(u);
        this.a = spliterator;
        this.b = u.b;
        this.d = u.d;
        this.c = u.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC1745e.g(estimateSize);
            this.d = j;
        }
        boolean q = EnumC1739c3.SHORT_CIRCUIT.q(this.c.B0());
        InterfaceC1798o2 interfaceC1798o2 = this.b;
        boolean z = false;
        U u = this;
        while (true) {
            if (q && interfaceC1798o2.r()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                U u2 = new U(u, trySplit);
                u.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    U u3 = u;
                    u = u2;
                    u2 = u3;
                }
                z = !z;
                u.fork();
                u = u2;
                estimateSize = spliterator.estimateSize();
            }
        }
        u.c.r0(spliterator, interfaceC1798o2);
        u.a = null;
        u.propagateCompletion();
    }
}
