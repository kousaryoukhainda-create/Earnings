package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzglu {
    private final zzglo zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzglu(zzglo zzgloVar, List list, Integer num, zzglt zzgltVar) {
        this.zza = zzgloVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglu)) {
            return false;
        }
        zzglu zzgluVar = (zzglu) obj;
        if (!this.zza.equals(zzgluVar.zza) || !this.zzb.equals(zzgluVar.zzb) || !Objects.equals(this.zzc, zzgluVar.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
