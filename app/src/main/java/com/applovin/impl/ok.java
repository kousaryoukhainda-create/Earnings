package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class ok implements p1 {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private p1.a e;
    private p1.a f;
    private p1.a g;
    private p1.a h;
    private boolean i;
    private nk j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public ok() {
        p1.a aVar = p1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = p1.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.applovin.impl.p1
    public p1.a a(p1.a aVar) {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.a;
            }
            this.e = aVar;
            p1.a aVar2 = new p1.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new p1.b(aVar);
    }

    @Override // com.applovin.impl.p1
    public void b() {
        if (f()) {
            p1.a aVar = this.e;
            this.g = aVar;
            p1.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new nk(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                nk nkVar = this.j;
                if (nkVar != null) {
                    nkVar.a();
                }
            }
        }
        this.m = p1.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.applovin.impl.p1
    public boolean c() {
        nk nkVar;
        if (this.p && ((nkVar = this.j) == null || nkVar.b() == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.p1
    public ByteBuffer d() {
        int b;
        nk nkVar = this.j;
        if (nkVar != null && (b = nkVar.b()) > 0) {
            if (this.k.capacity() < b) {
                ByteBuffer order = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            nkVar.a(this.l);
            this.o += b;
            this.k.limit(b);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = p1.a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.p1
    public void e() {
        nk nkVar = this.j;
        if (nkVar != null) {
            nkVar.e();
        }
        this.p = true;
    }

    @Override // com.applovin.impl.p1
    public boolean f() {
        if (this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.p1
    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        p1.a aVar = p1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = p1.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public long a(long j) {
        if (this.o >= 1024) {
            long c = this.n - ((nk) b1.a(this.j)).c();
            int i = this.h.a;
            int i2 = this.g.a;
            if (i == i2) {
                return xp.c(j, c, this.o);
            }
            return xp.c(j, c * i, this.o * i2);
        }
        return (long) (this.c * j);
    }

    public void b(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            ((nk) b1.a(this.j)).b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }
}
