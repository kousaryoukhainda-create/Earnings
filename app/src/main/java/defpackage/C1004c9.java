package defpackage;
/* renamed from: c9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004c9 {
    public final String a;
    public final long b;
    public final int c;

    public C1004c9(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static C1150d1 a() {
        C1150d1 c1150d1 = new C1150d1(1, (byte) 0);
        c1150d1.f = 0L;
        return c1150d1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1004c9)) {
            return false;
        }
        C1004c9 c1004c9 = (C1004c9) obj;
        String str = this.a;
        if (str != null ? str.equals(c1004c9.a) : c1004c9.a == null) {
            if (this.b == c1004c9.b) {
                int i = c1004c9.c;
                int i2 = this.c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (AbstractC0324Hi.a(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            i = AbstractC0324Hi.A(i3);
        }
        return i ^ i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
