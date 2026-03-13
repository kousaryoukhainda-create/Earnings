package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* loaded from: classes3.dex */
final class zzfyb extends zzfzs {
    final /* synthetic */ zzfyc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyb(zzfyc zzfycVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzfycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
