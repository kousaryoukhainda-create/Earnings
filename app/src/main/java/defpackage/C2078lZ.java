package defpackage;
/* renamed from: lZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2078lZ {
    public final C2336oZ a;
    public final C2336oZ b;

    public C2078lZ(C2336oZ c2336oZ, C2336oZ c2336oZ2) {
        this.a = c2336oZ;
        this.b = c2336oZ2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2078lZ.class != obj.getClass()) {
            return false;
        }
        C2078lZ c2078lZ = (C2078lZ) obj;
        if (this.a.equals(c2078lZ.a) && this.b.equals(c2078lZ.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C2336oZ c2336oZ = this.a;
        sb.append(c2336oZ);
        C2336oZ c2336oZ2 = this.b;
        if (c2336oZ.equals(c2336oZ2)) {
            str = "";
        } else {
            str = ", " + c2336oZ2;
        }
        return AbstractC0324Hi.h(sb, str, "]");
    }
}
