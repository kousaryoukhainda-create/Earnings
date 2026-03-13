package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzbia {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbgr zzc;

    public zzbia(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbgr zzf(zzbgq zzbgqVar) {
        zzbgr zzbgrVar = this.zzc;
        if (zzbgrVar != null) {
            return zzbgrVar;
        }
        zzbgr zzbgrVar2 = new zzbgr(zzbgqVar);
        this.zzc = zzbgrVar2;
        return zzbgrVar2;
    }

    public final zzbha zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhx(this, null);
    }

    public final zzbhd zzd() {
        return new zzbhy(this, null);
    }
}
