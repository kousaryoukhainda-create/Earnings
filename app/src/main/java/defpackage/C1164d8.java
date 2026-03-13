package defpackage;
/* renamed from: d8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164d8 extends AbstractC3128xj {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public C1164d8(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3128xj)) {
            return false;
        }
        AbstractC3128xj abstractC3128xj = (AbstractC3128xj) obj;
        if (this.a == ((C1164d8) abstractC3128xj).a) {
            C1164d8 c1164d8 = (C1164d8) abstractC3128xj;
            if (this.b == c1164d8.b && this.c.equals(c1164d8.c)) {
                String str = c1164d8.d;
                String str2 = this.d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return AbstractC0324Hi.h(sb, this.d, "}");
    }
}
