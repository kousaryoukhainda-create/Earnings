package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public final class z implements g {
    public final g a;
    public final f b;

    public z(g gVar, f fVar) {
        this.a = (g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.b = (f) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws IOException {
        long a = this.a.a(jVar);
        if (jVar.e == -1 && a != -1) {
            jVar = new j(jVar.a, null, jVar.c, jVar.d, a, jVar.f, jVar.g);
        }
        this.b.a(jVar);
        return a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        try {
            this.a.close();
        } finally {
            this.b.close();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.a.a(bArr, i, i2);
        if (a > 0) {
            this.b.a(bArr, i, a);
        }
        return a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.a.a();
    }
}
