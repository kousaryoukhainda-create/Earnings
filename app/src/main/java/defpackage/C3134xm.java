package defpackage;

import androidx.media3.common.b;
import java.nio.ByteBuffer;
/* renamed from: xm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3134xm extends H5 {
    public b d;
    public final C2860ue f = new C2860ue();
    public ByteBuffer g;
    public boolean h;
    public long i;
    public ByteBuffer j;
    public final int k;

    static {
        WK.a("media3.decoder");
    }

    public C3134xm(int i) {
        this.k = i;
    }

    public void g() {
        this.c = 0;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.h = false;
    }

    public final ByteBuffer h(int i) {
        int capacity;
        int i2 = this.k;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(AbstractC2437ph.e("Buffer too small (", capacity, " < ", i, ")"));
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            this.g = h(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.g = byteBuffer;
            return;
        }
        ByteBuffer h = h(i2);
        h.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            h.put(byteBuffer);
        }
        this.g = h;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
