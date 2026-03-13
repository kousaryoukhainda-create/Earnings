package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
/* loaded from: classes3.dex */
public abstract class zzfmw extends AsyncTask {
    private zzfmx zza;
    protected final zzfmo zzd;

    public zzfmw(zzfmo zzfmoVar) {
        this.zzd = zzfmoVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfmx zzfmxVar = this.zza;
        if (zzfmxVar != null) {
            zzfmxVar.zza(this);
        }
    }

    public final void zzb(zzfmx zzfmxVar) {
        this.zza = zzfmxVar;
    }
}
