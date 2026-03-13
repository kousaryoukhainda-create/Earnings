package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzjz {
    public zzlb zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjz(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzlb zzlbVar) {
        this.zze |= this.zza != zzlbVar;
        this.zza = zzlbVar;
    }

    public final void zzc(int i) {
        boolean z = true;
        if (this.zzc && this.zzd != 5) {
            if (i != 5) {
                z = false;
            }
            zzcw.zzd(z);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }
}
