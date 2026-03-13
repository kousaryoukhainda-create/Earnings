package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1826u1 extends AbstractC1831v1 {
    private final Object[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1826u1(Spliterator spliterator, AbstractC1730b abstractC1730b, Object[] objArr) {
        super(spliterator, abstractC1730b, objArr.length);
        this.h = objArr;
    }

    C1826u1(C1826u1 c1826u1, Spliterator spliterator, long j, long j2) {
        super(c1826u1, spliterator, j, j2, c1826u1.h.length);
        this.h = c1826u1.h;
    }

    @Override // j$.util.stream.AbstractC1831v1
    final AbstractC1831v1 a(Spliterator spliterator, long j, long j2) {
        return new C1826u1(this, spliterator, j, j2);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
