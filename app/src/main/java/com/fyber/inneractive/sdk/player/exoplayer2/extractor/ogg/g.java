package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends h {
    public static final int o = u.a("Opus");
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int i;
        byte[] bArr = kVar.a;
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
        return a(i * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? HwBuildEx.VersionCodes.CUR_DEVELOPMENT << (i4 & 1) : i5 == 3 ? OrderStatusCode.ORDER_STATE_CANCEL : HwBuildEx.VersionCodes.CUR_DEVELOPMENT << i5));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(kVar.a, kVar.c);
            int i = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            a(arrayList, 3840);
            aVar.a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/opus", (String) null, -1, -1, i, 48000, -1, arrayList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
            this.n = true;
            return true;
        }
        boolean z = kVar.c() == o;
        kVar.e(0);
        return z;
    }

    public final void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}
