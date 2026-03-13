package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzgot {
    public static final zzgot zza = new zzgot("SHA1");
    public static final zzgot zzb = new zzgot("SHA224");
    public static final zzgot zzc = new zzgot("SHA256");
    public static final zzgot zzd = new zzgot("SHA384");
    public static final zzgot zze = new zzgot("SHA512");
    private final String zzf;

    private zzgot(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
