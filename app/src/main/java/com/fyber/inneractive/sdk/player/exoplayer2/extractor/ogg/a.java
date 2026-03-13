package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a implements f {
    public final e a = new e();
    public final long b;
    public final long c;
    public final h d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0094a implements m {
        public C0094a() {
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            a aVar = a.this;
            return (aVar.f * 1000000) / aVar.d.i;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j) {
            if (j == 0) {
                return a.this.b;
            }
            a aVar = a.this;
            long j2 = aVar.b;
            long j3 = aVar.c;
            long j4 = ((((j3 - j2) * ((aVar.d.i * j) / 1000000)) / aVar.f) - 30000) + j2;
            if (j4 >= j2) {
                j2 = j4;
            }
            return j2 >= j3 ? j3 - 1 : j2;
        }
    }

    public a(long j, long j2, h hVar, int i, long j3) {
        boolean z;
        if (j >= 0 && j2 > j) {
            z = true;
        } else {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
        this.d = hVar;
        this.b = j;
        this.c = j2;
        if (i == j2 - j) {
            this.f = j3;
            this.e = 3;
            return;
        }
        this.e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        e eVar;
        long j;
        long min;
        int i = this.e;
        if (i == 0) {
            long j2 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c;
            this.g = j2;
            this.e = 1;
            long j3 = this.c - 65307;
            if (j3 > j2) {
                return j3;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j4 = this.h;
            long j5 = 0;
            if (j4 != 0) {
                long j6 = this.i;
                long j7 = this.j;
                if (j6 == j7) {
                    min = -(this.k + 2);
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                    long j8 = bVar.c;
                    if (!a(gVar, j7)) {
                        min = this.i;
                        if (min == j8) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        this.a.a(gVar, false);
                        bVar.e = 0;
                        e eVar2 = this.a;
                        long j9 = eVar2.b;
                        long j10 = j4 - j9;
                        int i2 = eVar2.d + eVar2.e;
                        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i3 >= 0 && j10 <= 72000) {
                            bVar.c(i2);
                            j = this.a.b;
                        } else {
                            if (i3 < 0) {
                                this.j = j8;
                                this.l = j9;
                            } else {
                                long j11 = i2;
                                long j12 = bVar.c + j11;
                                this.i = j12;
                                this.k = j9;
                                if ((this.j - j12) + j11 < 100000) {
                                    bVar.c(i2);
                                    j = this.k;
                                }
                            }
                            long j13 = this.j;
                            long j14 = this.i;
                            long j15 = j13 - j14;
                            if (j15 < 100000) {
                                this.j = j14;
                                min = j14;
                            } else {
                                min = Math.min(Math.max(((j10 * j15) / (this.l - this.k)) + (bVar.c - (i2 * (i3 <= 0 ? 2 : 1))), j14), this.j - 1);
                            }
                        }
                        min = -(j + 2);
                    }
                }
                if (min >= 0) {
                    return min;
                }
                long j16 = this.h;
                this.a.a(gVar, false);
                j5 = -(min + 2);
                while (true) {
                    e eVar3 = this.a;
                    if (eVar3.b >= j16) {
                        break;
                    }
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(eVar3.d + eVar3.e);
                    e eVar4 = this.a;
                    j5 = eVar4.b;
                    eVar4.a(gVar, false);
                }
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).e = 0;
            }
            this.e = 3;
            return -(j5 + 2);
        }
        if (a(gVar, this.c)) {
            this.a.a();
            while (true) {
                eVar = this.a;
                if ((eVar.a & 4) == 4) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                if (bVar2.c >= this.c) {
                    break;
                }
                eVar.a(gVar, false);
                e eVar5 = this.a;
                bVar2.c(eVar5.d + eVar5.e);
            }
            this.f = eVar.b;
            this.e = 3;
            return this.g;
        }
        throw new EOFException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public m b() {
        if (this.f != 0) {
            return new C0094a();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
    public long c(long j) {
        boolean z;
        long j2;
        int i = this.e;
        if (i != 3 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = (this.d.i * j) / 1000000;
        }
        this.h = j2;
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
        return j2;
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
            long j2 = bVar.c;
            int i3 = 0;
            if (i2 + j2 > min && (i2 = (int) (min - j2)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.c(i3);
                        return true;
                    }
                    i3++;
                }
            }
            bVar.c(i);
        }
    }
}
