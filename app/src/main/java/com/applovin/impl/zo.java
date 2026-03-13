package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class zo extends z1 {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = xp.f;
    private int n;
    private long o;

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer a = a(length);
        int a2 = xp.a(length, 0, this.n);
        a.put(this.m, 0, a2);
        int a3 = xp.a(length - a2, 0, i2);
        byteBuffer.limit(byteBuffer.position() + a3);
        a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - a3;
        int i4 = this.n - a2;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, a2, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        a.flip();
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        if (aVar.c == 2) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return p1.a.e;
            }
            return aVar;
        }
        throw new p1.b(aVar);
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public boolean c() {
        if (super.c() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            a(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // com.applovin.impl.z1
    public void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.applovin.impl.z1
    public void h() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.applovin.impl.z1
    public void i() {
        this.m = xp.f;
    }

    public long j() {
        return this.o;
    }

    public void k() {
        this.o = 0L;
    }

    public void a(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
