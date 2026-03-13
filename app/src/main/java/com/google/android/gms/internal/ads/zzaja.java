package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzaja {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadq zza(zzaco zzacoVar) throws IOException {
        return zzc(zzacoVar, true, false);
    }

    public static zzadq zzb(zzaco zzacoVar, boolean z) throws IOException {
        return zzc(zzacoVar, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011c, code lost:
        if (r11 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0120, code lost:
        return com.google.android.gms.internal.ads.zzaiw.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0123, code lost:
        if (r25 == r4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0125, code lost:
        if (r4 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
        return com.google.android.gms.internal.ads.zzair.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
        return com.google.android.gms.internal.ads.zzair.zza;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzadq zzc(com.google.android.gms.internal.ads.zzaco r24, boolean r25, boolean r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaja.zzc(com.google.android.gms.internal.ads.zzaco, boolean, boolean):com.google.android.gms.internal.ads.zzadq");
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
