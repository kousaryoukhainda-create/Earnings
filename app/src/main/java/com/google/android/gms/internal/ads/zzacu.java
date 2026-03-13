package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzacu {
    public static int zza(zzdy zzdyVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdyVar.zzm() + 1;
            case 7:
                return zzdyVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzaco zzacoVar, zzacy zzacyVar) throws IOException {
        boolean z;
        int i;
        zzacoVar.zzj();
        zzacoVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacoVar.zzh(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        if (1 != i2) {
            z = false;
        } else {
            z = true;
        }
        zzacoVar.zzg(2);
        if (1 != i2) {
            i = 6;
        } else {
            i = 7;
        }
        zzdy zzdyVar = new zzdy(i);
        zzdyVar.zzK(zzacr.zza(zzacoVar, zzdyVar.zzN(), 0, i));
        zzacoVar.zzj();
        zzact zzactVar = new zzact();
        if (zzd(zzdyVar, zzacyVar, z, zzactVar)) {
            return zzactVar.zza;
        }
        throw zzbc.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r4 != r22.zzf) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
        if ((r21.zzm() * 1000) == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
        if (r3 == r5) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzc(com.google.android.gms.internal.ads.zzdy r21, com.google.android.gms.internal.ads.zzacy r22, int r23, com.google.android.gms.internal.ads.zzact r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.zzd()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r10
            long r3 = r3 & r7
            r19 = 15
            long r9 = r15 & r19
            int r10 = (int) r9
            r9 = 7
            r15 = -1
            if (r10 > r9) goto L44
            int r9 = r1.zzg
            int r9 = r9 + r15
            if (r10 != r9) goto L41
            goto L4d
        L41:
            r0 = 0
            goto Lb1
        L44:
            r9 = 10
            if (r10 > r9) goto L41
            int r9 = r1.zzg
            r10 = 2
            if (r9 != r10) goto L41
        L4d:
            r9 = 7
            long r9 = r17 & r9
            int r10 = (int) r9
            if (r10 != 0) goto L55
            goto L59
        L55:
            int r9 = r1.zzi
            if (r10 != r9) goto L41
        L59:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L41
            r3 = r24
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto L41
            long r3 = r11 & r19
            int r4 = (int) r3
            int r3 = zza(r0, r4)
            if (r3 == r15) goto L41
            int r4 = r1.zzb
            if (r3 > r4) goto L41
            long r3 = r13 & r19
            int r5 = r1.zze
            int r4 = (int) r3
            if (r4 != 0) goto L7a
            goto L9c
        L7a:
            r3 = 11
            if (r4 > r3) goto L83
            int r1 = r1.zzf
            if (r4 == r1) goto L9c
            goto L41
        L83:
            if (r4 != r6) goto L8e
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto L41
            goto L9c
        L8e:
            r1 = 14
            if (r4 > r1) goto L41
            int r3 = r21.zzq()
            if (r4 != r1) goto L9a
            int r3 = r3 * 10
        L9a:
            if (r3 != r5) goto L41
        L9c:
            int r1 = r21.zzm()
            int r3 = r21.zzd()
            byte[] r0 = r21.zzN()
            int r3 = r3 + r15
            r4 = 0
            int r0 = com.google.android.gms.internal.ads.zzei.zzg(r0, r2, r3, r4)
            if (r1 != r0) goto L41
            r0 = 1
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacu.zzc(com.google.android.gms.internal.ads.zzdy, com.google.android.gms.internal.ads.zzacy, int, com.google.android.gms.internal.ads.zzact):boolean");
    }

    private static boolean zzd(zzdy zzdyVar, zzacy zzacyVar, boolean z, zzact zzactVar) {
        try {
            long zzx = zzdyVar.zzx();
            if (!z) {
                zzx *= zzacyVar.zzb;
            }
            zzactVar.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
