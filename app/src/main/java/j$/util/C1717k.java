package j$.util;
/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1717k implements j$.util.function.N, j$.util.function.B {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    @Override // j$.util.function.B
    public final void accept(int i) {
        accept(i);
    }

    @Override // j$.util.function.N
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final void a(C1717k c1717k) {
        this.count += c1717k.count;
        this.sum += c1717k.sum;
        this.min = Math.min(this.min, c1717k.min);
        this.max = Math.max(this.max, c1717k.max);
    }

    public final String toString() {
        String simpleName = C1717k.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Long.valueOf(this.max));
    }
}
