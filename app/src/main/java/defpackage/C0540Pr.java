package defpackage;
/* renamed from: Pr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0540Pr {
    public long a;
    public long b;

    public C0540Pr(C0540Pr c0540Pr) {
        this.a = c0540Pr.a;
        this.b = c0540Pr.b;
    }

    public void a(long j) {
        if (j >= 0) {
            this.b = j;
            return;
        }
        throw new IllegalArgumentException(Kh0.g(j, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
    }

    public C0540Pr(int i) {
        switch (i) {
            case 3:
                this.a = 0L;
                this.b = -1L;
                return;
            case 4:
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                return;
            default:
                this.a = 60L;
                this.b = C2950vg.j;
                return;
        }
    }

    public C0540Pr(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
    }
}
