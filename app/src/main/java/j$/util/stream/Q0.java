package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BinaryOperator;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Q0 extends AbstractC1745e {
    protected final AbstractC1730b h;
    protected final j$.util.function.Q i;
    protected final BinaryOperator j;

    @Override // j$.util.stream.AbstractC1745e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1745e abstractC1745e = this.d;
        if (abstractC1745e != null) {
            f((J0) this.j.apply((J0) ((Q0) abstractC1745e).c(), (J0) ((Q0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(AbstractC1730b abstractC1730b, Spliterator spliterator, j$.util.function.Q q, BinaryOperator binaryOperator) {
        super(abstractC1730b, spliterator);
        this.h = abstractC1730b;
        this.i = q;
        this.j = binaryOperator;
    }

    Q0(Q0 q0, Spliterator spliterator) {
        super(q0, spliterator);
        this.h = q0.h;
        this.i = q0.i;
        this.j = q0.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1745e
    public final AbstractC1745e e(Spliterator spliterator) {
        return new Q0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1745e
    public final Object a() {
        B0 b0 = (B0) this.i.apply(this.h.x0(this.b));
        this.h.M0(this.b, b0);
        return b0.b();
    }
}
