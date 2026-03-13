package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class r implements v {
    public final q a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public r(q qVar) {
        this.a = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        this.a.a(rVar, hVar, dVar);
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a() {
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z) {
        int l = z ? kVar.b + kVar.l() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            kVar.e(l);
            this.d = 0;
        }
        while (kVar.a() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int l2 = kVar.l();
                    kVar.e(kVar.b - 1);
                    if (l2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.a(), 3 - this.d);
                kVar.a(this.b.a, this.d, min);
                int i2 = this.d + min;
                this.d = i2;
                if (i2 == 3) {
                    this.b.c(3);
                    this.b.f(1);
                    int l3 = this.b.l();
                    int l4 = this.b.l();
                    this.e = (l3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    this.c = (((l3 & 15) << 8) | l4) + 3;
                    int b = this.b.b();
                    int i3 = this.c;
                    if (b < i3) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = this.b;
                        byte[] bArr = kVar2.a;
                        kVar2.c(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.a(), this.c - this.d);
                kVar.a(this.b.a, this.d, min2);
                int i4 = this.d + min2;
                this.d = i4;
                int i5 = this.c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = this.b.a;
                        int i6 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i5; i8++) {
                            i7 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.h[((i7 >>> 24) ^ (bArr2[i8] & 255)) & 255] ^ (i7 << 8);
                        }
                        if (i7 != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.c(this.c - 4);
                    } else {
                        this.b.c(i5);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
