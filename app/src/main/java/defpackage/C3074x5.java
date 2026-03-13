package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.applovin.impl.gd;
import com.applovin.impl.ul;
/* renamed from: x5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3074x5 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3074x5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                JK jk = (JK) this.b;
                ((C3246z5) this.c).getClass();
                jk.getClass();
                if (Ha0.a < 30) {
                    Handler handler = jk.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                jk.a(j);
                return;
            case 1:
                JK jk2 = (JK) this.b;
                ((YZ) this.c).getClass();
                jk2.getClass();
                if (Ha0.a < 30) {
                    Handler handler2 = jk2.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                jk2.a(j);
                return;
            default:
                ul.a((ul) this.c, (gd.c) this.b, mediaCodec, j, j2);
                return;
        }
    }
}
