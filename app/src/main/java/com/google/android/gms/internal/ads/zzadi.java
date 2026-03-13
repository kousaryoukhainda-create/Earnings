package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzadi {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i;
        byte b = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b2; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b3 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b3; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + Ascii.ESC + i;
        byte b4 = byteBuffer.get(i6);
        if (byteBuffer.limit() - i6 > 1) {
            b = byteBuffer.get(i6 + 1);
        }
        return (int) ((zzg(b4, b) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((zzg(b2, b) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return zzg(b2, b);
    }

    public static List zze(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza(bArr))));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j, long j2) {
        return j - j2 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return i * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? HwBuildEx.VersionCodes.CUR_DEVELOPMENT << (i4 & 1) : i5 == 3 ? OrderStatusCode.ORDER_STATE_CANCEL : HwBuildEx.VersionCodes.CUR_DEVELOPMENT << i5);
    }

    private static long zzh(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzi(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
