package defpackage;
/* renamed from: Z8  reason: default package */
/* loaded from: classes.dex */
public final class Z8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final C0750Xt f;

    public Z8(String str, String str2, String str3, String str4, int i, C0750Xt c0750Xt) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = c0750Xt;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z8)) {
            return false;
        }
        Z8 z8 = (Z8) obj;
        if (this.a.equals(z8.a) && this.b.equals(z8.b) && this.c.equals(z8.c) && this.d.equals(z8.d) && this.e == z8.e && this.f.equals(z8.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
