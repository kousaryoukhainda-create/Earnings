package defpackage;
/* renamed from: i8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593i8 extends AbstractC0143Aj {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public C1593i8(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0143Aj)) {
            return false;
        }
        AbstractC0143Aj abstractC0143Aj = (AbstractC0143Aj) obj;
        if (this.a == ((C1593i8) abstractC0143Aj).a) {
            C1593i8 c1593i8 = (C1593i8) abstractC0143Aj;
            if (this.b.equals(c1593i8.b)) {
                String str = c1593i8.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == c1593i8.d && this.e == c1593i8.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.d;
        return this.e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return AbstractC2437ph.k(sb, this.e, "}");
    }
}
