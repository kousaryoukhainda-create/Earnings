package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
final class zzgno {
    private final Class zza;
    private final zzgvo zzb;

    public /* synthetic */ zzgno(Class cls, zzgvo zzgvoVar, zzgnq zzgnqVar) {
        this.zza = cls;
        this.zzb = zzgvoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgno)) {
            return false;
        }
        zzgno zzgnoVar = (zzgno) obj;
        if (!zzgnoVar.zza.equals(this.zza) || !zzgnoVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0324Hi.g(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
