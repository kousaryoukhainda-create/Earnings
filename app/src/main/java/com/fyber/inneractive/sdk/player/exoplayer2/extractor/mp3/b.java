package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements f {
    public static final int m = u.a("Xing");
    public static final int n = u.a("Info");
    public static final int o = u.a("VBRI");
    public final long a;
    public h e;
    public n f;
    public int g;
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a h;
    public a i;
    public long k;
    public int l;
    public final k b = new k(10);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.k();
    public final j d = new j();
    public long j = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a extends m {
        long b(long j);
    }

    public b(int i, long j) {
        this.a = j;
    }

    public static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        return a(gVar, true);
    }

    public final a b(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(this.b.a, 0, 4, false);
        this.b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.k.a(this.b.c(), this.c);
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a(bVar.c, this.c.f, bVar.b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.e = hVar;
        this.f = hVar.a(0, 1);
        this.e.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.g = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r12 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.n) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r39, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r40) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r13.c(r3 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
        r13.e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
        r12.g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r13, boolean r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, boolean):boolean");
    }
}
