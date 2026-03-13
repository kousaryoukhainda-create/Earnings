package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzrr;
import com.google.android.gms.internal.gtm.zzrz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
final class zzes {
    private zzrr zzf;
    private final Set zza = new HashSet();
    private final Map zzb = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zze = new HashMap();

    public final zzrr zza() {
        return this.zzf;
    }

    public final Map zzb() {
        return this.zzd;
    }

    public final Map zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final Set zzf() {
        return this.zza;
    }

    public final void zzg(zzrz zzrzVar, zzrr zzrrVar) {
        List list = (List) this.zzb.get(zzrzVar);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(zzrzVar, list);
        }
        list.add(zzrrVar);
    }

    public final void zzh(zzrz zzrzVar, String str) {
        List list = (List) this.zzd.get(zzrzVar);
        if (list == null) {
            list = new ArrayList();
            this.zzd.put(zzrzVar, list);
        }
        list.add("Unknown");
    }

    public final void zzi(zzrz zzrzVar, zzrr zzrrVar) {
        List list = (List) this.zzc.get(zzrzVar);
        if (list == null) {
            list = new ArrayList();
            this.zzc.put(zzrzVar, list);
        }
        list.add(zzrrVar);
    }

    public final void zzj(zzrz zzrzVar, String str) {
        List list = (List) this.zze.get(zzrzVar);
        if (list == null) {
            list = new ArrayList();
            this.zze.put(zzrzVar, list);
        }
        list.add("Unknown");
    }

    public final void zzk(zzrz zzrzVar) {
        this.zza.add(zzrzVar);
    }

    public final void zzl(zzrr zzrrVar) {
        this.zzf = zzrrVar;
    }
}
