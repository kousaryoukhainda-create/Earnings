package com.google.android.gms.internal.ads;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
/* loaded from: classes3.dex */
public final class zzgg implements zzfx {
    private zzgy zzb;
    private String zzc;
    private boolean zzf;
    private final zzgs zza = new zzgs();
    private int zzd = JosStatusCodes.RTN_CODE_COMMON_ERROR;
    private int zze = JosStatusCodes.RTN_CODE_COMMON_ERROR;

    public final zzgg zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgg zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgg zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgg zze(zzgy zzgyVar) {
        this.zzb = zzgyVar;
        return this;
    }

    public final zzgg zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: zzg */
    public final zzgl zza() {
        zzgl zzglVar = new zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgy zzgyVar = this.zzb;
        if (zzgyVar != null) {
            zzglVar.zzf(zzgyVar);
        }
        return zzglVar;
    }
}
