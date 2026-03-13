package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
/* loaded from: classes.dex */
public final class a implements m {
    public final long[] a;
    public final long[] b;
    public final long c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.c = jArr2[i] + jArr3[i];
            return;
        }
        this.c = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        return this.a[u.b(this.b, j, true, true)];
    }
}
