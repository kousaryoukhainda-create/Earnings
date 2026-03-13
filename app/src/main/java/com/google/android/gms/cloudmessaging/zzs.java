package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    public zzs(int i, int i2, Bundle bundle) {
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    public final String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + zzb() + "}";
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String zzsVar = toString();
            String obj = zztVar.toString();
            Log.d("MessengerIpcClient", "Failing " + zzsVar + " with " + obj);
        }
        this.zzb.setException(zztVar);
    }

    public final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String zzsVar = toString();
            String valueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", "Finishing " + zzsVar + " with " + valueOf);
        }
        this.zzb.setResult(obj);
    }
}
