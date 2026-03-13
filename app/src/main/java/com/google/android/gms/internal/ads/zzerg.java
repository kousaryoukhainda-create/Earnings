package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes3.dex */
public final class zzerg implements zzetr {
    private final Context zza;
    private final Intent zzb;

    public zzerg(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmG)).booleanValue()) {
            boolean z = false;
            try {
                if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                    z = true;
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            return zzgch.zzh(new zzerh(Boolean.valueOf(z)));
        }
        return zzgch.zzh(new zzerh(null));
    }
}
