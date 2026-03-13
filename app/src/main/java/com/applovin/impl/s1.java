package com.applovin.impl;

import com.applovin.impl.AbstractC1060a;
import com.applovin.impl.e9;
import com.applovin.impl.xl;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Collections;
/* loaded from: classes.dex */
final class s1 extends xl {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public s1(qo qoVar) {
        super(qoVar);
    }

    @Override // com.applovin.impl.xl
    public boolean a(ah ahVar) {
        String str;
        if (!this.b) {
            int w = ahVar.w();
            int i = (w >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.a(new e9.b().f("audio/mpeg").c(1).n(e[(w >> 2) & 3]).a());
                this.c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new xl.a("Audio format not supported: " + this.d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.a.a(new e9.b().f(str).c(1).n(JosStatusCodes.RTN_CODE_COMMON_ERROR).a());
                this.c = true;
            }
            this.b = true;
        } else {
            ahVar.g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.xl
    public boolean b(ah ahVar, long j) {
        if (this.d == 2) {
            int a = ahVar.a();
            this.a.a(ahVar, a);
            this.a.a(j, 1, a, 0, null);
            return true;
        }
        int w = ahVar.w();
        if (w == 0 && !this.c) {
            int a2 = ahVar.a();
            byte[] bArr = new byte[a2];
            ahVar.a(bArr, 0, a2);
            AbstractC1060a.b a3 = AbstractC1060a.a(bArr);
            this.a.a(new e9.b().f("audio/mp4a-latm").a(a3.c).c(a3.b).n(a3.a).a(Collections.singletonList(bArr)).a());
            this.c = true;
            return false;
        } else if (this.d == 10 && w != 1) {
            return false;
        } else {
            int a4 = ahVar.a();
            this.a.a(ahVar, a4);
            this.a.a(j, 1, a4, 0, null);
            return true;
        }
    }
}
