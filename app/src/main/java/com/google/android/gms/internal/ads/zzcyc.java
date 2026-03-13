package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class zzcyc extends zzdbj implements zzcwn, zzcxs {
    private final zzfbo zzb;
    private final AtomicBoolean zzc;

    public zzcyc(Set set, zzfbo zzfboVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfboVar;
    }

    private final void zza() {
        final com.google.android.gms.ads.internal.client.zzu zzuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhI)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzuVar = this.zzb.zzae) != null && zzuVar.zza == 3) {
            zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcyb
                @Override // com.google.android.gms.internal.ads.zzdbi
                public final void zza(Object obj) {
                    ((zzcye) obj).zzh(com.google.android.gms.ads.internal.client.zzu.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        int i = this.zzb.zzb;
        if (i != 2 && i != 5 && i != 4 && i != 6 && i != 7) {
            return;
        }
        zza();
    }
}
