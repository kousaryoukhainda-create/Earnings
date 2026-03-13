package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzav extends zzdk {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    public zzav(zzay zzayVar, Context context) {
        this.zza = context;
        this.zzb = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzi(this.zza, zzeVar.zzb, true, true);
    }
}
