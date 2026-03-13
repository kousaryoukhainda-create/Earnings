package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
final class zztz extends zztu {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zztz(zzbq zzbqVar, Object obj, Object obj2) {
        super(zzbqVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zztz zzq(zzar zzarVar) {
        return new zztz(new zzua(zzarVar), zzbp.zza, zzc);
    }

    public static zztz zzr(zzbq zzbqVar, Object obj, Object obj2) {
        return new zztz(zzbqVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        this.zzb.zzd(i, zzboVar, z);
        if (Objects.equals(zzboVar.zzb, this.zze) && z) {
            zzboVar.zzb = zzc;
        }
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int i, zzbp zzbpVar, long j) {
        this.zzb.zze(i, zzbpVar, j);
        if (Objects.equals(zzbpVar.zzb, this.zzd)) {
            zzbpVar.zzb = zzbp.zza;
        }
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int i) {
        Object zzf = this.zzb.zzf(i);
        if (Objects.equals(zzf, this.zze)) {
            return zzc;
        }
        return zzf;
    }

    public final zztz zzp(zzbq zzbqVar) {
        return new zztz(zzbqVar, this.zzd, this.zze);
    }
}
