package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes3.dex */
class bi extends Ni0 {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.Yi0
    public final void b(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.Yi0
    public void c(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.Yi0
    public final void d(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.Yi0
    public void e(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }
}
