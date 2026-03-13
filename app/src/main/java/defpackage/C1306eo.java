package defpackage;
/* renamed from: eo  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1306eo extends SY {
    public static final C1306eo f;

    /* JADX WARN: Type inference failed for: r0v0, types: [SY, Pi, eo] */
    static {
        int i = Q50.c;
        int i2 = Q50.d;
        long j = Q50.e;
        String str = Q50.a;
        ?? abstractC0531Pi = new AbstractC0531Pi();
        abstractC0531Pi.d = new ExecutorC0609Si(i, i2, str, j);
        f = abstractC0531Pi;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.AbstractC0531Pi
    public final String toString() {
        return "Dispatchers.Default";
    }
}
