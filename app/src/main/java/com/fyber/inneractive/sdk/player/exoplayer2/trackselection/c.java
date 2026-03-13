package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
/* loaded from: classes.dex */
public final class c extends a {
    public final int g;
    public final Object h;

    public c(r rVar, int i) {
        this(rVar, i, 0, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public void a(long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public int d() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public int e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public Object g() {
        return this.h;
    }

    public c(r rVar, int i, int i2, Object obj) {
        super(rVar, i);
        this.g = i2;
        this.h = null;
    }
}
