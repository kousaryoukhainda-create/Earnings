package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
/* loaded from: classes.dex */
public final class t implements q {
    public com.fyber.inneractive.sdk.player.exoplayer2.util.r a;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n b;
    public boolean c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        this.a = rVar;
        dVar.a();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a = hVar.a(dVar.c(), 4);
        this.b = a;
        a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/x-scte35", null, -1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r4 != Long.MAX_VALUE) goto L12;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r11) {
        /*
            r10 = this;
            boolean r0 = r10.c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L29
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r0 = r10.a
            long r3 = r0.a()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            return
        L14:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r0 = r10.b
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r3 = r10.a
            long r3 = r3.a()
            r5 = 0
            java.lang.String r6 = "application/x-scte35"
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(r5, r6, r3)
            r0.a(r3)
            r0 = 1
            r10.c = r0
        L29:
            int r7 = r11.a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r0 = r10.b
            r0.a(r11, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r3 = r10.b
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r11 = r10.a
            long r4 = r11.c
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            long r1 = r11.c
        L3e:
            r4 = r1
            goto L4b
        L40:
            long r4 = r11.a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 == 0) goto L3e
        L4b:
            r8 = 0
            r9 = 0
            r6 = 1
            r3.a(r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.t.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }
}
