package j$.util.stream;

import j$.util.C1715i;
import j$.util.C1717k;
import j$.util.Optional;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1710x;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
/* loaded from: classes4.dex */
public final /* synthetic */ class J implements Predicate, IntFunction, j$.util.function.p0, InterfaceC1710x, j$.util.function.b0, BiConsumer, Supplier, j$.util.function.e0, j$.util.function.J, j$.util.function.s0, j$.util.function.Q, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ J(int i) {
        this.a = i;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 7:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 12:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 16:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Q
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // j$.util.function.InterfaceC1710x
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 5:
                return Math.min(i, i2);
            case 8:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // j$.util.function.J
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 14:
                return Math.min(j, j2);
            case 22:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((Optional) obj).b();
    }

    @Override // j$.util.function.s0
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.p0
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 10:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // j$.util.function.e0
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 13:
                ((C1717k) obj).accept(j);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                return;
        }
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                ((C1715i) obj).a((C1715i) obj2);
                return;
            case 12:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            case 16:
                ((C1717k) obj).a((C1717k) obj2);
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // j$.util.function.b0
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 6:
                ((C1715i) obj).accept(i);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                return;
        }
    }

    @Override // j$.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 1:
                return new Object[i];
            case 2:
                return new Integer[i];
            case 4:
                return Integer.valueOf(i);
            case 17:
                return new Long[i];
            case 25:
                return new Object[i];
            case 26:
                return new Object[i];
            case 27:
                return new Integer[i];
            case 28:
                return new Long[i];
            default:
                return new Double[i];
        }
    }
}
