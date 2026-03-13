package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
/* loaded from: classes3.dex */
public final class zzgag {
    static {
        Math.log(2.0d);
    }

    public static int zza(double d, RoundingMode roundingMode) {
        boolean z;
        boolean zzd;
        boolean z2 = false;
        if (d > 0.0d && zzgah.zzb(d)) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzf(z, "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (zzgaf.zza[roundingMode.ordinal()]) {
                case 1:
                    zzgam.zzb(zzd(d));
                    return exponent;
                case 2:
                    return exponent;
                case 3:
                    z2 = !zzd(d);
                    break;
                case 4:
                    if (exponent < 0) {
                        z2 = true;
                    }
                    zzd = zzd(d);
                    z2 &= !zzd;
                    break;
                case 5:
                    if (exponent >= 0) {
                        z2 = true;
                    }
                    zzd = zzd(d);
                    z2 &= !zzd;
                    break;
                case 6:
                case 7:
                case 8:
                    double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                    if (longBitsToDouble * longBitsToDouble > 2.0d) {
                        z2 = true;
                        break;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            if (z2) {
                return exponent + 1;
            }
            return exponent;
        }
        return zza(d * 4.503599627370496E15d, roundingMode) - 52;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long zzb(double r9, java.math.RoundingMode r11) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzgah.zzb(r9)
            if (r0 == 0) goto Lba
            int[] r0 = com.google.android.gms.internal.ads.zzgaf.zza
            int r1 = r11.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L77;
                case 2: goto L68;
                case 3: goto L57;
                case 4: goto L7e;
                case 5: goto L44;
                case 6: goto L3f;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L1c:
            double r2 = java.lang.Math.rint(r9)
            double r6 = r9 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            goto L7e
        L2b:
            double r2 = java.lang.Math.rint(r9)
            double r6 = r9 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            double r2 = java.lang.Math.copySign(r4, r9)
            double r2 = r2 + r9
            goto L7f
        L3f:
            double r2 = java.lang.Math.rint(r9)
            goto L7f
        L44:
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L4b
            goto L7e
        L4b:
            long r4 = (long) r9
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = -1
        L53:
            long r2 = (long) r0
            long r4 = r4 + r2
            double r2 = (double) r4
            goto L7f
        L57:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7e
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L62
            goto L7e
        L62:
            long r2 = (long) r9
            r4 = 1
        L65:
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L7f
        L68:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7e
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L73
            goto L7e
        L73:
            long r2 = (long) r9
            r4 = -1
            goto L65
        L77:
            boolean r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzgam.zzb(r0)
        L7e:
            r2 = r9
        L7f:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L8b
            r4 = 1
            goto L8c
        L8b:
            r4 = 0
        L8c:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L93
            goto L94
        L93:
            r1 = 0
        L94:
            r0 = r4 & r1
            if (r0 == 0) goto L9a
            long r9 = (long) r2
            return r9
        L9a:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " and rounding mode "
            r1.append(r9)
            r1.append(r11)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        Lba:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgag.zzb(double, java.math.RoundingMode):long");
    }

    public static boolean zzc(double d) {
        if (!zzgah.zzb(d)) {
            return false;
        }
        if (d != 0.0d && 52 - Long.numberOfTrailingZeros(zzgah.zza(d)) > Math.getExponent(d)) {
            return false;
        }
        return true;
    }

    public static boolean zzd(double d) {
        if (d > 0.0d && zzgah.zzb(d)) {
            long zza = zzgah.zza(d);
            if ((zza & ((-1) + zza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
