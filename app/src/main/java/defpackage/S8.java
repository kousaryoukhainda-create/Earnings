package defpackage;
/* renamed from: S8  reason: default package */
/* loaded from: classes.dex */
public final class S8 extends UW {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public S8(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UW)) {
            return false;
        }
        UW uw = (UW) obj;
        if (this.b.equals(((S8) uw).b)) {
            S8 s8 = (S8) uw;
            if (this.c.equals(s8.c) && this.d.equals(s8.d) && this.e.equals(s8.e) && this.f == s8.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return BK.n(sb, this.f, "}");
    }
}
