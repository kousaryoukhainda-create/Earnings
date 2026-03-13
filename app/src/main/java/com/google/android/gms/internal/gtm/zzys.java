package com.google.android.gms.internal.gtm;

import java.util.List;
/* loaded from: classes3.dex */
final class zzys extends zzyu {
    public /* synthetic */ zzys(zzyr zzyrVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final List zza(Object obj, long j) {
        int i;
        zzyd zzydVar = (zzyd) zzaau.zzf(obj, j);
        if (!zzydVar.zzc()) {
            int size = zzydVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzyd zzd = zzydVar.zzd(i);
            zzaau.zzs(obj, j, zzd);
            return zzd;
        }
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzb(Object obj, long j) {
        ((zzyd) zzaau.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzc(Object obj, Object obj2, long j) {
        zzyd zzydVar = (zzyd) zzaau.zzf(obj, j);
        zzyd zzydVar2 = (zzyd) zzaau.zzf(obj2, j);
        int size = zzydVar.size();
        int size2 = zzydVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzydVar.zzc()) {
                zzydVar = zzydVar.zzd(size2 + size);
            }
            zzydVar.addAll(zzydVar2);
        }
        if (size > 0) {
            zzydVar2 = zzydVar;
        }
        zzaau.zzs(obj, j, zzydVar2);
    }

    private zzys() {
        super(null);
    }
}
