package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes3.dex */
public final class zzgnl extends zzgky {
    private static final zzgnl zza = new zzgnl();

    private zzgnl() {
    }

    public static zzgnl zzd() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final Class zza(Class cls) {
        return zzgen.zza(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final Object zzb(zzgdx zzgdxVar, Class cls) throws GeneralSecurityException {
        return zzgmh.zza().zzc(zzgdxVar, cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final Object zzc(zzgnf zzgnfVar, Class cls) throws GeneralSecurityException {
        int i = zzgen.zza;
        return zzgmh.zza().zzd(zzgnfVar, cls);
    }
}
