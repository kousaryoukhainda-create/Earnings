package com.applovin.impl;

import com.applovin.impl.e9;
import com.applovin.impl.gl;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.Arrays;
/* loaded from: classes.dex */
final class sg extends gl {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean n;

    private long a(byte[] bArr) {
        int i;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return i * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? HwBuildEx.VersionCodes.CUR_DEVELOPMENT << (i4 & 1) : i5 == 3 ? OrderStatusCode.ORDER_STATE_CANCEL : HwBuildEx.VersionCodes.CUR_DEVELOPMENT << i5);
    }

    public static boolean b(ah ahVar) {
        int a = ahVar.a();
        byte[] bArr = o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        ahVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.gl
    public long a(ah ahVar) {
        return b(a(ahVar.c()));
    }

    @Override // com.applovin.impl.gl
    public boolean a(ah ahVar, long j, gl.b bVar) {
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(ahVar.c(), ahVar.e());
            bVar.a = new e9.b().f("audio/opus").c(tg.b(copyOf)).n(48000).a(tg.a(copyOf)).a();
            this.n = true;
            return true;
        }
        b1.a(bVar.a);
        boolean z = ahVar.j() == 1332770163;
        ahVar.f(0);
        return z;
    }

    @Override // com.applovin.impl.gl
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }
}
