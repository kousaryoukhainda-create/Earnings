package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes3.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzu zza;

    public /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        this.zza = zzuVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzu zzuVar = this.zza;
        String str = (String) obj;
        if (zzu.zze(zzuVar) != null && str != null) {
            zzu.zze(zzuVar).loadUrl(str);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzu zzuVar = this.zza;
            zzu.zzv(zzuVar, (zzava) zzu.zzu(zzuVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
