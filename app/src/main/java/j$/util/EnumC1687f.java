package j$.util;

import j$.util.function.Function;
import j$.util.function.k0;
import j$.util.function.m0;
import j$.util.function.n0;
import j$.util.function.p0;
import j$.util.function.q0;
import j$.util.function.s0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1687f implements Comparator, InterfaceC1686e {
    public static final EnumC1687f INSTANCE;
    private static final /* synthetic */ EnumC1687f[] a;

    public static EnumC1687f valueOf(String str) {
        return (EnumC1687f) Enum.valueOf(EnumC1687f.class, str);
    }

    public static EnumC1687f[] values() {
        return (EnumC1687f[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.util.f] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        INSTANCE = r1;
        a = new EnumC1687f[]{r1};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C1683c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return AbstractC1685d.y(this, Comparator$CC.comparing(Function.VivifiedWrapper.convert(function), comparator));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(java.util.function.Function function) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        Objects.requireNonNull(convert);
        return AbstractC1685d.y(this, new C1682b(convert, 2));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        p0 a2 = n0.a(toIntFunction);
        Objects.requireNonNull(a2);
        return AbstractC1685d.y(this, new C1682b(a2, 0));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        s0 a2 = q0.a(toLongFunction);
        Objects.requireNonNull(a2);
        return AbstractC1685d.y(this, new C1682b(a2, 3));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        m0 a2 = k0.a(toDoubleFunction);
        Objects.requireNonNull(a2);
        return AbstractC1685d.y(this, new C1682b(a2, 1));
    }
}
