package defpackage;
/* renamed from: As  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152As {
    public final long a;
    public final long b;

    public C0152As(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
