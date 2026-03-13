package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzaps {
    public final Object zza;
    public final zzaov zzb;
    public final zzapv zzc;
    public boolean zzd;

    private zzaps(zzapv zzapvVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapvVar;
    }

    public static zzaps zza(zzapv zzapvVar) {
        return new zzaps(zzapvVar);
    }

    public static zzaps zzb(Object obj, zzaov zzaovVar) {
        return new zzaps(obj, zzaovVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaps(Object obj, zzaov zzaovVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaovVar;
        this.zzc = null;
    }
}
