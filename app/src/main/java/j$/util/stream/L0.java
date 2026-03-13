package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class L0 implements J0 {
    protected final J0 a;
    protected final J0 b;
    private final long c;

    @Override // j$.util.stream.J0
    public final int q() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(J0 j0, J0 j02) {
        this.a = j0;
        this.b = j02;
        this.c = j0.count() + j02.count();
    }

    @Override // j$.util.stream.J0
    public final J0 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.J0
    public /* bridge */ /* synthetic */ I0 a(int i) {
        return (I0) a(i);
    }
}
