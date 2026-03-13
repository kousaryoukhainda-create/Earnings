package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzgfk extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgfi zze;
    private final zzgfh zzf;

    public /* synthetic */ zzgfk(int i, int i2, int i3, int i4, zzgfi zzgfiVar, zzgfh zzgfhVar, zzgfj zzgfjVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgfiVar;
        this.zzf = zzgfhVar;
    }

    public static zzgfg zzf() {
        return new zzgfg(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfk)) {
            return false;
        }
        zzgfk zzgfkVar = (zzgfk) obj;
        if (zzgfkVar.zza != this.zza || zzgfkVar.zzb != this.zzb || zzgfkVar.zzc != this.zzc || zzgfkVar.zzd != this.zzd || zzgfkVar.zze != this.zze || zzgfkVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgfk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder q = BK.q("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        q.append(this.zzc);
        q.append("-byte IV, and ");
        q.append(this.zzd);
        q.append("-byte tags, and ");
        q.append(this.zza);
        q.append("-byte AES key, and ");
        return AbstractC2437ph.k(q, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zze != zzgfi.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgfh zzg() {
        return this.zzf;
    }

    public final zzgfi zzh() {
        return this.zze;
    }
}
