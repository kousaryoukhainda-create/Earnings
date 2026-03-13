package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class b {
    public int a;
    public final a b = new a();
    public ByteBuffer c;
    public long d;
    public final int e;

    public b(int i) {
        this.e = i;
    }

    public static b b() {
        return new b(0);
    }

    public void a() {
        this.a = 0;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final ByteBuffer a(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new IllegalStateException(AbstractC2437ph.e("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }
}
