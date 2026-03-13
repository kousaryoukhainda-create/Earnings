package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzxu {
    public final zzbr zza;
    public final int[] zzb;

    public zzxu(zzbr zzbrVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdo.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbrVar;
        this.zzb = iArr;
    }
}
