package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* loaded from: classes3.dex */
final class zzfxz extends zzfzs {
    final /* synthetic */ zzfya zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxz(zzfya zzfyaVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
