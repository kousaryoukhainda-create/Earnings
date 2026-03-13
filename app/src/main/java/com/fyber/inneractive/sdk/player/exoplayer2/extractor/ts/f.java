package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.applovin.exoplayer2.common.base.Ascii;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements h {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k a;
    public final String b;
    public String c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n d;
    public int e;
    public int f;
    public int g;
    public long h;
    public com.fyber.inneractive.sdk.player.exoplayer2.i i;
    public int j;
    public long k;

    public f(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(new byte[15]);
        this.a = kVar;
        byte[] bArr = kVar.a;
        bArr[0] = Ascii.DEL;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.e = 0;
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = hVar.a(dVar.c(), 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        this.k = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        byte b;
        while (kVar.a() > 0) {
            int i = this.e;
            if (i == 0) {
                while (true) {
                    if (kVar.a() > 0) {
                        int i2 = this.g << 8;
                        this.g = i2;
                        int l = i2 | kVar.l();
                        this.g = l;
                        if (l == 2147385345) {
                            this.g = 0;
                            this.f = 4;
                            this.e = 1;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(kVar.a(), 15 - this.f);
                System.arraycopy(kVar.a, kVar.b, bArr, this.f, min);
                kVar.b += min;
                int i3 = this.f + min;
                this.f = i3;
                if (i3 == 15) {
                    byte[] bArr2 = this.a.a;
                    if (this.i == null) {
                        String str = this.c;
                        String str2 = this.b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(bArr2, bArr2.length);
                        jVar.c(60);
                        int i4 = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.a[jVar.a(6)];
                        int i5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.b[jVar.a(4)];
                        int a = jVar.a(5);
                        int[] iArr = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.c;
                        int i6 = a >= iArr.length ? -1 : (iArr[a] * 1000) / 2;
                        jVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.i a2 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(str, "audio/vnd.dts", (String) null, i6, -1, i4 + (jVar.a(2) > 0 ? 1 : 0), i5, -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, str2);
                        this.i = a2;
                        this.d.a(a2);
                    }
                    this.j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.h = (int) (((((((bArr2[4] & 1) << 6) | ((b & 252) >> 2)) + 1) * 32) * 1000000) / this.i.s);
                    this.a.e(0);
                    this.d.a(this.a, 15);
                    this.e = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.a(), this.j - this.f);
                this.d.a(kVar, min2);
                int i7 = this.f + min2;
                this.f = i7;
                int i8 = this.j;
                if (i7 == i8) {
                    this.d.a(this.k, 1, i8, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            }
        }
    }
}
