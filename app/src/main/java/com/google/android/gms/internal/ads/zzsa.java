package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* loaded from: classes3.dex */
public final class zzsa {
    public final zzsg zza;
    public final MediaFormat zzb;
    public final zzab zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzrz zzf;

    private zzsa(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, Surface surface, MediaCrypto mediaCrypto, zzrz zzrzVar) {
        this.zza = zzsgVar;
        this.zzb = mediaFormat;
        this.zzc = zzabVar;
        this.zzd = surface;
        this.zzf = zzrzVar;
    }

    public static zzsa zza(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, MediaCrypto mediaCrypto, zzrz zzrzVar) {
        return new zzsa(zzsgVar, mediaFormat, zzabVar, null, null, zzrzVar);
    }

    public static zzsa zzb(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsa(zzsgVar, mediaFormat, zzabVar, surface, null, null);
    }
}
