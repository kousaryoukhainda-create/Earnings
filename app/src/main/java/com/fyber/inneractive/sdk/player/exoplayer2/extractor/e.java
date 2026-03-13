package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e implements n {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public int a(g gVar, int i, boolean z) throws IOException, InterruptedException {
        int b = ((b) gVar).b(i);
        if (b == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        kVar.e(kVar.b + i);
    }
}
