package defpackage;
/* renamed from: f8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1335f8 extends AbstractC3300zj {
    public final String a;
    public final String b;
    public final long c;

    public C1335f8(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3300zj)) {
            return false;
        }
        AbstractC3300zj abstractC3300zj = (AbstractC3300zj) obj;
        if (this.a.equals(((C1335f8) abstractC3300zj).a)) {
            C1335f8 c1335f8 = (C1335f8) abstractC3300zj;
            if (this.b.equals(c1335f8.b) && this.c == c1335f8.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return BK.n(sb, this.c, "}");
    }
}
