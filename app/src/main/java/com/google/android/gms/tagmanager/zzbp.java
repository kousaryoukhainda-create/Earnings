package com.google.android.gms.tagmanager;

import android.util.Base64;
import android.util.Log;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzbp extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ENCODE.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.NO_PADDING.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.INPUT_FORMAT.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.OUTPUT_FORMAT.toString();

    public zzbp() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzm;
        String zzm2;
        byte[] decode;
        String encodeToString;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null && zzamVar != zzfu.zza()) {
            String zzm3 = zzfu.zzm(zzfu.zzk(zzamVar));
            com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
            if (zzamVar2 == null) {
                zzm = "text";
            } else {
                zzm = zzfu.zzm(zzfu.zzk(zzamVar2));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
            if (zzamVar3 == null) {
                zzm2 = "base16";
            } else {
                zzm2 = zzfu.zzm(zzfu.zzk(zzamVar3));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            int i = 2;
            if (zzamVar4 != null && zzfu.zzf(zzfu.zzk(zzamVar4)).booleanValue()) {
                i = 3;
            }
            try {
                if ("text".equals(zzm)) {
                    decode = zzm3.getBytes();
                } else if ("base16".equals(zzm)) {
                    decode = zzp.zzb(zzm3);
                } else if ("base64".equals(zzm)) {
                    decode = Base64.decode(zzm3, i);
                } else if ("base64url".equals(zzm)) {
                    decode = Base64.decode(zzm3, i | 8);
                } else {
                    Log.e("GoogleTagManager", "Encode: unknown input format: " + zzm);
                    return zzfu.zza();
                }
                if ("base16".equals(zzm2)) {
                    encodeToString = zzp.zza(decode);
                } else if ("base64".equals(zzm2)) {
                    encodeToString = Base64.encodeToString(decode, i);
                } else if ("base64url".equals(zzm2)) {
                    encodeToString = Base64.encodeToString(decode, i | 8);
                } else {
                    Log.e("GoogleTagManager", "Encode: unknown output format: ".concat(String.valueOf(zzm2)));
                    return zzfu.zza();
                }
                return zzfu.zzb(encodeToString);
            } catch (IllegalArgumentException unused) {
                Log.e("GoogleTagManager", "Encode: invalid input:");
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
