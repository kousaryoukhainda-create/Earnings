package defpackage;

import android.view.Choreographer;
/* renamed from: uT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2845uT {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: tT
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
