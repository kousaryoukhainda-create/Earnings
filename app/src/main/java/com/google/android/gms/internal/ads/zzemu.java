package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzemu implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    public zzemu(zzgcs zzgcsVar, Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmJ)).booleanValue()) {
            return zzgch.zzh(new zzemv(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgch.zzh(new zzemv(null, false));
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                String string = Settings.Secure.getString(contentResolver2, "advertising_id");
                boolean z = false;
                if (Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1) {
                    z = true;
                }
                return new zzemv(string, z);
            }
        });
    }
}
