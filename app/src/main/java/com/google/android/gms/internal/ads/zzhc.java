package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* loaded from: classes3.dex */
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = AbstractC3150y0.g();

    public static /* bridge */ /* synthetic */ void zza(zzhc zzhcVar, int i, int i2) {
        zzhcVar.zzb.set(i, i2);
        zzhcVar.zza.setPattern(zzhcVar.zzb);
    }
}
