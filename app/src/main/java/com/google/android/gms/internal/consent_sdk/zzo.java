package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
/* loaded from: classes3.dex */
public final class zzo implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;

    public zzo(zzdp zzdpVar, zzdp zzdpVar2) {
        this.zza = zzdpVar;
        this.zzb = zzdpVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    /* renamed from: zzb */
    public final zzl zza() {
        return new zzl((Application) this.zza.zza(), (zzam) this.zzb.zza());
    }
}
