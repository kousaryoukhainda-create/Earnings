package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class at {
    private final InterfaceC1378fg0 a;
    private final InterfaceC1378fg0 b;

    public at(InterfaceC1378fg0 interfaceC1378fg0, InterfaceC1378fg0 interfaceC1378fg02) {
        this.a = interfaceC1378fg0;
        this.b = interfaceC1378fg02;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C3121xf0 c3121xf0) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        c3121xf0.getClass();
        return new as(context, kVar, activity, taskCompletionSource, c3121xf0);
    }
}
