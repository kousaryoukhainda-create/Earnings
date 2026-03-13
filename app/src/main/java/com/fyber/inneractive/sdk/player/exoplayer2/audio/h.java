package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class h implements b {
    public g d;
    public ByteBuffer g;
    public ShortBuffer h;
    public ByteBuffer i;
    public long j;
    public long k;
    public boolean l;
    public float e = 1.0f;
    public float f = 1.0f;
    public int b = -1;
    public int c = -1;

    public h() {
        ByteBuffer byteBuffer = b.a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean a(int i, int i2, int i3) throws b.a {
        if (i3 == 2) {
            if (this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            return true;
        }
        throw new b.a(i, i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean b() {
        g gVar;
        if (this.l && ((gVar = this.d) == null || gVar.r == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void c() {
        int i;
        g gVar = this.d;
        int i2 = gVar.q;
        float f = gVar.o;
        float f2 = gVar.p;
        int i3 = gVar.r + ((int) ((((i2 / (f / f2)) + gVar.s) / f2) + 0.5f));
        gVar.a((gVar.e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = gVar.e * 2;
            int i5 = gVar.b;
            if (i4 >= i * i5) {
                break;
            }
            gVar.h[(i5 * i2) + i4] = 0;
            i4++;
        }
        gVar.q += i;
        gVar.a();
        if (gVar.r > i3) {
            gVar.r = i3;
        }
        gVar.q = 0;
        gVar.t = 0;
        gVar.s = 0;
        this.l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean d() {
        if (Math.abs(this.e - 1.0f) < 0.01f && Math.abs(this.f - 1.0f) < 0.01f) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int e() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int f() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void flush() {
        g gVar = new g(this.c, this.b);
        this.d = gVar;
        gVar.o = this.e;
        gVar.p = this.f;
        this.i = b.a;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void g() {
        this.d = null;
        ByteBuffer byteBuffer = b.a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.j += remaining;
            g gVar = this.d;
            gVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = gVar.b;
            int i2 = remaining2 / i;
            gVar.a(i2);
            asShortBuffer.get(gVar.h, gVar.q * gVar.b, ((i * i2) * 2) / 2);
            gVar.q += i2;
            gVar.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.d.r * this.b * 2;
        if (i3 > 0) {
            if (this.g.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.g = order;
                this.h = order.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            g gVar2 = this.d;
            ShortBuffer shortBuffer = this.h;
            gVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / gVar2.b, gVar2.r);
            shortBuffer.put(gVar2.j, 0, gVar2.b * min);
            int i4 = gVar2.r - min;
            gVar2.r = i4;
            short[] sArr = gVar2.j;
            int i5 = gVar2.b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.k += i3;
            this.g.limit(i3);
            this.i = this.g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.i;
        this.i = b.a;
        return byteBuffer;
    }
}
