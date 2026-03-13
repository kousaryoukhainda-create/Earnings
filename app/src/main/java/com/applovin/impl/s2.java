package com.applovin.impl;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class s2 {
    private long a;
    private long b;
    private boolean c;

    private long a(long j) {
        return Math.max(0L, ((this.b - 529) * 1000000) / j) + this.a;
    }

    public long a(e9 e9Var) {
        return a(e9Var.A);
    }

    public void a() {
        this.a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long a(e9 e9Var, o5 o5Var) {
        if (this.b == 0) {
            this.a = o5Var.f;
        }
        if (this.c) {
            return o5Var.f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b1.a(o5Var.c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int d = sf.d(i);
        if (d == -1) {
            this.c = true;
            this.b = 0L;
            this.a = o5Var.f;
            oc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return o5Var.f;
        }
        long a = a(e9Var.A);
        this.b += d;
        return a;
    }
}
