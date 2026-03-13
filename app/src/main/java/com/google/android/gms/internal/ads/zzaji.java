package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaji implements zzajo {
    private final zzajn zza;
    private final long zzb;
    private final long zzc;
    private final zzajt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaji(zzajt zzajtVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zzd = zzajtVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 != j2 - j && !z) {
            this.zze = 0;
        } else {
            this.zzf = j4;
            this.zze = 4;
        }
        this.zza = new zzajn();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzajo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzd(com.google.android.gms.internal.ads.zzaco r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzd(com.google.android.gms.internal.ads.zzaco):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final /* bridge */ /* synthetic */ zzadm zze() {
        if (this.zzf != 0) {
            return new zzajg(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
