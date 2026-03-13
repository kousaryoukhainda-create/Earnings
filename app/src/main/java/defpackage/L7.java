package defpackage;
/* renamed from: L7  reason: default package */
/* loaded from: classes.dex */
public final class L7 extends AbstractC0506Oj {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final U7 k;
    public final R7 l;
    public final O7 m;

    public L7(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, U7 u7, R7 r7, O7 o7) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = u7;
        this.l = r7;
        this.m = o7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, K7] */
    public final K7 a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.e;
        obj.e = this.f;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0506Oj)) {
            return false;
        }
        L7 l7 = (L7) ((AbstractC0506Oj) obj);
        if (this.b.equals(l7.b)) {
            if (this.c.equals(l7.c) && this.d == l7.d && this.e.equals(l7.e)) {
                String str = l7.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = l7.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = l7.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(l7.i) && this.j.equals(l7.j)) {
                                U7 u7 = l7.k;
                                U7 u72 = this.k;
                                if (u72 != null ? u72.equals(u7) : u7 == null) {
                                    R7 r7 = l7.l;
                                    R7 r72 = this.l;
                                    if (r72 != null ? r72.equals(r7) : r7 == null) {
                                        O7 o7 = l7.m;
                                        O7 o72 = this.m;
                                        if (o72 == null) {
                                            if (o7 == null) {
                                                return true;
                                            }
                                        } else if (o72.equals(o7)) {
                                            return true;
                                        }
                                    }
                                }
                            }
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
        int hashCode5;
        int hashCode6 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i3 ^ hashCode3) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        U7 u7 = this.k;
        if (u7 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = u7.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        R7 r7 = this.l;
        if (r7 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r7.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        O7 o7 = this.m;
        if (o7 != null) {
            i = o7.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
