package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class be extends Zk0 {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bnVar;
    }

    @Override // defpackage.Zk0
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Integer.valueOf(Af0.a(context)));
    }
}
