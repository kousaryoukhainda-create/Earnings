package defpackage;
/* renamed from: oZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336oZ {
    public static final C2336oZ c = new C2336oZ(0, 0);
    public final long a;
    public final long b;

    public C2336oZ(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2336oZ.class != obj.getClass()) {
            return false;
        }
        C2336oZ c2336oZ = (C2336oZ) obj;
        if (this.a == c2336oZ.a && this.b == c2336oZ.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return BK.n(sb, this.b, "]");
    }
}
