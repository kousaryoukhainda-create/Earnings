package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1831v1 extends CountedCompleter implements InterfaceC1798o2 {
    protected final Spliterator a;
    protected final AbstractC1730b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    abstract AbstractC1831v1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC1840x0.b();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC1840x0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1840x0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ void n() {
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final /* synthetic */ boolean r() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1831v1(Spliterator spliterator, AbstractC1730b abstractC1730b, int i) {
        this.a = spliterator;
        this.b = abstractC1730b;
        this.c = AbstractC1745e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1831v1(AbstractC1831v1 abstractC1831v1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC1831v1);
        this.a = spliterator;
        this.b = abstractC1831v1.b;
        this.c = abstractC1831v1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        AbstractC1831v1 abstractC1831v1 = this;
        while (spliterator.estimateSize() > abstractC1831v1.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC1831v1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC1831v1.a(trySplit, abstractC1831v1.d, estimateSize).fork();
            abstractC1831v1 = abstractC1831v1.a(spliterator, abstractC1831v1.d + estimateSize, abstractC1831v1.e - estimateSize);
        }
        abstractC1831v1.b.M0(spliterator, abstractC1831v1);
        abstractC1831v1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
