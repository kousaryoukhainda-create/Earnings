package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
/* loaded from: classes3.dex */
public final class zzbg {
    private static zzbg zza;
    private static final Object zzb = new Object();
    private final zzeb zzc;
    private final zzcb zzd;

    private zzbg(Context context) {
        zzcb zzb2 = zzcb.zzb(context);
        zzew zzewVar = new zzew();
        this.zzd = zzb2;
        this.zzc = zzewVar;
    }

    public static zzbg zzb(Context context) {
        zzbg zzbgVar;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zza = new zzbg(context);
                }
                zzbgVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbgVar;
    }

    public final boolean zza(String str) {
        if (!this.zzc.zza()) {
            Log.w("GoogleTagManager", "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        this.zzd.zzf(str, System.currentTimeMillis());
        return true;
    }
}
