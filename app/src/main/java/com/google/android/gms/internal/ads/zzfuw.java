package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfuw implements zzfvb {
    final /* synthetic */ zzfua zza;

    public zzfuw(zzfua zzfuaVar) {
        this.zza = zzfuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final /* bridge */ /* synthetic */ Iterator zza(zzfvc zzfvcVar, CharSequence charSequence) {
        return new zzfuv(this, zzfvcVar, charSequence, this.zza.zza(charSequence));
    }
}
