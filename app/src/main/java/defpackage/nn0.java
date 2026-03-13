package defpackage;
/* renamed from: nn0  reason: default package */
/* loaded from: classes.dex */
public final class nn0 {
    public final String a;
    public final String b;
    public final String c;

    public nn0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nn0) {
            nn0 nn0Var = (nn0) obj;
            String str = this.a;
            if (str != null ? str.equals(nn0Var.a) : nn0Var.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(nn0Var.b) : nn0Var.b == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(nn0Var.c) : nn0Var.c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
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
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i ^ i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(this.a);
        sb.append(", playIntegrityToken=");
        sb.append(this.b);
        sb.append(", recaptchaEnterpriseToken=");
        return AbstractC0324Hi.h(sb, this.c, "}");
    }
}
