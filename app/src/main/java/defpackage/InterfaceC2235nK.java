package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* renamed from: nK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2235nK {
    void b(Bundle bundle);

    void c(int i, C2860ue c2860ue, long j, int i2);

    void d(int i, int i2, long j, int i3);

    boolean e(C3180yK c3180yK);

    void flush();

    MediaFormat g();

    void h(int i, long j);

    int j();

    void k(JK jk, Handler handler);

    int l(MediaCodec.BufferInfo bufferInfo);

    void n(int i, boolean z);

    void o(int i);

    ByteBuffer p(int i);

    void q(Surface surface);

    void release();

    ByteBuffer s(int i);
}
