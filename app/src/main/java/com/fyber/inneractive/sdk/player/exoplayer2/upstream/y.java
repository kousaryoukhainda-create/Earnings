package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;
/* loaded from: classes.dex */
public final class y<T> implements x.c {
    public final j a;
    public final g b;
    public final a<? extends T> c;
    public volatile T d;
    public volatile boolean e;
    public volatile long f;

    /* loaded from: classes.dex */
    public interface a<T> {
    }

    public y(g gVar, Uri uri, int i, a<? extends T> aVar) {
        this.b = gVar;
        this.a = new j(uri, 1);
        this.c = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final boolean a() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void b() {
        this.e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void load() throws IOException, InterruptedException {
        i iVar = new i(this.b, this.a);
        try {
            if (!iVar.d) {
                iVar.a.a(iVar.b);
                iVar.d = true;
            }
            this.d = (T) ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d) this.c).a(this.b.a(), iVar);
            this.f = iVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(iVar);
        } catch (Throwable th) {
            this.f = iVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(iVar);
            throw th;
        }
    }
}
