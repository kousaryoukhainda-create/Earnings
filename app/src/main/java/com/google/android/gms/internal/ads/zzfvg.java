package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfvg implements Serializable, zzfvf {
    final zzfvf zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfvm zzd = new zzfvm();

    public zzfvg(zzfvf zzfvfVar) {
        this.zza = zzfvfVar;
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

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
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
