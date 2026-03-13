package j$.util;

import j$.util.function.Function;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.Comparator$-CC  reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Comparator$CC {
    public static Comparator a() {
        return EnumC1687f.INSTANCE;
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return new C1683c(comparator, function, 1);
    }
}
