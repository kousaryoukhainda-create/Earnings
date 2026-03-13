package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
/* loaded from: classes.dex */
public final class l implements h {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k a = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(10);
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a = hVar.a(dVar.c(), 4);
        this.b = a;
        a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        if (this.c) {
            int a = kVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(kVar.a, kVar.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.e(0);
                    if (73 == this.a.l() && 68 == this.a.l() && 51 == this.a.l()) {
                        this.a.f(3);
                        this.e = this.a.k() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.a(kVar, min2);
            this.f += min2;
        }
    }
}
