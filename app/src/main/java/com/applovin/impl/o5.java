package com.applovin.impl;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class o5 extends l2 {
    public final z4 b;
    public ByteBuffer c;
    public boolean d;
    public long f;
    public ByteBuffer g;
    private final int h;
    private final int i;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            super(AbstractC2437ph.e("Buffer too small (", i, " < ", i2, ")"));
            this.a = i;
            this.b = i2;
        }
    }

    public o5(int i) {
        this(i, 0);
    }

    private ByteBuffer f(int i) {
        int capacity;
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new a(capacity, i);
    }

    public static o5 i() {
        return new o5(0);
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public void g(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = f(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer f = f(i3);
        f.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f.put(byteBuffer);
        }
        this.c = f;
    }

    public final boolean h() {
        return d(1073741824);
    }

    public o5(int i, int i2) {
        this.b = new z4();
        this.h = i;
        this.i = i2;
    }

    public void h(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.g.clear();
        } else {
            this.g = ByteBuffer.allocate(i);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
