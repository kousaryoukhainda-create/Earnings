package defpackage;
/* renamed from: eW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275eW {
    public static final C1275eW c = new C1275eW(0, false);
    public final int a;
    public final boolean b;

    public C1275eW(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1275eW.class != obj.getClass()) {
            return false;
        }
        C1275eW c1275eW = (C1275eW) obj;
        if (this.a == c1275eW.a && this.b == c1275eW.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
