package defpackage;
/* renamed from: J60  reason: default package */
/* loaded from: classes.dex */
public final class J60 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public J60(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
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

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                if (Math.abs(j5 - j3) < Math.abs(j6 - j3)) {
                    j = j5;
                } else {
                    j = j6;
                }
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.c;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = j4 / 8589934592L;
            Long.signum(j5);
            long j6 = (j5 * 8589934592L) + j;
            j2 = ((j5 + 1) * 8589934592L) + j;
            if (j6 >= j4) {
                j2 = j6;
            }
        } else {
            j2 = j;
        }
        return a((j2 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        boolean z;
        if (this.b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void g(long j) {
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

    public final synchronized void h(long j, boolean z) {
        boolean z2;
        try {
            if (this.a == 9223372036854775806L) {
                z2 = true;
            } else {
                z2 = false;
            }
            B10.u(z2);
            if (f()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
