package com.google.android.gms.internal.gtm;

import com.applovin.exoplayer2.common.base.Ascii;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaaz {
    private static final zzaaw zza;

    static {
        if (zzaau.zzx() && zzaau.zzy()) {
            int i = zzto.zza;
        }
        zza = new zzaax();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b <= -12 && b2 <= -65 && b3 <= -65) {
                        return ((b2 << 8) ^ b) ^ (b3 << Ascii.DLE);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b4 = bArr[i];
                if (b <= -12 && b4 <= -65) {
                    return b ^ (b4 << 8);
                }
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzaaz.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzaay(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i, int i2) throws zzyg {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b = bArr[i];
                if (!zzaav.zzd(b)) {
                    break;
                }
                i++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i < i4) {
                int i7 = i + 1;
                byte b2 = bArr[i];
                if (zzaav.zzd(b2)) {
                    cArr[i6] = (char) b2;
                    i6++;
                    i = i7;
                    while (i < i4) {
                        byte b3 = bArr[i];
                        if (zzaav.zzd(b3)) {
                            i++;
                            cArr[i6] = (char) b3;
                            i6++;
                        }
                    }
                } else {
                    if (b2 < -32) {
                        if (i7 < i4) {
                            i3 = i6 + 1;
                            i += 2;
                            zzaav.zzc(b2, bArr[i7], cArr, i6);
                        } else {
                            throw zzyg.zzd();
                        }
                    } else if (b2 < -16) {
                        if (i7 < i4 - 1) {
                            i3 = i6 + 1;
                            int i8 = i + 2;
                            i += 3;
                            zzaav.zzb(b2, bArr[i7], bArr[i8], cArr, i6);
                        } else {
                            throw zzyg.zzd();
                        }
                    } else if (i7 < i4 - 2) {
                        byte b4 = bArr[i7];
                        int i9 = i + 3;
                        i += 4;
                        zzaav.zza(b2, b4, bArr[i + 2], bArr[i9], cArr, i6);
                        i6 += 2;
                    } else {
                        throw zzyg.zzd();
                    }
                    i6 = i3;
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }
}
