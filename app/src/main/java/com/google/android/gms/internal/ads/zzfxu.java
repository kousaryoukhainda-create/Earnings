package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* loaded from: classes3.dex */
final class zzfxu extends zzfvo {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfuo zzb;

    public zzfxu(Iterator it, zzfuo zzfuoVar) {
        this.zza = it;
        this.zzb = zzfuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfuo zzfuoVar = this.zzb;
            Object next = it.next();
            if (zzfuoVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
