package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzrz {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;
    private final List zzi;
    private final List zzj;

    public /* synthetic */ zzrz(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, zzry zzryVar) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableList(list2);
        this.zzc = Collections.unmodifiableList(list3);
        this.zzd = Collections.unmodifiableList(list4);
        this.zze = Collections.unmodifiableList(list5);
        this.zzf = Collections.unmodifiableList(list6);
        this.zzg = Collections.unmodifiableList(list7);
        this.zzh = Collections.unmodifiableList(list8);
        this.zzi = Collections.unmodifiableList(list9);
        this.zzj = Collections.unmodifiableList(list10);
    }

    public final String toString() {
        List list = this.zzf;
        List list2 = this.zze;
        List list3 = this.zzd;
        List list4 = this.zzc;
        List list5 = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(list5);
        String valueOf3 = String.valueOf(list4);
        String valueOf4 = String.valueOf(list3);
        String valueOf5 = String.valueOf(list2);
        String valueOf6 = String.valueOf(list);
        StringBuilder q = BK.q("Positive predicates: ", valueOf, "  Negative predicates: ", valueOf2, "  Add tags: ");
        AbstractC2437ph.w(q, valueOf3, "  Remove tags: ", valueOf4, "  Add macros: ");
        return BK.o(q, valueOf5, "  Remove macros: ", valueOf6);
    }

    public final List zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzi;
    }

    public final List zzc() {
        return this.zzc;
    }

    public final List zzd() {
        return this.zzb;
    }

    public final List zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzj;
    }

    public final List zzh() {
        return this.zzd;
    }
}
