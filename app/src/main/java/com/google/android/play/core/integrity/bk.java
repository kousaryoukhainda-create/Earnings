package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.auth.Constants;
/* loaded from: classes3.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final Rk0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new Rk0("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, defpackage.Yi0
    public final void c(Bundle bundle) throws RemoteException {
        k kVar;
        String str;
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ApiException a = kVar.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.c.c;
        bj bjVar = new bj(this, str, j);
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString(Constants.TOKEN));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
