package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class vg implements Comparator {
    public static vg a(Comparator comparator) {
        if (comparator instanceof vg) {
            return (vg) comparator;
        }
        return new x3(comparator);
    }

    public vg b() {
        return a(uc.a());
    }

    public vg c() {
        return new yi(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public db a(Iterable iterable) {
        return db.a((Comparator) this, iterable);
    }

    public static vg a() {
        return zf.a;
    }

    public vg a(Function function) {
        return new r2(function, this);
    }
}
