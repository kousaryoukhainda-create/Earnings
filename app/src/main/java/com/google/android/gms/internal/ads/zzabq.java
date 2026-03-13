package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzabq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
        if (r12 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (r12 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
        if (r12 != 8) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzabo zza(com.google.android.gms.internal.ads.zzdx r12) {
        /*
            r0 = 16
            int r1 = r12.zzd(r0)
            int r0 = r12.zzd(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.zzd(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.zzd(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L3e
            r1 = 0
        L2c:
            int r5 = r12.zzd(r0)
            int r5 = r5 + r1
            boolean r1 = r12.zzp()
            if (r1 != 0) goto L39
            int r5 = r5 + r4
            goto L3f
        L39:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L3e:
            r5 = r1
        L3f:
            r1 = 10
            int r1 = r12.zzd(r1)
            boolean r6 = r12.zzp()
            if (r6 == 0) goto L54
            int r6 = r12.zzd(r4)
            if (r6 <= 0) goto L54
            r12.zzn(r0)
        L54:
            boolean r6 = r12.zzp()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L65
            r11 = 44100(0xac44, float:6.1797E-41)
            goto L68
        L65:
            r11 = 48000(0xbb80, float:6.7262E-41)
        L68:
            int r12 = r12.zzd(r3)
            if (r11 != r9) goto L78
            r6 = 13
            if (r12 != r6) goto L78
            int[] r12 = com.google.android.gms.internal.ads.zzabq.zzb
            r12 = r12[r6]
            r9 = r12
            goto La6
        L78:
            if (r11 != r7) goto La5
            r6 = 14
            if (r12 >= r6) goto La5
            int[] r2 = com.google.android.gms.internal.ads.zzabq.zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto La0
            r7 = 11
            if (r1 == r0) goto L9b
            if (r1 == r4) goto La0
            if (r1 == r3) goto L91
            goto L99
        L91:
            if (r12 == r4) goto L97
            if (r12 == r6) goto L97
            if (r12 != r7) goto L99
        L97:
            int r2 = r2 + 1
        L99:
            r9 = r2
            goto La6
        L9b:
            if (r12 == r6) goto L97
            if (r12 != r7) goto L99
            goto L97
        La0:
            if (r12 == r4) goto L97
            if (r12 != r6) goto L99
            goto L97
        La5:
            r9 = 0
        La6:
            com.google.android.gms.internal.ads.zzabo r12 = new com.google.android.gms.internal.ads.zzabo
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabq.zza(com.google.android.gms.internal.ads.zzdx):com.google.android.gms.internal.ads.zzabo");
    }

    public static void zzb(int i, zzdy zzdyVar) {
        zzdyVar.zzI(7);
        byte[] zzN = zzdyVar.zzN();
        zzN[0] = -84;
        zzN[1] = 64;
        zzN[2] = -1;
        zzN[3] = -1;
        zzN[4] = (byte) ((i >> 16) & 255);
        zzN[5] = (byte) ((i >> 8) & 255);
        zzN[6] = (byte) (i & 255);
    }
}
