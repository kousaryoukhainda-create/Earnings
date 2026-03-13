package com.applovin.impl;
/* loaded from: classes.dex */
public final class jj {
    public static final jj c;
    public static final jj d;
    public static final jj e;
    public static final jj f;
    public static final jj g;
    public final long a;
    public final long b;

    static {
        jj jjVar = new jj(0L, 0L);
        c = jjVar;
        d = new jj(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new jj(Long.MAX_VALUE, 0L);
        f = new jj(0L, Long.MAX_VALUE);
        g = jjVar;
    }

    public jj(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        b1.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public long a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long d2 = xp.d(j, j4, Long.MIN_VALUE);
        long a = xp.a(j, this.b, Long.MAX_VALUE);
        boolean z2 = false;
        if (d2 <= j2 && j2 <= a) {
            z = true;
        } else {
            z = false;
        }
        if (d2 <= j3 && j3 <= a) {
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
            return d2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jj.class != obj.getClass()) {
            return false;
        }
        jj jjVar = (jj) obj;
        if (this.a == jjVar.a && this.b == jjVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
