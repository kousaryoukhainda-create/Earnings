package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1735c extends AbstractC1745e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected abstract Object j();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1735c(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        super(abstractC1730b, spliterator);
        this.h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1735c(AbstractC1735c abstractC1735c, Spliterator spliterator) {
        super(abstractC1735c, spliterator);
        this.h = abstractC1735c.h;
    }

    @Override // j$.util.stream.AbstractC1745e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC1745e.g(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC1735c abstractC1735c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC1735c.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC1735c.getCompleter();
                while (true) {
                    AbstractC1735c abstractC1735c2 = (AbstractC1735c) ((AbstractC1745e) completer);
                    if (z2 || abstractC1735c2 == null) {
                        break;
                    }
                    z2 = abstractC1735c2.i;
                    completer = abstractC1735c2.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC1735c.j();
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                AbstractC1735c abstractC1735c3 = (AbstractC1735c) abstractC1735c.e(trySplit);
                abstractC1735c.d = abstractC1735c3;
                AbstractC1735c abstractC1735c4 = (AbstractC1735c) abstractC1735c.e(spliterator);
                abstractC1735c.e = abstractC1735c4;
                abstractC1735c.setPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                    abstractC1735c = abstractC1735c3;
                    abstractC1735c3 = abstractC1735c4;
                } else {
                    abstractC1735c = abstractC1735c4;
                }
                z = !z;
                abstractC1735c3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        obj = abstractC1735c.a();
        abstractC1735c.f(obj);
        abstractC1735c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1745e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC1745e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.AbstractC1745e
    public final Object c() {
        if (d()) {
            Object obj = this.h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC1735c abstractC1735c = this;
        for (AbstractC1735c abstractC1735c2 = (AbstractC1735c) ((AbstractC1745e) getCompleter()); abstractC1735c2 != null; abstractC1735c2 = (AbstractC1735c) ((AbstractC1745e) abstractC1735c2.getCompleter())) {
            if (abstractC1735c2.d == abstractC1735c) {
                AbstractC1735c abstractC1735c3 = (AbstractC1735c) abstractC1735c2.e;
                if (!abstractC1735c3.i) {
                    abstractC1735c3.h();
                }
            }
            abstractC1735c = abstractC1735c2;
        }
    }
}
