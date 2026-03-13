package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d {
    public final e a = new e();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(gVar != null);
        if (this.e) {
            this.e = false;
            this.b.r();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(gVar, true)) {
                    return false;
                }
                e eVar = this.a;
                int i2 = eVar.d;
                if ((eVar.a & 1) == 1 && this.b.c == 0) {
                    i2 += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(i2);
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                int b = this.b.b();
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.b;
                int i4 = kVar.c + a;
                if (b < i4) {
                    kVar.a = Arrays.copyOf(kVar.a, i4);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = this.b;
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(kVar2.a, kVar2.c, a, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar3 = this.b;
                kVar3.d(kVar3.c + a);
                this.e = this.a.f[i3 + (-1)] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            e eVar = this.a;
            if (i5 >= eVar.c) {
                break;
            }
            int[] iArr = eVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
