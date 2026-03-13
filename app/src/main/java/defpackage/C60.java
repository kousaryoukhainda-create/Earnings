package defpackage;
/* renamed from: C60  reason: default package */
/* loaded from: classes.dex */
public final class C60 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public C0905b2 g = C0905b2.c;

    static {
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        C0814a2 a = this.g.a(i);
        if (a.a != -1) {
            return a.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i;
        C0814a2 a;
        int i2;
        C0905b2 c0905b2 = this.g;
        long j2 = this.d;
        c0905b2.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            i = c0905b2.a;
            if (i3 >= i) {
                break;
            }
            c0905b2.a(i3).getClass();
            c0905b2.a(i3).getClass();
            if (0 > j && ((i2 = (a = c0905b2.a(i3)).a) == -1 || a.a(-1) < i2)) {
                break;
            }
            i3++;
        }
        if (i3 >= i) {
            return -1;
        }
        return i3;
    }

    public final int c(long j) {
        C0905b2 c0905b2 = this.g;
        int i = c0905b2.a - 1;
        c0905b2.b(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            c0905b2.a(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C0814a2 a = c0905b2.a(i);
            int i2 = a.a;
            if (i2 != -1) {
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = a.e[i3];
                    if (i4 == 0 || i4 == 1) {
                        return i;
                    }
                }
            } else {
                return i;
            }
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C60.class.equals(obj.getClass())) {
            return false;
        }
        C60 c60 = (C60) obj;
        if (Ha0.a(this.a, c60.a) && Ha0.a(this.b, c60.b) && this.c == c60.c && this.d == c60.d && this.e == c60.e && this.f == c60.f && Ha0.a(this.g, c60.g)) {
            return true;
        }
        return false;
    }

    public final boolean f(int i) {
        C0905b2 c0905b2 = this.g;
        if (i == c0905b2.a - 1) {
            c0905b2.b(i);
            return false;
        }
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, C0905b2 c0905b2, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = c0905b2;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (217 + hashCode) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return this.g.hashCode() + ((((((((((i2 + i) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
