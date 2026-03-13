package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzcgr {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgr(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcgr zza() {
        return new zzcgr(0, 0, 0);
    }

    public static zzcgr zzb(int i, int i2) {
        return new zzcgr(1, i, i2);
    }

    public static zzcgr zzc(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        if (zzsVar.zzd) {
            return new zzcgr(3, 0, 0);
        }
        if (zzsVar.zzi) {
            return new zzcgr(2, 0, 0);
        }
        if (zzsVar.zzh) {
            return new zzcgr(0, 0, 0);
        }
        return new zzcgr(1, zzsVar.zzf, zzsVar.zzc);
    }

    public static zzcgr zzd() {
        return new zzcgr(5, 0, 0);
    }

    public static zzcgr zze() {
        return new zzcgr(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
