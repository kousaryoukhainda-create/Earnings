package defpackage;
/* renamed from: gp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479gp {
    public final String a;
    public final String b;
    public final String c;

    public C1479gp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1479gp.class != obj.getClass()) {
            return false;
        }
        C1479gp c1479gp = (C1479gp) obj;
        if (Ha0.a(this.a, c1479gp.a) && Ha0.a(this.b, c1479gp.b) && Ha0.a(this.c, c1479gp.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
