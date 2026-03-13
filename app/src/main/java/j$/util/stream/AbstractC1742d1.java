package j$.util.stream;

import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1742d1 implements J0 {
    @Override // j$.util.stream.J0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj, int i) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public /* synthetic */ J0 u(long j, long j2, IntFunction intFunction) {
        return AbstractC1840x0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.J0
    public J0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final Object[] t(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }
}
