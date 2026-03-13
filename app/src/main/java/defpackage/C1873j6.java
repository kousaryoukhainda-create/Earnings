package defpackage;
/* renamed from: j6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873j6 {
    public static final C1873j6 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public C1873j6(C1589i6 c1589i6) {
        this.a = c1589i6.a;
        this.b = c1589i6.b;
        this.c = c1589i6.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1873j6.class != obj.getClass()) {
            return false;
        }
        C1873j6 c1873j6 = (C1873j6) obj;
        if (this.a == c1873j6.a && this.b == c1873j6.b && this.c == c1873j6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
