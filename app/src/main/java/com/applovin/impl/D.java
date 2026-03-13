package com.applovin.impl;

import com.applovin.impl.ik;
import com.applovin.impl.xr;
import com.applovin.impl.z2;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class D implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ D(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return as.b((wr) obj, (wr) obj2);
            case 1:
                return ik.d((ik.b) obj, (ik.b) obj2);
            case 2:
                return ik.c((ik.b) obj, (ik.b) obj2);
            case 3:
                return xr.b.b((xr.b) obj, (xr.b) obj2);
            default:
                return z2.a.b((z2.a) obj, (z2.a) obj2);
        }
    }
}
