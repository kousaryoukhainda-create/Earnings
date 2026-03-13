package defpackage;
/* renamed from: j2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865j2 {
    public final long a;
    public final long b;

    public C1865j2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1865j2)) {
            return false;
        }
        C1865j2 c1865j2 = (C1865j2) obj;
        if (this.a == c1865j2.a && this.b == c1865j2.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
