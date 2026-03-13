package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.applovin.exoplayer2.common.base.Ascii;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements h {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k b;
    public final String c;
    public String d;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n e;
    public int f = 0;
    public int g;
    public boolean h;
    public long i;
    public com.fyber.inneractive.sdk.player.exoplayer2.i j;
    public int k;
    public long l;

    public b(String str) {
        byte[] bArr = new byte[8];
        this.a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(bArr);
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(bArr);
        this.c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = hVar.a(dVar.c(), 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        this.l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int a;
        int i;
        int i2;
        String str;
        int i3;
        while (kVar.a() > 0) {
            int i4 = this.f;
            if (i4 == 0) {
                while (true) {
                    if (kVar.a() <= 0) {
                        break;
                    } else if (!this.h) {
                        this.h = kVar.l() == 11;
                    } else {
                        int l = kVar.l();
                        if (l == 119) {
                            this.h = false;
                            this.f = 1;
                            byte[] bArr = this.b.a;
                            bArr[0] = Ascii.VT;
                            bArr[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = l == 11;
                    }
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(kVar.a(), 8 - this.g);
                System.arraycopy(kVar.a, kVar.b, bArr2, this.g, min);
                kVar.b += min;
                int i5 = this.g + min;
                this.g = i5;
                if (i5 == 8) {
                    this.a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = this.a;
                    int i6 = (jVar.b * 8) + jVar.c;
                    jVar.c(40);
                    boolean z = jVar.a(5) == 16;
                    jVar.b(i6);
                    int i7 = 6;
                    if (z) {
                        jVar.c(21);
                        i2 = (jVar.a(11) + 1) * 2;
                        int a2 = jVar.a(2);
                        if (a2 == 3) {
                            i = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.c[jVar.a(2)];
                        } else {
                            i7 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a[jVar.a(2)];
                            i = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[a2];
                        }
                        i3 = i7 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        a = jVar.a(3);
                        str = "audio/eac3";
                    } else {
                        jVar.c(32);
                        int a3 = jVar.a(2);
                        int a4 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(a3, jVar.a(6));
                        jVar.c(8);
                        a = jVar.a(3);
                        if ((a & 1) != 0 && a != 1) {
                            jVar.c(2);
                        }
                        if ((a & 4) != 0) {
                            jVar.c(2);
                        }
                        if (a == 2) {
                            jVar.c(2);
                        }
                        i = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[a3];
                        i2 = a4;
                        str = "audio/ac3";
                        i3 = 1536;
                    }
                    int i8 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[a] + (jVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.j;
                    if (iVar == null || i8 != iVar.r || i != iVar.s || str != iVar.f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.i a5 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(this.d, str, (String) null, -1, -1, i8, i, -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, this.c);
                        this.j = a5;
                        this.e.a(a5);
                    }
                    this.k = i2;
                    this.i = (i3 * 1000000) / this.j.s;
                    this.b.e(0);
                    this.e.a(this.b, 8);
                    this.f = 2;
                }
            } else if (i4 == 2) {
                int min2 = Math.min(kVar.a(), this.k - this.g);
                this.e.a(kVar, min2);
                int i9 = this.g + min2;
                this.g = i9;
                int i10 = this.k;
                if (i9 == i10) {
                    this.e.a(this.l, 1, i10, 0, null);
                    this.l += this.i;
                    this.f = 0;
                }
            }
        }
    }
}
