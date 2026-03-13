package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaz implements Comparator {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;

    public zzaz(zzai zzaiVar, zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (zzaoVar instanceof zzat) {
            if (zzaoVar2 instanceof zzat) {
                return 0;
            }
            return 1;
        } else if (zzaoVar2 instanceof zzat) {
            return -1;
        } else {
            zzai zzaiVar = this.zza;
            if (zzaiVar == null) {
                return zzaoVar.zzc().compareTo(zzaoVar2.zzc());
            }
            return (int) zzh.zzi(zzaiVar.zza(this.zzb, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
        }
    }
}
