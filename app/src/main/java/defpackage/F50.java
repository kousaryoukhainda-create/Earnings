package defpackage;

import java.util.Locale;
/* renamed from: F50  reason: default package */
/* loaded from: classes.dex */
public final class F50 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final int g;

    public F50(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            } else {
                i3 = 2;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F50.class != obj.getClass()) {
            return false;
        }
        F50 f50 = (F50) obj;
        if (this.e != f50.e || !this.a.equals(f50.a) || this.d != f50.d) {
            return false;
        }
        String str = this.f;
        int i = this.g;
        int i2 = f50.g;
        String str2 = f50.f;
        if (i == 1 && i2 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i == 2 && i2 == 1 && str2 != null && !str2.equals(str)) {
            return false;
        }
        if ((i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.c == f50.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.c) * 31;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        return AbstractC0324Hi.h(sb, this.f, "'}");
    }
}
