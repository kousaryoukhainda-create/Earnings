package defpackage;
/* renamed from: nZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2250nZ {
    public static final C2250nZ c;
    public final long a;
    public final long b;

    static {
        C2250nZ c2250nZ = new C2250nZ(0L, 0L);
        new C2250nZ(Long.MAX_VALUE, Long.MAX_VALUE);
        new C2250nZ(Long.MAX_VALUE, 0L);
        new C2250nZ(0L, Long.MAX_VALUE);
        c = c2250nZ;
    }

    public C2250nZ(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        B10.j(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.b;
        long j5 = this.a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = Ha0.a;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z2 = false;
        if (j6 <= j2 && j2 <= j7) {
            z = true;
        } else {
            z = false;
        }
        if (j6 <= j3 && j3 <= j7) {
            z2 = true;
        }
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        } else if (z) {
            return j2;
        } else {
            if (z2) {
                return j3;
            }
            return j6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2250nZ.class != obj.getClass()) {
            return false;
        }
        C2250nZ c2250nZ = (C2250nZ) obj;
        if (this.a == c2250nZ.a && this.b == c2250nZ.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
