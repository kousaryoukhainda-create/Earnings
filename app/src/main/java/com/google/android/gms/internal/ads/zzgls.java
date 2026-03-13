package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzgls {
    private final zzgdz zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgls(zzgdz zzgdzVar, int i, String str, String str2, zzglt zzgltVar) {
        this.zza = zzgdzVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgls)) {
            return false;
        }
        zzgls zzglsVar = (zzgls) obj;
        if (this.zza != zzglsVar.zza || this.zzb != zzglsVar.zzb || !this.zzc.equals(zzglsVar.zzc) || !this.zzd.equals(zzglsVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzgdz zzgdzVar = this.zza;
        int i = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(zzgdzVar);
        sb.append(", keyId=");
        sb.append(i);
        sb.append(", keyType='");
        return AbstractC2437ph.m(sb, str, "', keyPrefix='", str2, "')");
    }

    public final int zza() {
        return this.zzb;
    }
}
