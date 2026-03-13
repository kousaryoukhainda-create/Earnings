package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
/* loaded from: classes3.dex */
final class as extends AbstractBinderC1386fk0 {
    final TaskCompletionSource a;
    final C3121xf0 b;
    private final Rk0 c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C3121xf0 c3121xf0) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new Rk0("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = c3121xf0;
    }

    @Override // defpackage.Hk0
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ApiException a = this.e.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            Rk0 rk0 = this.c;
            Object[] objArr = {this.d};
            rk0.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", Rk0.d(rk0.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        Rk0 rk02 = this.c;
        Object[] objArr2 = new Object[0];
        rk02.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", Rk0.d(rk02.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
