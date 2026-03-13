package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
/* loaded from: classes.dex */
public final class o implements v {
    public final h a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j b = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[10]);
    public int c = 0;
    public int d;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.r e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public o(h hVar) {
        this.a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        this.e = rVar;
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z) {
        if (z) {
            int i = this.c;
            if (i == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                if (this.j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                }
                this.a.b();
            }
            a(1);
        }
        while (kVar.a() > 0) {
            int i2 = this.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (a(kVar, this.b.a, Math.min(10, this.i)) && a(kVar, (byte[]) null, this.i)) {
                            this.b.b(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                this.b.c(4);
                                this.b.c(1);
                                this.b.c(1);
                                long a = (this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15);
                                this.b.c(1);
                                if (!this.h && this.g) {
                                    this.b.c(4);
                                    this.b.c(1);
                                    this.b.c(1);
                                    long a2 = (this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15);
                                    this.b.c(1);
                                    this.e.b(a2);
                                    this.h = true;
                                }
                                this.l = this.e.b(a);
                            }
                            this.a.a(this.l, this.k);
                            a(3);
                        }
                    } else if (i2 == 3) {
                        int a3 = kVar.a();
                        int i3 = this.j;
                        r8 = i3 != -1 ? a3 - i3 : 0;
                        if (r8 > 0) {
                            a3 -= r8;
                            kVar.d(kVar.b + a3);
                        }
                        this.a.a(kVar);
                        int i4 = this.j;
                        if (i4 != -1) {
                            int i5 = i4 - a3;
                            this.j = i5;
                            if (i5 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(kVar, this.b.a, 9)) {
                    this.b.b(0);
                    int a4 = this.b.a(24);
                    if (a4 != 1) {
                        AbstractC2437ph.o(a4, "Unexpected start code prefix: ", "PesReader");
                        this.j = -1;
                    } else {
                        this.b.c(8);
                        int a5 = this.b.a(16);
                        this.b.c(5);
                        this.k = this.b.b();
                        this.b.c(2);
                        this.f = this.b.b();
                        this.g = this.b.b();
                        this.b.c(6);
                        int a6 = this.b.a(8);
                        this.i = a6;
                        if (a5 == 0) {
                            this.j = -1;
                        } else {
                            this.j = (a5 - 3) - a6;
                        }
                        r8 = 2;
                    }
                    a(r8);
                }
            } else {
                kVar.f(kVar.a());
            }
        }
    }

    public final void a(int i) {
        this.c = i;
        this.d = 0;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.f(min);
        } else {
            System.arraycopy(kVar.a, kVar.b, bArr, this.d, min);
            kVar.b += min;
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }
}
