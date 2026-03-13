package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements h {
    public final List<v.a> a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public g(List<v.a> list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
        if (this.c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar : this.b) {
                nVar.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            v.a aVar = this.a.get(i);
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a = hVar.a(dVar.c(), 3);
            a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/dvbsubs", (String) null, -1, Collections.singletonList(aVar.b), aVar.a, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
            this.b[i] = a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] nVarArr;
        if (this.c) {
            if (this.d != 2 || a(kVar, 32)) {
                if (this.d != 1 || a(kVar, 0)) {
                    int i = kVar.b;
                    int a = kVar.a();
                    for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar : this.b) {
                        kVar.e(i);
                        nVar.a(kVar, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        if (kVar.a() == 0) {
            return false;
        }
        if (kVar.l() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
