package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzcbd implements Runnable {
    final /* synthetic */ zzcbg zza;

    public zzcbd(zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
