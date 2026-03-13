package defpackage;
/* renamed from: k8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1963k8 extends AbstractC0221Dj {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public C1963k8(boolean z, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0221Dj)) {
            return false;
        }
        AbstractC0221Dj abstractC0221Dj = (AbstractC0221Dj) obj;
        if (this.a.equals(((C1963k8) abstractC0221Dj).a)) {
            C1963k8 c1963k8 = (C1963k8) abstractC0221Dj;
            if (this.b == c1963k8.b && this.c == c1963k8.c && this.d == c1963k8.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}
