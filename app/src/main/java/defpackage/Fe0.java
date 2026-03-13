package defpackage;
/* renamed from: Fe0  reason: default package */
/* loaded from: classes.dex */
public final class Fe0 {
    public static final String s = EI.e("WorkSpec");
    public String a;
    public int b = 1;
    public String c;
    public String d;
    public C2187ml e;
    public C2187ml f;
    public long g;
    public long h;
    public long i;
    public C0478Nh j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    public Fe0(String str, String str2) {
        C2187ml c2187ml = C2187ml.c;
        this.e = c2187ml;
        this.f = c2187ml;
        this.j = C0478Nh.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = str;
        this.c = str2;
    }

    public final long a() {
        int i;
        long scalb;
        if (this.b == 1 && (i = this.k) > 0) {
            if (this.l == 2) {
                scalb = this.m * i;
            } else {
                scalb = Math.scalb((float) this.m, i - 1);
            }
            return Math.min(18000000L, scalb) + this.n;
        }
        long j = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.n;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 == 0) {
                j2 = this.g + currentTimeMillis;
            }
            long j3 = this.i;
            long j4 = this.h;
            if (j3 != j4) {
                if (i2 == 0) {
                    j = j3 * (-1);
                }
                return j2 + j4 + j;
            }
            if (i2 != 0) {
                j = j4;
            }
            return j2 + j;
        }
        long j5 = this.n;
        if (j5 == 0) {
            j5 = System.currentTimeMillis();
        }
        return j5 + this.g;
    }

    public final boolean b() {
        return !C0478Nh.i.equals(this.j);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Fe0.class != obj.getClass()) {
            return false;
        }
        Fe0 fe0 = (Fe0) obj;
        if (this.g != fe0.g || this.h != fe0.h || this.i != fe0.i || this.k != fe0.k || this.m != fe0.m || this.n != fe0.n || this.o != fe0.o || this.p != fe0.p || this.q != fe0.q || !this.a.equals(fe0.a) || this.b != fe0.b || !this.c.equals(fe0.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? fe0.d != null : !str.equals(fe0.d)) {
            return false;
        }
        if (this.e.equals(fe0.e) && this.f.equals(fe0.f) && this.j.equals(fe0.j) && this.l == fe0.l && this.r == fe0.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b = AbstractC2437ph.b((AbstractC0324Hi.A(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.e.hashCode();
        int hashCode2 = this.f.hashCode();
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        int hashCode3 = this.j.hashCode();
        int A = AbstractC0324Hi.A(this.l);
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        return AbstractC0324Hi.A(this.r) + ((((((((((((A + ((((hashCode3 + ((((((((hashCode2 + ((hashCode + ((b + i) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC0324Hi.h(new StringBuilder("{WorkSpec: "), this.a, "}");
    }
}
