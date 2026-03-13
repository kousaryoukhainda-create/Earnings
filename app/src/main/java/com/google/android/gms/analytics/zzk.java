package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class zzk {
    protected final zzh zza;
    private final zzr zzb;
    private final List zzc;

    public zzk(zzr zzrVar, Clock clock) {
        Preconditions.checkNotNull(zzrVar);
        this.zzb = zzrVar;
        this.zzc = new ArrayList();
        zzh zzhVar = new zzh(this, clock);
        zzhVar.zzh();
        this.zza = zzhVar;
    }

    public void zze(zzh zzhVar) {
        throw null;
    }

    public final zzr zzm() {
        return this.zzb;
    }

    public final void zzn(zzh zzhVar) {
        for (zzi zziVar : this.zzc) {
            zziVar.zza();
        }
    }
}
