package j$.util;
/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1715i implements j$.util.function.B {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    @Override // j$.util.function.B
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final void a(C1715i c1715i) {
        this.count += c1715i.count;
        this.sum += c1715i.sum;
        this.min = Math.min(this.min, c1715i.min);
        this.max = Math.max(this.max, c1715i.max);
    }

    public final String toString() {
        String simpleName = C1715i.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
