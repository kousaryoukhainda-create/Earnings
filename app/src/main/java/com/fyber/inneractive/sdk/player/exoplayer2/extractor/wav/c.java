package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(g gVar, k kVar) throws IOException, InterruptedException {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(kVar.a, 0, 8, false);
            kVar.e(0);
            return new a(kVar.c(), kVar.f());
        }
    }

    public static b a(g gVar) throws IOException, InterruptedException {
        boolean z;
        gVar.getClass();
        k kVar = new k(16);
        if (a.a(gVar, kVar).a != u.a("RIFF")) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(kVar.a, 0, 4, false);
        kVar.e(0);
        int c = kVar.c();
        if (c != u.a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + c);
            return null;
        }
        a a2 = a.a(gVar, kVar);
        while (a2.a != u.a("fmt ")) {
            bVar.a((int) a2.b, false);
            a2 = a.a(gVar, kVar);
        }
        if (a2.b >= 16) {
            z = true;
        } else {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z);
        bVar.a(kVar.a, 0, 16, false);
        kVar.e(0);
        int h = kVar.h();
        int h2 = kVar.h();
        int g = kVar.g();
        int g2 = kVar.g();
        int h3 = kVar.h();
        int h4 = kVar.h();
        int i = (h2 * h4) / 8;
        if (h3 == i) {
            int a3 = u.a(h4);
            if (a3 == 0) {
                Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + h4);
                return null;
            } else if (h != 1 && h != 65534) {
                Log.e("WavHeaderReader", "Unsupported WAV format type: " + h);
                return null;
            } else {
                bVar.a(((int) a2.b) - 16, false);
                return new b(h2, g, g2, h3, h4, a3);
            }
        }
        throw new l(AbstractC0324Hi.d(i, h3, "Expected block alignment: ", "; got: "));
    }
}
