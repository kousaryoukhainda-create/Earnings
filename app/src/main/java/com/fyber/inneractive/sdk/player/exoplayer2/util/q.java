package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class q implements g {
    public boolean a;
    public long b;
    public long c;
    public com.fyber.inneractive.sdk.player.exoplayer2.m d = com.fyber.inneractive.sdk.player.exoplayer2.m.d;

    public void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public com.fyber.inneractive.sdk.player.exoplayer2.m i() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public long o() {
        long j;
        long j2 = this.b;
        if (this.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
            com.fyber.inneractive.sdk.player.exoplayer2.m mVar = this.d;
            if (mVar.a == 1.0f) {
                j = com.fyber.inneractive.sdk.player.exoplayer2.b.a(elapsedRealtime);
            } else {
                j = elapsedRealtime * mVar.c;
            }
            return j2 + j;
        }
        return j2;
    }

    public void a(g gVar) {
        a(gVar.o());
        this.d = gVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public com.fyber.inneractive.sdk.player.exoplayer2.m a(com.fyber.inneractive.sdk.player.exoplayer2.m mVar) {
        if (this.a) {
            a(o());
        }
        this.d = mVar;
        return mVar;
    }
}
