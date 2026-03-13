package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import java.util.Comparator;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class j implements f, Comparator<g> {
    public final TreeSet<g> a = new TreeSet<>(this);
    public long b;

    public j(long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void a(a aVar, g gVar) {
        this.a.remove(gVar);
        this.b -= gVar.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void b(a aVar, g gVar) {
        this.a.add(gVar);
        this.b += gVar.c;
        a(aVar, 0L);
    }

    @Override // java.util.Comparator
    public int compare(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        long j = gVar3.f;
        long j2 = gVar4.f;
        if (j - j2 == 0) {
            return gVar3.compareTo(gVar4);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void a(a aVar, g gVar, g gVar2) {
        this.a.remove(gVar);
        this.b -= gVar.c;
        b(aVar, gVar2);
    }

    public final void a(a aVar, long j) {
        while (this.b + j > 10485760) {
            try {
                aVar.a(this.a.first());
            } catch (a.C0100a unused) {
            }
        }
    }
}
