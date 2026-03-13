package com.google.android.gms.internal.consent_sdk;
/* loaded from: classes3.dex */
public final class zzdi implements zzdk {
    private zzdn zza;

    public static void zzb(zzdn zzdnVar, zzdn zzdnVar2) {
        zzdi zzdiVar = (zzdi) zzdnVar;
        if (zzdiVar.zza == null) {
            zzdiVar.zza = zzdnVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final Object zza() {
        zzdn zzdnVar = this.zza;
        if (zzdnVar != null) {
            return zzdnVar.zza();
        }
        throw new IllegalStateException();
    }
}
