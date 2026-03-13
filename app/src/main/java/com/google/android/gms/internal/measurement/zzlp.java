package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
final class zzlp {
    private final Object zza;
    private final int zzb;

    public zzlp(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlp)) {
            return false;
        }
        zzlp zzlpVar = (zzlp) obj;
        if (this.zza != zzlpVar.zza || this.zzb != zzlpVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
