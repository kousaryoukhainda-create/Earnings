package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
/* loaded from: classes.dex */
final class xi extends vg implements Serializable {
    static final xi a = new xi();

    private xi() {
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.applovin.impl.vg
    public vg c() {
        return vg.a();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
