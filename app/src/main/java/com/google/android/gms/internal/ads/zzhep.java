package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzhep implements zzher {
    private zzhfa zza;

    public static void zza(zzhfa zzhfaVar, zzhfa zzhfaVar2) {
        zzhep zzhepVar = (zzhep) zzhfaVar;
        if (zzhepVar.zza == null) {
            zzhepVar.zza = zzhfaVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzhfa zzhfaVar = this.zza;
        if (zzhfaVar != null) {
            return zzhfaVar.zzb();
        }
        throw new IllegalStateException();
    }
}
