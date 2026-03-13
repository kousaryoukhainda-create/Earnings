package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcfl implements Runnable {
    public final /* synthetic */ zzcex zza;

    public /* synthetic */ zzcfl(zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
