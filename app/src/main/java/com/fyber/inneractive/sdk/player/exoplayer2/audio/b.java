package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface b {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "Unhandled format: "
                java.lang.String r1 = " Hz, "
                java.lang.String r2 = " channels in encoding "
                java.lang.StringBuilder r4 = defpackage.AbstractC2437ph.n(r0, r4, r1, r5, r2)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.b.a.<init>(int, int, int):void");
        }
    }

    ByteBuffer a();

    void a(ByteBuffer byteBuffer);

    boolean a(int i, int i2, int i3) throws a;

    boolean b();

    void c();

    boolean d();

    int e();

    int f();

    void flush();

    void g();
}
