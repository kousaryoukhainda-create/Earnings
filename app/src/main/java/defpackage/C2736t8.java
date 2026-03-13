package defpackage;
/* renamed from: t8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2736t8 extends AbstractC0429Lj {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public C2736t8(String str, int i, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0429Lj)) {
            return false;
        }
        AbstractC0429Lj abstractC0429Lj = (AbstractC0429Lj) obj;
        if (this.a == ((C2736t8) abstractC0429Lj).a) {
            C2736t8 c2736t8 = (C2736t8) abstractC0429Lj;
            if (this.b.equals(c2736t8.b) && this.c.equals(c2736t8.c) && this.d == c2736t8.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
