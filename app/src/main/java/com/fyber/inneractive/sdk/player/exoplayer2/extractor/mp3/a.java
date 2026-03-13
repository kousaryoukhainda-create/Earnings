package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
/* loaded from: classes.dex */
public final class a implements b.a {
    public final long a;
    public final int b;
    public final long c;

    public a(long j, int i, long j2) {
        long b;
        this.a = j;
        this.b = i;
        if (j2 == -1) {
            b = -9223372036854775807L;
        } else {
            b = b(j2);
        }
        this.c = b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return this.c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        long j2 = this.c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = u.a;
        long max = Math.max(0L, Math.min(j, j2));
        return ((max * this.b) / 8000000) + this.a;
    }
}
