package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
/* loaded from: classes3.dex */
public abstract class zza {
    private static zza zza;

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            try {
                if (zza == null) {
                    zzag zzagVar = new zzag(null);
                    zzagVar.zzb((Application) context.getApplicationContext());
                    zza = zzagVar.zza();
                }
                zzaVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaVar;
    }

    public abstract zzj zzb();

    public abstract zzbk zzc();
}
