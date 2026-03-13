package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.ul;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface gd {

    /* loaded from: classes.dex */
    public static final class a {
        public final jd a;
        public final MediaFormat b;
        public final e9 c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;
        public final boolean g;

        private a(jd jdVar, MediaFormat mediaFormat, e9 e9Var, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.a = jdVar;
            this.b = mediaFormat;
            this.c = e9Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
            this.g = z;
        }

        public static a a(jd jdVar, MediaFormat mediaFormat, e9 e9Var, MediaCrypto mediaCrypto) {
            return new a(jdVar, mediaFormat, e9Var, null, mediaCrypto, 0, false);
        }

        public static a a(jd jdVar, MediaFormat mediaFormat, e9 e9Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jdVar, mediaFormat, e9Var, surface, mediaCrypto, 0, false);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new ul.c();

        gd a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(gd gdVar, long j, long j2);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i);

    void a();

    void a(int i, int i2, int i3, long j, int i4);

    void a(int i, int i2, z4 z4Var, long j, int i3);

    void a(int i, long j);

    void a(int i, boolean z);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i);

    void b();

    void c(int i);

    boolean c();

    int d();

    MediaFormat e();
}
