package defpackage;
/* renamed from: m70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134m70 {
    public final long a;
    public final long b;
    public final int c;

    public C2134m70(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2134m70)) {
            return false;
        }
        C2134m70 c2134m70 = (C2134m70) obj;
        if (this.a == c2134m70.a && this.b == c2134m70.b && this.c == c2134m70.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return AbstractC2437ph.g("Topic { ", AbstractC2437ph.k(sb, this.c, " }"));
    }
}
