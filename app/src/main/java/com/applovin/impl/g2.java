package com.applovin.impl;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class g2 extends o5 {
    private long j;
    private int k;
    private int l;

    public g2() {
        super(2);
        this.l = 32;
    }

    private boolean b(o5 o5Var) {
        ByteBuffer byteBuffer;
        if (m()) {
            if (this.k < this.l && o5Var.d() == d()) {
                ByteBuffer byteBuffer2 = o5Var.c;
                if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean a(o5 o5Var) {
        b1.a(!o5Var.h());
        b1.a(!o5Var.c());
        b1.a(!o5Var.e());
        if (!b(o5Var)) {
            return false;
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.f = o5Var.f;
            if (o5Var.f()) {
                e(1);
            }
        }
        if (o5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = o5Var.c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.j = o5Var.f;
        return true;
    }

    public void i(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.l = i;
    }

    public long j() {
        return this.f;
    }

    public long k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public boolean m() {
        if (this.k > 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.o5, com.applovin.impl.l2
    public void b() {
        super.b();
        this.k = 0;
    }
}
