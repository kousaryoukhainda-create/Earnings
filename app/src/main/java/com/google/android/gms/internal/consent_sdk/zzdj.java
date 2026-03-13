package com.google.android.gms.internal.consent_sdk;
/* loaded from: classes3.dex */
public final class zzdj implements zzdn {
    private static final Object zza = new Object();
    private volatile zzdn zzb;
    private volatile Object zzc = zza;

    private zzdj(zzdn zzdnVar) {
        this.zzb = zzdnVar;
    }

    public static zzdn zzb(zzdn zzdnVar) {
        return zzdnVar instanceof zzdj ? zzdnVar : new zzdj(zzdnVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj == obj2) {
                Object zza2 = this.zzb.zza();
                Object obj3 = this.zzc;
                if (obj3 != obj2 && obj3 != zza2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zza2 + ". This is likely due to a circular dependency.");
                }
                this.zzc = zza2;
                this.zzb = null;
                return zza2;
            }
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final Object zza() {
        Object obj = this.zzc;
        if (obj == zza) {
            return zzc();
        }
        return obj;
    }
}
