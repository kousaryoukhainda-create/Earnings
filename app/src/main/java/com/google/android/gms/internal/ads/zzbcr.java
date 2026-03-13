package com.google.android.gms.internal.ads;

import android.text.TextUtils;
@Deprecated
/* loaded from: classes3.dex */
public final class zzbcr {
    public static final void zza(zzbcq zzbcqVar, zzbco zzbcoVar) {
        if (zzbcoVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbcoVar.zzb())) {
                zzbcqVar.zzd(zzbcoVar.zza(), zzbcoVar.zzb(), zzbcoVar.zzc(), zzbcoVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
