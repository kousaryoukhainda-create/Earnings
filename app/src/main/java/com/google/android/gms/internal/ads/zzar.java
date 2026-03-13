package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzar {
    public final String zza;
    public final zzam zzb;
    public final zzal zzc;
    public final zzav zzd;
    public final zzah zze;
    public final zzao zzf;

    static {
        new zzaf().zzc();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzar(String str, zzai zzaiVar, zzam zzamVar, zzal zzalVar, zzav zzavVar, zzao zzaoVar, zzaq zzaqVar) {
        this.zza = str;
        this.zzb = zzamVar;
        this.zzc = zzalVar;
        this.zzd = zzavVar;
        this.zze = zzaiVar;
        this.zzf = zzaoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzar)) {
            return false;
        }
        zzar zzarVar = (zzar) obj;
        if (Objects.equals(this.zza, zzarVar.zza) && this.zze.equals(zzarVar.zze) && Objects.equals(this.zzb, zzarVar.zzb) && Objects.equals(this.zzc, zzarVar.zzc) && Objects.equals(this.zzd, zzarVar.zzd) && Objects.equals(this.zzf, zzarVar.zzf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() * 31;
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            i = zzamVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.zzc.hashCode();
        int hashCode3 = this.zze.hashCode();
        return (this.zzd.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
    }
}
