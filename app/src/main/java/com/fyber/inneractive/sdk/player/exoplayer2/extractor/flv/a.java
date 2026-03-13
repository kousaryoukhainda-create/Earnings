package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends d {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public a(n nVar) {
        super(nVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) throws d.a {
        String str;
        int i;
        if (!this.b) {
            int l = kVar.l();
            int i2 = (l >> 4) & 15;
            this.d = i2;
            if (i2 == 2) {
                this.a.a(i.a((String) null, "audio/mpeg", (String) null, -1, -1, 1, e[(l >> 2) & 3], -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.c = true;
            } else if (i2 != 7 && i2 != 8) {
                if (i2 != 10) {
                    throw new d.a("Audio format not supported: " + this.d);
                }
            } else {
                if (i2 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                String str2 = str;
                if ((l & 1) == 1) {
                    i = 2;
                } else {
                    i = 3;
                }
                this.a.a(i.a((String) null, str2, (String) null, -1, -1, 1, (int) JosStatusCodes.RTN_CODE_COMMON_ERROR, i, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.c = true;
            }
            this.b = true;
        } else {
            kVar.f(1);
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j) {
        if (this.d == 2) {
            int a = kVar.a();
            this.a.a(kVar, a);
            this.a.a(j, 1, a, 0, null);
            return;
        }
        int l = kVar.l();
        if (l == 0 && !this.c) {
            int a2 = kVar.a();
            byte[] bArr = new byte[a2];
            System.arraycopy(kVar.a, kVar.b, bArr, 0, a2);
            kVar.b += a2;
            Pair<Integer, Integer> a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.a(bArr);
            this.a.a(i.a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, Collections.singletonList(bArr), (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
            this.c = true;
        } else if (this.d != 10 || l == 1) {
            int a4 = kVar.a();
            this.a.a(kVar, a4);
            this.a.a(j, 1, a4, 0, null);
        }
    }
}
