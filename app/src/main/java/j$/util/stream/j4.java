package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
/* loaded from: classes4.dex */
final class j4 extends k4 implements Consumer {
    final Predicate e;
    Object f;
    public final /* synthetic */ int g;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, j4 j4Var, int i) {
        super(spliterator, j4Var);
        this.g = i;
        this.e = j4Var.e;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(j$.util.function.Consumer r7) {
        /*
            r6 = this;
            int r0 = r6.g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r6.u()
            if (r0 == 0) goto L28
            j$.util.Spliterator r0 = r6.a
            boolean r0 = r0.t(r6)
            if (r0 == 0) goto L28
            j$.util.function.Predicate r0 = r6.e
            java.lang.Object r2 = r6.f
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L34
        L28:
            r0 = 1
        L29:
            r7 = 0
            r6.c = r7
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r1)
        L33:
            r1 = 0
        L34:
            return r1
        L35:
            boolean r0 = r6.c
            j$.util.Spliterator r1 = r6.a
            if (r0 == 0) goto L66
            r0 = 0
            r6.c = r0
        L3e:
            boolean r2 = r1.t(r6)
            r3 = 1
            if (r2 == 0) goto L57
            boolean r4 = r6.u()
            if (r4 == 0) goto L57
            j$.util.function.Predicate r4 = r6.e
            java.lang.Object r5 = r6.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L57
            r0 = 1
            goto L3e
        L57:
            if (r2 == 0) goto L6a
            if (r0 == 0) goto L60
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r3)
        L60:
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L6a
        L66:
            boolean r2 = r1.t(r7)
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.j4.t(j$.util.function.Consumer):boolean");
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4
    final Spliterator v(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new j4(spliterator, this, 0);
            default:
                return new j4(spliterator, this, 1);
        }
    }
}
