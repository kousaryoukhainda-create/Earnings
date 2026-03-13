package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes3.dex */
public final class c extends Yl0 {
    public final C2741tB b;
    public final TaskCompletionSource c;
    public final /* synthetic */ Xm0 d;

    public c(Xm0 xm0, TaskCompletionSource taskCompletionSource) {
        C2741tB c2741tB = new C2741tB("OnRequestInstallCallback");
        this.d = xm0;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = c2741tB;
        this.c = taskCompletionSource;
    }

    public final void zzb(Bundle bundle) {
        tn0 tn0Var = this.d.a;
        if (tn0Var != null) {
            TaskCompletionSource taskCompletionSource = this.c;
            synchronized (tn0Var.f) {
                tn0Var.e.remove(taskCompletionSource);
            }
            synchronized (tn0Var.f) {
                try {
                    if (tn0Var.k.get() > 0 && tn0Var.k.decrementAndGet() > 0) {
                        tn0Var.b.i("Leaving the connection open for other ongoing calls.", new Object[0]);
                    } else {
                        tn0Var.a().post(new ln0(tn0Var, 0));
                    }
                } finally {
                }
            }
        }
        this.b.i("onGetLaunchReviewFlowInfo", new Object[0]);
        this.c.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
