package com.fyber.inneractive.sdk.player.exoplayer2.source;
/* loaded from: classes.dex */
public final class h implements p {
    public final p[] a;

    public h(p[] pVarArr) {
        this.a = pVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        long j = Long.MAX_VALUE;
        for (p pVar : this.a) {
            long a = pVar.a();
            if (a != Long.MIN_VALUE) {
                j = Math.min(j, a);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public boolean a(long j) {
        p[] pVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long a = a();
            if (a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (p pVar : this.a) {
                if (pVar.a() == a) {
                    z |= pVar.a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
