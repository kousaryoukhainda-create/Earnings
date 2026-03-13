package j$.com.android.tools.r8;

import j$.util.function.B;
import j$.util.function.C1696i;
import j$.util.function.C1711y;
import j$.util.function.InterfaceC1699l;
import j$.util.function.K;
import j$.util.function.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int f(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long g(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ List h(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean i(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long j(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if ((i >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (i == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long k(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long l(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long m(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.i] */
    public static C1696i a(final InterfaceC1699l interfaceC1699l, final InterfaceC1699l interfaceC1699l2) {
        Objects.requireNonNull(interfaceC1699l2);
        return new InterfaceC1699l() { // from class: j$.util.function.i
            @Override // j$.util.function.InterfaceC1699l
            public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l3) {
                return j$.com.android.tools.r8.a.a(this, interfaceC1699l3);
            }

            @Override // j$.util.function.InterfaceC1699l
            public final void accept(double d) {
                InterfaceC1699l.this.accept(d);
                interfaceC1699l2.accept(d);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.y] */
    public static C1711y b(final B b, final B b2) {
        Objects.requireNonNull(b2);
        return new B() { // from class: j$.util.function.y
            @Override // j$.util.function.B
            public final /* synthetic */ B m(B b3) {
                return j$.com.android.tools.r8.a.b(this, b3);
            }

            @Override // j$.util.function.B
            public final void accept(int i) {
                B.this.accept(i);
                b2.accept(i);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.K] */
    public static K c(final N n, final N n2) {
        Objects.requireNonNull(n2);
        return new N() { // from class: j$.util.function.K
            @Override // j$.util.function.N
            public final /* synthetic */ N f(N n3) {
                return j$.com.android.tools.r8.a.c(this, n3);
            }

            @Override // j$.util.function.N
            public final void accept(long j) {
                N.this.accept(j);
                n2.accept(j);
            }
        };
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int e(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }
}
