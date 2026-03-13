package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1745e extends CountedCompleter {
    private static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC1730b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC1745e d;
    protected AbstractC1745e e;
    private Object f;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC1745e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1745e(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        super(null);
        this.a = abstractC1730b;
        this.b = spliterator;
        this.c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1745e(AbstractC1745e abstractC1745e, Spliterator spliterator) {
        super(abstractC1745e);
        this.b = spliterator;
        this.a = abstractC1745e.a;
        this.c = abstractC1745e.c;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC1745e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = g(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC1745e abstractC1745e = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC1745e e = abstractC1745e.e(trySplit);
            abstractC1745e.d = e;
            AbstractC1745e e2 = abstractC1745e.e(spliterator);
            abstractC1745e.e = e2;
            abstractC1745e.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC1745e = e;
                e = e2;
            } else {
                abstractC1745e = e2;
            }
            z = !z;
            e.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC1745e.f(abstractC1745e.a());
        abstractC1745e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
