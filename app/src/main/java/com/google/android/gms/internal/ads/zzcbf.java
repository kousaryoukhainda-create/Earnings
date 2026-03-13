package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbg zzb;

    public zzcbf(zzcbg zzcbgVar, boolean z) {
        this.zza = z;
        this.zzb = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
