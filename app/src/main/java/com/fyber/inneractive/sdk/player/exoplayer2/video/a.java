package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static byte[] a(k kVar) {
        int q = kVar.q();
        int i = kVar.b;
        kVar.f(q);
        byte[] bArr = kVar.a;
        byte[] bArr2 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.a;
        byte[] bArr3 = new byte[bArr2.length + q];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, q);
        return bArr3;
    }

    public static a b(k kVar) throws l {
        int i;
        int i2;
        float f;
        try {
            kVar.f(4);
            int l = (kVar.l() & 3) + 1;
            if (l != 3) {
                ArrayList arrayList = new ArrayList();
                int l2 = kVar.l() & 31;
                for (int i3 = 0; i3 < l2; i3++) {
                    arrayList.add(a(kVar));
                }
                int l3 = kVar.l();
                for (int i4 = 0; i4 < l3; i4++) {
                    arrayList.add(a(kVar));
                }
                if (l2 > 0) {
                    i.b b = i.b((byte[]) arrayList.get(0), l, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.b;
                    int i6 = b.c;
                    f = b.d;
                    i = i5;
                    i2 = i6;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new a(arrayList, l, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new l("Error parsing AVC config", e);
        }
    }
}
