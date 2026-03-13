package com.google.android.gms.internal.consent_sdk;
/* loaded from: classes3.dex */
final class zzcy extends zzcv {
    private final zzda zza;

    public zzcy(zzda zzdaVar, int i) {
        super(zzdaVar.size(), i);
        this.zza = zzdaVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcv
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
