package com.fyber.inneractive.sdk.player.exoplayer2.text.cea;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
/* loaded from: classes.dex */
public final class a {
    public static void a(long j, k kVar, n[] nVarArr) {
        int i;
        while (kVar.a() > 1) {
            int i2 = 0;
            while (true) {
                if (kVar.a() == 0) {
                    i = -1;
                    break;
                }
                int l = kVar.l();
                i2 += l;
                if (l != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (kVar.a() == 0) {
                    i3 = -1;
                    break;
                }
                int l2 = kVar.l();
                i3 += l2;
                if (l2 != 255) {
                    break;
                }
            }
            if (i3 != -1 && i3 <= kVar.a()) {
                if (i == 4 && i3 >= 8) {
                    int i4 = kVar.b;
                    int l3 = kVar.l();
                    int q = kVar.q();
                    int c = kVar.c();
                    int l4 = kVar.l();
                    kVar.e(i4);
                    if (l3 == 181 && q == 49 && c == 1195456820 && l4 == 3) {
                        kVar.f(8);
                        kVar.f(1);
                        int l5 = (kVar.l() & 31) * 3;
                        int i5 = kVar.b;
                        for (n nVar : nVarArr) {
                            kVar.e(i5);
                            nVar.a(kVar, l5);
                            nVar.a(j, 1, l5, 0, null);
                        }
                        kVar.f(i3 - (l5 + 10));
                    }
                }
                kVar.f(i3);
            } else {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                kVar.e(kVar.c);
            }
        }
    }
}
