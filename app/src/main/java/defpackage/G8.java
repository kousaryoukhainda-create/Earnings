package defpackage;
/* renamed from: G8  reason: default package */
/* loaded from: classes.dex */
public final class G8 {
    public final String a;
    public final long b;
    public final long c;

    public G8(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g8 = (G8) obj;
        if (this.a.equals(g8.a) && this.b == g8.b && this.c == g8.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return BK.n(sb, this.c, "}");
    }
}
