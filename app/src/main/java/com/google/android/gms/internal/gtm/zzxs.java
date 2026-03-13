package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzxs implements zzxj {
    final zzxy zza;
    final int zzb;
    final zzaba zzc;
    final boolean zzd;

    public zzxs(zzxy zzxyVar, int i, zzaba zzabaVar, boolean z, boolean z2) {
        this.zza = zzxyVar;
        this.zzb = i;
        this.zzc = zzabaVar;
        this.zzd = z;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzxs) obj).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzzf zzb(zzzf zzzfVar, zzzg zzzgVar) {
        ((zzxp) zzzfVar).zzA((zzxv) zzzgVar);
        return zzzfVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzzl zzc(zzzl zzzlVar, zzzl zzzlVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzaba zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzabb zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final boolean zzg() {
        return this.zzd;
    }
}
