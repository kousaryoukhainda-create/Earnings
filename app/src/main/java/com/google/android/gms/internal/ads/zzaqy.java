package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class zzaqy {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << Ascii.CAN) & (-16777216)) | ((bArr[1] << Ascii.DLE) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << Ascii.CAN) & (-16777216)) | ((bArr[1] << Ascii.DLE) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255)) / 65536.0d;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + Ascii.NUL : b;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        if (j < 0) {
            return j + 4294967296L;
        }
        return j;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long zze = zze(byteBuffer) << 32;
        if (zze >= 0) {
            return zze(byteBuffer) + zze;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
