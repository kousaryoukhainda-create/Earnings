package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
/* renamed from: j$.util.d  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1685d {
    public static java.util.Optional u(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.b()) {
            return java.util.Optional.of(optional.a());
        }
        return java.util.Optional.empty();
    }

    public static Optional o(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble v(C1718l c1718l) {
        if (c1718l == null) {
            return null;
        }
        if (c1718l.c()) {
            return OptionalDouble.of(c1718l.b());
        }
        return OptionalDouble.empty();
    }

    public static C1718l p(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return C1718l.d(optionalDouble.getAsDouble());
        }
        return C1718l.a();
    }

    public static OptionalLong x(C1720n c1720n) {
        if (c1720n == null) {
            return null;
        }
        if (c1720n.c()) {
            return OptionalLong.of(c1720n.b());
        }
        return OptionalLong.empty();
    }

    public static C1720n s(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return C1720n.d(optionalLong.getAsLong());
        }
        return C1720n.a();
    }

    public static OptionalInt w(C1719m c1719m) {
        if (c1719m == null) {
            return null;
        }
        if (c1719m.c()) {
            return OptionalInt.of(c1719m.b());
        }
        return OptionalInt.empty();
    }

    public static C1719m r(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return C1719m.d(optionalInt.getAsInt());
        }
        return C1719m.a();
    }

    public static C1683c y(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof InterfaceC1686e) {
            EnumC1687f enumC1687f = (EnumC1687f) ((InterfaceC1686e) comparator);
            enumC1687f.getClass();
            Objects.requireNonNull(comparator2);
            return new C1683c(enumC1687f, comparator2, 0);
        }
        Objects.requireNonNull(comparator2);
        return new C1683c(comparator, comparator2, 0);
    }

    public static long i(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean k(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean m(H h, Consumer consumer) {
        if (consumer instanceof j$.util.function.B) {
            return h.g((j$.util.function.B) consumer);
        }
        if (e0.a) {
            e0.a(h.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return h.g(new C1724s(consumer));
    }

    public static void f(H h, Consumer consumer) {
        if (consumer instanceof j$.util.function.B) {
            h.c((j$.util.function.B) consumer);
        } else if (e0.a) {
            e0.a(h.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            h.c(new C1724s(consumer));
        }
    }

    public static boolean n(K k, Consumer consumer) {
        if (consumer instanceof j$.util.function.N) {
            return k.j((j$.util.function.N) consumer);
        }
        if (e0.a) {
            e0.a(k.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return k.j(new C1857w(consumer));
    }

    public static void h(K k, Consumer consumer) {
        if (consumer instanceof j$.util.function.N) {
            k.d((j$.util.function.N) consumer);
        } else if (e0.a) {
            e0.a(k.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            k.d(new C1857w(consumer));
        }
    }

    public static boolean l(E e, Consumer consumer) {
        if (consumer instanceof InterfaceC1699l) {
            return e.q((InterfaceC1699l) consumer);
        }
        if (e0.a) {
            e0.a(e.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return e.q(new C1721o(consumer));
    }

    public static void b(E e, Consumer consumer) {
        if (consumer instanceof InterfaceC1699l) {
            e.e((InterfaceC1699l) consumer);
        } else if (e0.a) {
            e0.a(e.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            e.e(new C1721o(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
