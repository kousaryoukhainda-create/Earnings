package defpackage;
/* renamed from: F8  reason: default package */
/* loaded from: classes.dex */
public final class F8 {
    public final String a;
    public final String b;
    public final String c;
    public final C1004c9 d;
    public final int e;

    public F8(String str, String str2, String str3, C1004c9 c1004c9, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c1004c9;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F8)) {
            return false;
        }
        F8 f8 = (F8) obj;
        String str = this.a;
        if (str != null ? str.equals(f8.a) : f8.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(f8.b) : f8.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(f8.c) : f8.c == null) {
                    C1004c9 c1004c9 = this.d;
                    if (c1004c9 != null ? c1004c9.equals(f8.d) : f8.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (f8.e == 0) {
                                return true;
                            }
                        } else if (AbstractC0324Hi.a(i, f8.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        C1004c9 c1004c9 = this.d;
        if (c1004c9 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c1004c9.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        int i6 = this.e;
        if (i6 != 0) {
            i = AbstractC0324Hi.A(i6);
        }
        return i ^ i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                str = "null";
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
