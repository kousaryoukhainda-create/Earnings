package defpackage;

import android.os.Bundle;
/* renamed from: Ek  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0248Ek implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ BinderC0352Ik f;

    public /* synthetic */ RunnableC0248Ek(BinderC0352Ik binderC0352Ik, String str, Bundle bundle, int i) {
        this.b = i;
        this.f = binderC0352Ik;
        this.c = str;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f.c.extraCallback(this.c, this.d);
                return;
            default:
                this.f.c.onPostMessage(this.c, this.d);
                return;
        }
    }
}
