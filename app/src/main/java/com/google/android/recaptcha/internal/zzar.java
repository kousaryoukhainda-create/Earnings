package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
/* loaded from: classes.dex */
final class zzar extends AbstractC1431gG implements Function1 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ InterfaceC0356Io zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, InterfaceC0356Io interfaceC0356Io) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC0356Io;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                if (completionExceptionOrNull instanceof Exception) {
                    exc = (Exception) completionExceptionOrNull;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return B90.a;
    }
}
