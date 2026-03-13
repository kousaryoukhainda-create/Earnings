package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public class h {
    public static h b = new h();
    public Queue<ByteBuffer> a = new ConcurrentLinkedQueue();

    public h() {
        for (int i = 0; i < 2; i++) {
            this.a.offer(a());
        }
    }

    public final ByteBuffer a() {
        return ByteBuffer.allocateDirect(16384);
    }

    public ByteBuffer b() {
        ByteBuffer poll = this.a.poll();
        if (poll == null) {
            return ByteBuffer.allocateDirect(16384);
        }
        return poll;
    }

    public byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        return new byte[8192];
    }
}
