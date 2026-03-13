package com.google.android.gms.internal.auth;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzdk(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = AbstractC2437ph.h("<supplier that returned ", String.valueOf(this.zzc), ">");
        } else {
            obj = this.zza;
        }
        return AbstractC2437ph.h("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
