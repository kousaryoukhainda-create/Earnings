package j$.util.stream;
/* renamed from: j$.util.stream.h3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1764h3 extends AbstractC1769i3 implements j$.util.function.N {
    final long[] c;

    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1764h3(int i) {
        this.c = new long[i];
    }

    @Override // j$.util.stream.AbstractC1769i3
    public final void a(Object obj, long j) {
        j$.util.function.N n = (j$.util.function.N) obj;
        for (int i = 0; i < j; i++) {
            n.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.N
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }
}
