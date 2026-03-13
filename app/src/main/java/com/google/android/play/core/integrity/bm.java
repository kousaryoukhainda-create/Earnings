package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes3.dex */
abstract class bm extends Zk0 {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // defpackage.Zk0
    public final void a(Exception exc) {
        if (!(exc instanceof C3293zf0)) {
            super.a(exc);
        } else if (bn.l(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
