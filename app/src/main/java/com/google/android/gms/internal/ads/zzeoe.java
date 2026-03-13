package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
/* loaded from: classes3.dex */
public final class zzeoe implements zzetr {
    private final zzeym zza;

    public zzeoe(zzeym zzeymVar) {
        this.zza = zzeymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        zzeym zzeymVar = this.zza;
        if (zzeymVar == null) {
            return zzgch.zzh(new zzeod(null));
        }
        String zza = zzeymVar.zza();
        if (Strings.isEmptyOrWhitespace(zza)) {
            return zzgch.zzh(new zzeod(null));
        }
        return zzgch.zzh(new zzeod(zza));
    }
}
