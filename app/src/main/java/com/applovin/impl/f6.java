package com.applovin.impl;

import com.applovin.impl.lc;
import com.applovin.impl.nc;
import com.applovin.impl.pa;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public class f6 implements lc {
    private final int a;

    public f6() {
        this(-1);
    }

    @Override // com.applovin.impl.lc
    public final /* synthetic */ void a(long j) {
        AbstractC3129xj0.a(this, j);
    }

    public f6(int i) {
        this.a = i;
    }

    @Override // com.applovin.impl.lc
    public int a(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // com.applovin.impl.lc
    public long a(lc.a aVar) {
        IOException iOException = aVar.c;
        if ((iOException instanceof ch) || (iOException instanceof FileNotFoundException) || (iOException instanceof pa.a) || (iOException instanceof nc.h) || i5.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.d - 1) * 1000, 5000);
    }
}
