package defpackage;

import java.util.List;
/* renamed from: I50  reason: default package */
/* loaded from: classes.dex */
public final class I50 {
    public final String a;
    public final boolean b;
    public final List c;

    public I50(String str, List list, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I50.class != obj.getClass()) {
            return false;
        }
        I50 i50 = (I50) obj;
        if (this.b != i50.b || !this.c.equals(i50.c)) {
            return false;
        }
        String str = this.a;
        boolean startsWith = str.startsWith("index_");
        String str2 = i50.a;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + (((hashCode * 31) + (this.b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
