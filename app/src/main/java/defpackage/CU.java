package defpackage;
/* renamed from: CU  reason: default package */
/* loaded from: classes.dex */
public final class CU {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public CU(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final CU a(CU cu, String str) {
        long j;
        long j2;
        String c0 = AbstractC1424g90.c0(str, this.c);
        if (cu == null || !c0.equals(AbstractC1424g90.c0(str, cu.c))) {
            return null;
        }
        long j3 = cu.b;
        long j4 = this.b;
        if (j4 != -1) {
            long j5 = this.a;
            if (j5 + j4 == cu.a) {
                if (j3 == -1) {
                    j2 = -1;
                } else {
                    j2 = j4 + j3;
                }
                return new CU(c0, j5, j2);
            }
        }
        if (j3 != -1) {
            long j6 = cu.a;
            if (j6 + j3 == this.a) {
                if (j4 == -1) {
                    j = -1;
                } else {
                    j = j3 + j4;
                }
                return new CU(c0, j6, j);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CU.class != obj.getClass()) {
            return false;
        }
        CU cu = (CU) obj;
        if (this.a == cu.a && this.b == cu.b && this.c.equals(cu.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return BK.n(sb, this.b, ")");
    }
}
