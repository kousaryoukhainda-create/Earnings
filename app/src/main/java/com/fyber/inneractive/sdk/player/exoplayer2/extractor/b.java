package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements g {
    public static final byte[] g = new byte[4096];
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a;
    public final long b;
    public long c;
    public byte[] d = new byte[65536];
    public int e;
    public int f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, long j, long j2) {
        this.a = gVar;
        this.c = j;
        this.b = j2;
    }

    public boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (a(i2, z)) {
            System.arraycopy(this.d, this.e - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    public int b(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f, i);
        d(min);
        if (min == 0) {
            byte[] bArr = g;
            min = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        a(min);
        return min;
    }

    public void c(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f, i);
        d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = g;
            i2 = a(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        a(i2);
    }

    public final void d(int i) {
        byte[] bArr;
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr2 = this.d;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.d = bArr;
    }

    public boolean a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (i2 > bArr.length) {
            int i3 = u.a;
            this.d = Arrays.copyOf(this.d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f - this.e, i);
        while (min < i) {
            min = a(this.d, this.e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.e + i;
        this.e = i4;
        this.f = Math.max(this.f, i4);
        return true;
    }

    public boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3;
        int i4 = this.f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.d, 0, bArr, i, min);
            d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        a(i3);
        return i3 != -1;
    }

    public int a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = this.f;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.d, 0, bArr, i, min);
            d(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = a(bArr, i, i2, 0, true);
        }
        a(i4);
        return i4;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.a.a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + a;
        }
        throw new InterruptedException();
    }

    public final void a(int i) {
        if (i != -1) {
            this.c += i;
        }
    }
}
