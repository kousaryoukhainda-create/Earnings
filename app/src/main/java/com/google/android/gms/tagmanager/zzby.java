package com.google.android.gms.tagmanager;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzby extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.HASH.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ALGORITHM.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.INPUT_FORMAT.toString();

    public zzby() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzm;
        String zzm2;
        byte[] zzb2;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null && zzamVar != zzfu.zza()) {
            String zzm3 = zzfu.zzm(zzfu.zzk(zzamVar));
            com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            if (zzamVar2 == null) {
                zzm = "MD5";
            } else {
                zzm = zzfu.zzm(zzfu.zzk(zzamVar2));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
            if (zzamVar3 == null) {
                zzm2 = "text";
            } else {
                zzm2 = zzfu.zzm(zzfu.zzk(zzamVar3));
            }
            if ("text".equals(zzm2)) {
                zzb2 = zzm3.getBytes();
            } else if ("base16".equals(zzm2)) {
                zzb2 = zzp.zzb(zzm3);
            } else {
                Log.e("GoogleTagManager", "Hash: unknown input format: ".concat(String.valueOf(zzm2)));
                return zzfu.zza();
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(zzm);
                messageDigest.update(zzb2);
                return zzfu.zzb(zzp.zza(messageDigest.digest()));
            } catch (NoSuchAlgorithmException unused) {
                Log.e("GoogleTagManager", "Hash: unknown algorithm: ".concat(String.valueOf(zzm)));
                return zzfu.zza();
            }
        }
        return zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
