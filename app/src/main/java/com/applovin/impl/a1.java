package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a1 extends dk {
    @Override // com.applovin.impl.dk
    public af a(df dfVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new zg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static af a(zg zgVar) {
        zgVar.d(12);
        int d = (zgVar.d() + zgVar.a(12)) - 4;
        zgVar.d(44);
        zgVar.e(zgVar.a(12));
        zgVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zgVar.d() >= d) {
                break;
            }
            zgVar.d(48);
            int a = zgVar.a(8);
            zgVar.d(4);
            int d2 = zgVar.d() + zgVar.a(12);
            String str2 = null;
            while (zgVar.d() < d2) {
                int a2 = zgVar.a(8);
                int a3 = zgVar.a(8);
                int d3 = zgVar.d() + a3;
                if (a2 == 2) {
                    int a4 = zgVar.a(16);
                    zgVar.d(8);
                    if (a4 != 3) {
                    }
                    while (zgVar.d() < d3) {
                        str = zgVar.a(zgVar.a(8), Charsets.US_ASCII);
                        int a5 = zgVar.a(8);
                        for (int i = 0; i < a5; i++) {
                            zgVar.e(zgVar.a(8));
                        }
                    }
                } else if (a2 == 21) {
                    str2 = zgVar.a(a3, Charsets.US_ASCII);
                }
                zgVar.c(d3 * 8);
            }
            zgVar.c(d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new z0(a, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new af(arrayList);
    }
}
