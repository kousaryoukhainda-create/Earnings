package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjx implements zzju {
    private static zzjx zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjx() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    public static zzjx zza(Context context) {
        zzjx zzjxVar;
        zzjx zzjxVar2;
        synchronized (zzjx.class) {
            try {
                if (zza == null) {
                    if (AbstractC2870uj.k(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        zzjxVar2 = new zzjx(context);
                    } else {
                        zzjxVar2 = new zzjx();
                    }
                    zza = zzjxVar2;
                }
                zzjx zzjxVar3 = zza;
                if (zzjxVar3 != null && zzjxVar3.zzc != null && !zzjxVar3.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        zzjx zzjxVar4 = zza;
                        zzjxVar4.getClass();
                        zzjxVar4.zzd = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                zzjxVar = zza;
                zzjxVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjxVar;
    }

    public static synchronized void zzc() {
        Context context;
        synchronized (zzjx.class) {
            try {
                zzjx zzjxVar = zza;
                if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    /* renamed from: zzb */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) an0.a(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                    @Override // com.google.android.gms.internal.measurement.zzjt
                    public final /* synthetic */ Object zza() {
                        return zzjx.this.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
            }
        }
        return null;
    }

    public final String zzd(String str) {
        Context context = this.zzb;
        context.getClass();
        return zzjf.zza(context.getContentResolver(), str, null);
    }

    private zzjx(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjv(this, null);
    }
}
