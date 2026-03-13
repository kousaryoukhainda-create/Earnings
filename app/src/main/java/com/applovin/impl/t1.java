package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes.dex */
final class t1 {
    private final a a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    /* loaded from: classes.dex */
    public static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public t1(AudioTrack audioTrack) {
        if (xp.a >= 19) {
            this.a = new a(audioTrack);
            f();
            return;
        }
        this.a = null;
        a(3);
    }

    public void a() {
        if (this.b == 4) {
            f();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public void e() {
        a(4);
    }

    public void f() {
        if (this.a != null) {
            a(0);
        }
    }

    public boolean a(long j) {
        a aVar = this.a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean c = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        f();
                    }
                } else if (!c) {
                    f();
                }
            } else if (c) {
                if (this.a.a() > this.f) {
                    a(2);
                }
            } else {
                f();
            }
        } else if (c) {
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            a(1);
        } else if (j - this.c > 500000) {
            a(3);
        }
        return c;
    }

    private void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
        } else if (i == 1) {
            this.d = 10000L;
        } else if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else if (i == 4) {
            this.d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
