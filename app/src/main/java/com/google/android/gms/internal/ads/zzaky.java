package com.google.android.gms.internal.ads;

import android.graphics.Color;
import io.flutter.embedding.android.KeyboardMap;
/* loaded from: classes3.dex */
final class zzaky {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaky(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
        if (r4 != 3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd A[Catch: RuntimeException -> 0x0059, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0059, blocks: (B:6:0x003e, B:8:0x004d, B:12:0x005d, B:14:0x0061, B:16:0x006e, B:18:0x0072, B:20:0x007f, B:22:0x0083, B:23:0x0089, B:29:0x00a6, B:31:0x00ab, B:35:0x00ba, B:37:0x00be, B:41:0x00cf, B:43:0x00d3, B:47:0x00e4, B:49:0x00e8, B:53:0x00f9, B:55:0x00fd, B:56:0x0103, B:62:0x011e, B:60:0x0110, B:27:0x0091), top: B:71:0x003e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaky zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzakw r21) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaky.zzb(java.lang.String, com.google.android.gms.internal.ads.zzakw):com.google.android.gms.internal.ads.zzaky");
    }

    public static Integer zzc(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= KeyboardMap.kValueMask) {
                z = true;
            } else {
                z = false;
            }
            zzcw.zzd(z);
            int zzb = zzgaq.zzb(((parseLong >> 24) & 255) ^ 255);
            int zzb2 = zzgaq.zzb((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(zzb, zzgaq.zzb(parseLong & 255), zzgaq.zzb((parseLong >> 8) & 255), zzb2));
        } catch (IllegalArgumentException e) {
            zzdo.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Kh0.l(str, "Ignoring unknown alignment: ", "SsaStyle");
        return -1;
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            zzdo.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
