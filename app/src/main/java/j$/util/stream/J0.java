package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* loaded from: classes4.dex */
interface J0 {
    J0 a(int i);

    long count();

    void forEach(Consumer consumer);

    void j(Object[] objArr, int i);

    int q();

    Spliterator spliterator();

    Object[] t(IntFunction intFunction);

    J0 u(long j, long j2, IntFunction intFunction);
}
