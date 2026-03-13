package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
/* loaded from: classes.dex */
public final class d implements b.a {
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;
    public final long e;
    public final int f;

    public d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return this.d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j) {
        long j2;
        long j3;
        long j4;
        if (a()) {
            long j5 = this.a;
            if (j < j5) {
                return 0L;
            }
            double d = ((j - j5) * 256.0d) / this.e;
            int b = u.b(this.d, (long) d, true, false);
            int i = b + 1;
            long j6 = this.b;
            long j7 = (i * j6) / 100;
            if (i == 0) {
                j2 = 0;
            } else {
                j2 = this.d[b];
            }
            if (i == 99) {
                j3 = 256;
            } else {
                j3 = this.d[i];
            }
            long j8 = (j6 * (b + 2)) / 100;
            if (j3 == j2) {
                j4 = 0;
            } else {
                j4 = (long) (((d - j2) * (j8 - j7)) / (j3 - j2));
            }
            return j7 + j4;
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        if (!a()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        if (f > 0.0f) {
            if (f >= 100.0f) {
                r0 = 256.0f;
            } else {
                int i = (int) f;
                r0 = i != 0 ? (float) this.d[i - 1] : 0.0f;
                r0 += (f - i) * ((i < 99 ? (float) this.d[i] : 256.0f) - r0);
            }
        }
        long round = Math.round(r0 * 0.00390625d * this.e);
        long j2 = this.a;
        long j3 = round + j2;
        long j4 = this.c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - this.f) + this.e) - 1);
    }
}
