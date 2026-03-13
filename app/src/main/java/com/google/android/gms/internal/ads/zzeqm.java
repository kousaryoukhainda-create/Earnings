package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
final class zzeqm implements zzetq {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzeqm(String str, String str2, Bundle bundle, zzeqn zzeqnVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        Bundle bundle2 = this.zzc;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
