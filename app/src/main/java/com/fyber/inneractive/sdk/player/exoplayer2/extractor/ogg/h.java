package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class h {
    public d a;
    public n b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h c;
    public f d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public a j;
    public long k;
    public boolean l;
    public boolean m;

    /* loaded from: classes.dex */
    public static class a {
        public com.fyber.inneractive.sdk.player.exoplayer2.i a;
        public f b;
    }

    /* loaded from: classes.dex */
    public static final class b implements f {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public m b() {
            return new m.a(-9223372036854775807L);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long c(long j) {
            return 0L;
        }
    }

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar);

    public void a(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j, a aVar) throws IOException, InterruptedException;

    public void b(long j) {
        this.g = j;
    }

    public long a(long j) {
        return (this.i * j) / 1000000;
    }
}
