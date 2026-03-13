package defpackage;
/* renamed from: zT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3275zT {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public C3275zT(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3275zT)) {
            return false;
        }
        C3275zT c3275zT = (C3275zT) obj;
        if (Ha0.a(this.a, c3275zT.a) && Ha0.a(this.b, c3275zT.b) && Ha0.a(this.c, c3275zT.c) && Ha0.a(this.d, c3275zT.d) && Ha0.a(this.e, c3275zT.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
