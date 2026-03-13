package j$.util;

import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class Spliterators {
    private static final Spliterator a = new Object();
    private static final H b = new Object();
    private static final K c = new Object();
    private static final E d = new Object();

    public static Spliterator e() {
        return a;
    }

    public static H c() {
        return b;
    }

    public static K d() {
        return c;
    }

    public static E b() {
        return d;
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i, i2);
        return new U(objArr, i, i2, 1040);
    }

    public static H k(int[] iArr, int i, int i2) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i, i2);
        return new a0(iArr, i, i2, 1040);
    }

    public static K l(long[] jArr, int i, int i2) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i, i2);
        return new c0(jArr, i, i2, 1040);
    }

    public static E j(double[] dArr, int i, int i2) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i, i2);
        return new V(dArr, i, i2, 1040);
    }

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        Objects.requireNonNull(collection);
        return new b0(collection, i);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new P(spliterator);
    }

    public static InterfaceC1856v g(H h) {
        Objects.requireNonNull(h);
        return new Q(h);
    }

    public static InterfaceC1860z h(K k) {
        Objects.requireNonNull(k);
        return new S(k);
    }

    public static r f(E e) {
        Objects.requireNonNull(e);
        return new T(e);
    }
}
