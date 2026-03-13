package defpackage;

import android.os.Bundle;
/* renamed from: Dk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0222Dk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ BinderC0352Ik d;

    public /* synthetic */ RunnableC0222Dk(BinderC0352Ik binderC0352Ik, Bundle bundle, int i) {
        this.b = i;
        this.d = binderC0352Ik;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.d.c.onUnminimized(this.c);
                return;
            case 1:
                this.d.c.onMessageChannelReady(this.c);
                return;
            case 2:
                this.d.c.onWarmupCompleted(this.c);
                return;
            default:
                this.d.c.onMinimized(this.c);
                return;
        }
    }
}
