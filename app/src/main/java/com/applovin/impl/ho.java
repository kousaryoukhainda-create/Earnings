package com.applovin.impl;
/* loaded from: classes.dex */
public final class ho {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public ho(long j) {
        d(j);
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.b == -9223372036854775807L) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    j2 = ((Long) b1.a((Long) this.d.get())).longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long e = e(j2);
                long j3 = (4294967296L + e) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - e) < Math.abs(j - e)) {
                    j = j4;
                }
            }
            return a(c(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        return this.b;
    }

    public synchronized void d(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = -9223372036854775807L;
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }

    public synchronized long b() {
        long a;
        try {
            long j = this.c;
            if (j != -9223372036854775807L) {
                a = j + this.b;
            } else {
                a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public synchronized long a() {
        long j;
        j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }
}
