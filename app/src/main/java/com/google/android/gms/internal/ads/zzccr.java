package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzccr extends zzaqv {
    static final zzccr zzb = new zzccr();

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final zzaqz zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzarb();
        }
        if ("mvhd".equals(str)) {
            return new zzarc();
        }
        return new zzard(str);
    }
}
