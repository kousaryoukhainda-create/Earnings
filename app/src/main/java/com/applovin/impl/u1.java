package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class u1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private t1 f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public u1(a aVar) {
        this.a = (a) b1.a(aVar);
        if (xp.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private boolean a() {
        return this.h && ((AudioTrack) b1.a(this.c)).getPlayState() == 2 && b() == 0;
    }

    private void h(long j) {
        Method method;
        if (!this.q || (method = this.n) == null || j - this.r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) xp.a((Integer) method.invoke(b1.a(this.c), null))).intValue() * 1000) - this.i;
            this.o = intValue;
            long max = Math.max(intValue, 0L);
            this.o = max;
            if (max > 5000000) {
                this.a.b(max);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.r = j;
    }

    public int b(long j) {
        return this.e - ((int) (j - (b() * this.d)));
    }

    public long c(long j) {
        return t2.b(a(j - b()));
    }

    public void d(long j) {
        this.z = b();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public boolean e(long j) {
        return j > b() || a();
    }

    public boolean f(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public boolean g(long j) {
        int playState = ((AudioTrack) b1.a(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            } else if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean e = e(j);
        this.p = e;
        if (z && !e && playState != 1) {
            this.a.a(this.e, t2.b(this.i));
        }
        return true;
    }

    public void i() {
        ((t1) b1.a(this.f)).f();
    }

    private long c() {
        return a(b());
    }

    private void e() {
        long c = c();
        if (c == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.m >= 30000) {
            long[] jArr = this.b;
            int i = this.v;
            jArr[i] = c - nanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = nanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l = (this.b[i3] / i4) + this.l;
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        a(nanoTime, c);
        h(nanoTime);
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) b1.a(this.c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & KeyboardMap.kValueMask;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (xp.a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public boolean f() {
        h();
        if (this.x == -9223372036854775807L) {
            ((t1) b1.a(this.f)).f();
            return true;
        }
        return false;
    }

    private long a(long j) {
        return (j * 1000000) / this.g;
    }

    public boolean d() {
        return ((AudioTrack) b1.a(this.c)).getPlayState() == 3;
    }

    public long a(boolean z) {
        long j;
        long j2;
        if (((AudioTrack) b1.a(this.c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        t1 t1Var = (t1) b1.a(this.f);
        boolean d = t1Var.d();
        if (d) {
            j2 = xp.a(nanoTime - t1Var.c(), this.j) + a(t1Var.b());
        } else {
            if (this.w == 0) {
                j = c();
            } else {
                j = this.l + nanoTime;
            }
            j2 = j;
            if (!z) {
                j2 = Math.max(0L, j2 - this.o);
            }
        }
        if (this.D != d) {
            this.F = this.C;
            this.E = this.B;
        }
        long j3 = nanoTime - this.F;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            long j5 = j2 * j4;
            long j6 = 1000 - j4;
            j2 = ((j6 * (xp.a(j3, this.j) + this.E)) + j5) / 1000;
        }
        if (!this.k) {
            long j7 = this.B;
            if (j2 > j7) {
                this.k = true;
                this.a.a(System.currentTimeMillis() - t2.b(xp.b(t2.b(j2 - j7), this.j)));
            }
        }
        this.C = nanoTime;
        this.B = j2;
        this.D = d;
        return j2;
    }

    public void g() {
        h();
        this.c = null;
        this.f = null;
    }

    private void h() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    private void a(long j, long j2) {
        t1 t1Var = (t1) b1.a(this.f);
        if (t1Var.a(j)) {
            long c = t1Var.c();
            long b = t1Var.b();
            if (Math.abs(c - j) > 5000000) {
                this.a.b(b, c, j, j2);
                t1Var.e();
            } else if (Math.abs(a(b) - j2) > 5000000) {
                this.a.a(b, c, j, j2);
                t1Var.e();
            } else {
                t1Var.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new t1(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && a(i);
        boolean g = xp.g(i);
        this.q = g;
        this.i = g ? a(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void a(float f) {
        this.j = f;
        t1 t1Var = this.f;
        if (t1Var != null) {
            t1Var.f();
        }
    }

    private static boolean a(int i) {
        return xp.a < 23 && (i == 5 || i == 6);
    }
}
