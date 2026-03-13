package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfuu implements zzfvb {
    final /* synthetic */ zzfty zza;

    public zzfuu(zzfty zzftyVar) {
        this.zza = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final /* bridge */ /* synthetic */ Iterator zza(zzfvc zzfvcVar, CharSequence charSequence) {
        return new zzfut(this, zzfvcVar, charSequence, this.zza);
    }
}
