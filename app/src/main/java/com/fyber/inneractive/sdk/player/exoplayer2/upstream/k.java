package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class k implements b {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public final a[] d;
    public int e;
    public int f;
    public int g;
    public a[] h;

    public k(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z3);
        this.a = z;
        this.b = i;
        this.g = i2;
        this.h = new a[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new a(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new a[1];
    }

    public synchronized void a(a[] aVarArr) {
        boolean z;
        try {
            int i = this.g;
            int length = aVarArr.length + i;
            a[] aVarArr2 = this.h;
            if (length >= aVarArr2.length) {
                this.h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.a;
                if (bArr != this.c && bArr.length != this.b) {
                    z = false;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
                    a[] aVarArr3 = this.h;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
                z = true;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
                a[] aVarArr32 = this.h;
                int i22 = this.g;
                this.g = i22 + 1;
                aVarArr32[i22] = aVar;
            }
            this.f -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            int i = 0;
            int max = Math.max(0, com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(this.e, this.b) - this.f);
            int i2 = this.g;
            if (max >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    a[] aVarArr = this.h;
                    a aVar = aVarArr[i];
                    byte[] bArr = aVar.a;
                    byte[] bArr2 = this.c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        a aVar2 = aVarArr[i3];
                        if (aVar2.a != bArr2) {
                            i3--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, max, this.g, (Object) null);
            this.g = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int a() {
        return this.b;
    }
}
