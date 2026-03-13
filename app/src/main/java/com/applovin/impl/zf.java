package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zf extends vg implements Serializable {
    static final zf a = new zf();

    private zf() {
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.applovin.impl.vg
    public vg c() {
        return xi.a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
