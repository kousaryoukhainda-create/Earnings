package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzxe {
    private final Object zza;
    private final int zzb;

    public zzxe(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxe)) {
            return false;
        }
        zzxe zzxeVar = (zzxe) obj;
        if (this.zza != zzxeVar.zza || this.zzb != zzxeVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
