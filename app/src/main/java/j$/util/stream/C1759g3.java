package j$.util.stream;
/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1759g3 extends AbstractC1769i3 implements j$.util.function.B {
    final int[] c;

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1759g3(int i) {
        this.c = new int[i];
    }

    @Override // j$.util.stream.AbstractC1769i3
    public final void a(Object obj, long j) {
        j$.util.function.B b = (j$.util.function.B) obj;
        for (int i = 0; i < j; i++) {
            b.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.B
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}
