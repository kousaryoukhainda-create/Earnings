package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class s {
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] b;

    public s(List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[list.size()];
    }

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        boolean z;
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a = hVar.a(dVar.c(), 3);
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.a.get(i);
            String str = iVar.f;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z, "Invalid closed caption mime type provided: " + str);
            String str2 = iVar.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(str2, str, null, -1, iVar.x, iVar.y, iVar.z, null, Long.MAX_VALUE, Collections.emptyList()));
            this.b[i] = a;
        }
    }
}
