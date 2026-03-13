package defpackage;

import android.os.HandlerThread;
/* renamed from: y5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3160y5 implements X40 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ C3160y5(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // defpackage.X40
    public final Object get() {
        switch (this.b) {
            case 0:
                return new HandlerThread(C3246z5.f(this.c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C3246z5.f(this.c, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
