package defpackage;
/* renamed from: p8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393p8 extends AbstractC0351Ij {
    public final C2479q8 a;
    public final String b;
    public final String c;
    public final long d;

    public C2393p8(C2479q8 c2479q8, String str, String str2, long j) {
        this.a = c2479q8;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0351Ij)) {
            return false;
        }
        C2393p8 c2393p8 = (C2393p8) ((AbstractC0351Ij) obj);
        if (this.a.equals(c2393p8.a)) {
            if (this.b.equals(c2393p8.b) && this.c.equals(c2393p8.c) && this.d == c2393p8.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return BK.n(sb, this.d, "}");
    }
}
