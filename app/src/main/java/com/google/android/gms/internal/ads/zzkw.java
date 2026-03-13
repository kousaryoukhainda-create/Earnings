package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkw implements zzur, zzrb {
    final /* synthetic */ zzla zza;
    private final zzky zzb;

    public zzkw(zzla zzlaVar, zzky zzkyVar) {
        this.zza = zzlaVar;
        this.zzb = zzkyVar;
    }

    private final Pair zzf(int i, zzug zzugVar) {
        zzug zzugVar2;
        zzug zzugVar3 = null;
        if (zzugVar != null) {
            zzky zzkyVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 < zzkyVar.zzc.size()) {
                    if (((zzug) zzkyVar.zzc.get(i2)).zzd == zzugVar.zzd) {
                        zzugVar2 = zzugVar.zza(Pair.create(zzkyVar.zzb, zzugVar.zza));
                        break;
                    }
                    i2++;
                } else {
                    zzugVar2 = null;
                    break;
                }
            }
            if (zzugVar2 == null) {
                return null;
            }
            zzugVar3 = zzugVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzugVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, zzug zzugVar, final zzuc zzucVar) {
        zzdh zzdhVar;
        final Pair zzf = zzf(0, zzugVar);
        if (zzf != null) {
            zzdhVar = this.zza.zzi;
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final void run() {
                    zzlt zzltVar;
                    Pair pair = zzf;
                    zzltVar = zzkw.this.zza.zzh;
                    zzltVar.zzaf(((Integer) pair.first).intValue(), (zzug) pair.second, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        zzdh zzdhVar;
        final Pair zzf = zzf(0, zzugVar);
        if (zzf != null) {
            zzdhVar = this.zza.zzi;
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final void run() {
                    zzlt zzltVar;
                    Pair pair = zzf;
                    zzltVar = zzkw.this.zza.zzh;
                    zzltVar.zzag(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        zzdh zzdhVar;
        final Pair zzf = zzf(0, zzugVar);
        if (zzf != null) {
            zzdhVar = this.zza.zzi;
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final void run() {
                    zzlt zzltVar;
                    Pair pair = zzf;
                    zzltVar = zzkw.this.zza.zzh;
                    zzltVar.zzah(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, zzug zzugVar, final zztx zztxVar, final zzuc zzucVar, final IOException iOException, final boolean z) {
        zzdh zzdhVar;
        final Pair zzf = zzf(0, zzugVar);
        if (zzf != null) {
            zzdhVar = this.zza.zzi;
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // java.lang.Runnable
                public final void run() {
                    zzlt zzltVar;
                    Pair pair = zzf;
                    zzltVar = zzkw.this.zza.zzh;
                    zzltVar.zzai(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        zzdh zzdhVar;
        final Pair zzf = zzf(0, zzugVar);
        if (zzf != null) {
            zzdhVar = this.zza.zzi;
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final void run() {
                    zzlt zzltVar;
                    Pair pair = zzf;
                    zzltVar = zzkw.this.zza.zzh;
                    zzltVar.zzaj(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }
}
