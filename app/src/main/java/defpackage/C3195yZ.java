package defpackage;
/* renamed from: yZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3195yZ {
    public final long a;
    public final long b;

    public C3195yZ(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3195yZ.class != obj.getClass()) {
            return false;
        }
        C3195yZ c3195yZ = (C3195yZ) obj;
        if (this.a == c3195yZ.a && this.b == c3195yZ.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
