package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class l implements a0<Object> {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.p a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    public l(Handler handler, d dVar) {
        this(null, null, 2000);
    }

    public synchronized void a(Object obj, j jVar) {
        try {
            if (this.b == 0) {
                this.c = SystemClock.elapsedRealtime();
            }
            this.b++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public l(Handler handler, d dVar, int i) {
        this.a = new com.fyber.inneractive.sdk.player.exoplayer2.util.p(i);
        this.g = -1L;
    }

    public synchronized void a(Object obj) {
        p.c cVar;
        float f;
        try {
            int i = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.b > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.c);
            long j = i2;
            this.e += j;
            long j2 = this.f;
            long j3 = this.d;
            this.f = j2 + j3;
            if (i2 > 0) {
                float f2 = (float) ((8000 * j3) / j);
                com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar = this.a;
                int sqrt = (int) Math.sqrt(j3);
                if (pVar.d != 1) {
                    Collections.sort(pVar.b, com.fyber.inneractive.sdk.player.exoplayer2.util.p.h);
                    pVar.d = 1;
                }
                int i3 = pVar.g;
                if (i3 > 0) {
                    p.c[] cVarArr = pVar.c;
                    int i4 = i3 - 1;
                    pVar.g = i4;
                    cVar = cVarArr[i4];
                } else {
                    cVar = new p.c();
                }
                int i5 = pVar.e;
                pVar.e = i5 + 1;
                cVar.a = i5;
                cVar.b = sqrt;
                cVar.c = f2;
                pVar.b.add(cVar);
                pVar.f += sqrt;
                while (true) {
                    int i6 = pVar.f;
                    int i7 = pVar.a;
                    if (i6 <= i7) {
                        break;
                    }
                    int i8 = i6 - i7;
                    p.c cVar2 = pVar.b.get(0);
                    int i9 = cVar2.b;
                    if (i9 <= i8) {
                        pVar.f -= i9;
                        pVar.b.remove(0);
                        int i10 = pVar.g;
                        if (i10 < 5) {
                            p.c[] cVarArr2 = pVar.c;
                            pVar.g = i10 + 1;
                            cVarArr2[i10] = cVar2;
                        }
                    } else {
                        cVar2.b = i9 - i8;
                        pVar.f -= i8;
                    }
                }
                if (this.e >= 2000 || this.f >= 524288) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar2 = this.a;
                    if (pVar2.d != 0) {
                        Collections.sort(pVar2.b, com.fyber.inneractive.sdk.player.exoplayer2.util.p.i);
                        pVar2.d = 0;
                    }
                    float f3 = 0.5f * pVar2.f;
                    int i11 = 0;
                    while (true) {
                        if (i < pVar2.b.size()) {
                            p.c cVar3 = pVar2.b.get(i);
                            i11 += cVar3.b;
                            if (i11 >= f3) {
                                f = cVar3.c;
                                break;
                            }
                            i++;
                        } else if (pVar2.b.isEmpty()) {
                            f = Float.NaN;
                        } else {
                            ArrayList<p.c> arrayList = pVar2.b;
                            f = arrayList.get(arrayList.size() - 1).c;
                        }
                    }
                    this.g = Float.isNaN(f) ? -1L : f;
                }
            }
            int i12 = this.b - 1;
            this.b = i12;
            if (i12 > 0) {
                this.c = elapsedRealtime;
            }
            this.d = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
