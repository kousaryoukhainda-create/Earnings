package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public k(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z2);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iArr2.length == jArr2.length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = jArr.length;
    }

    public int a(long j) {
        for (int b = u.b(this.e, j, true, false); b >= 0; b--) {
            if ((this.f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int a = u.a(this.e, j, true, false); a < this.e.length; a++) {
            if ((this.f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
