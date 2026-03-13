package com.google.android.gms.internal.ads;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzgll extends zzgek {
    private final zzgni zza;

    public zzgll(zzgni zzgniVar) {
        this.zza = zzgniVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgll)) {
            return false;
        }
        zzgni zzgniVar = ((zzgll) obj).zza;
        if (!this.zza.zzc().zzg().equals(zzgniVar.zzc().zzg()) || !this.zza.zzc().zzi().equals(zzgniVar.zzc().zzi()) || !this.zza.zzc().zzh().equals(zzgniVar.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgni zzgniVar = this.zza;
        return Objects.hash(zzgniVar.zzc(), zzgniVar.zzd());
    }

    public final String toString() {
        String str;
        String zzi = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return AbstractC2437ph.j("(typeUrl=", zzi, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        if (this.zza.zzc().zzg() != zzgtp.RAW) {
            return true;
        }
        return false;
    }

    public final zzgni zzb() {
        return this.zza;
    }
}
