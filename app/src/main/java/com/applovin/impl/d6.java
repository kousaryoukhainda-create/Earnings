package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.sd;
/* loaded from: classes.dex */
public final class d6 implements jc {
    private final float a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    /* loaded from: classes.dex */
    public static final class b {
        private float a = 0.97f;
        private float b = 1.03f;
        private long c = 1000;
        private float d = 1.0E-7f;
        private long e = t2.a(20L);
        private long f = t2.a(500L);
        private float g = 0.999f;

        public d6 a() {
            return new d6(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    private d6(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    private static long a(long j, long j2, float f) {
        return ((1.0f - f) * ((float) j2)) + (((float) j) * f);
    }

    private void b(long j) {
        long j2 = (this.s * 3) + this.r;
        if (this.m > j2) {
            float a2 = (float) t2.a(this.c);
            this.m = rc.a(j2, this.j, this.m - (((this.p - 1.0f) * a2) + ((this.n - 1.0f) * a2)));
            return;
        }
        long b2 = xp.b(j - (Math.max(0.0f, this.p - 1.0f) / this.d), this.m, j2);
        this.m = b2;
        long j3 = this.l;
        if (j3 == -9223372036854775807L || b2 <= j3) {
            return;
        }
        this.m = j3;
    }

    private void c() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            long j2 = this.i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.jc
    public float a(long j, long j2) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j, j2);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        b(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = xp.a((this.d * ((float) j3)) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    @Override // com.applovin.impl.jc
    public long b() {
        return this.m;
    }

    private void b(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == -9223372036854775807L) {
            this.r = j3;
            this.s = 0L;
            return;
        }
        long max = Math.max(j3, a(j4, j3, this.g));
        this.r = max;
        this.s = a(this.s, Math.abs(j3 - max), this.g);
    }

    @Override // com.applovin.impl.jc
    public void a() {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.m = j3;
        }
        this.q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.jc
    public void a(sd.f fVar) {
        this.h = t2.a(fVar.a);
        this.k = t2.a(fVar.b);
        this.l = t2.a(fVar.c);
        float f = fVar.d;
        if (f == -3.4028235E38f) {
            f = this.a;
        }
        this.o = f;
        float f2 = fVar.f;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        c();
    }

    @Override // com.applovin.impl.jc
    public void a(long j) {
        this.i = j;
        c();
    }
}
