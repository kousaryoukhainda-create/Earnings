package com.applovin.impl;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class al implements nl {
    private final List a;
    private final List b;

    public al(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        b1.a(i >= 0);
        b1.a(i < this.b.size());
        return ((Long) this.b.get(i)).longValue();
    }

    @Override // com.applovin.impl.nl
    public List b(long j) {
        int b = xp.b(this.b, (Comparable) Long.valueOf(j), true, false);
        if (b == -1) {
            return Collections.emptyList();
        }
        return (List) this.a.get(b);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.size();
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int a = xp.a(this.b, (Comparable) Long.valueOf(j), false, false);
        if (a < this.b.size()) {
            return a;
        }
        return -1;
    }
}
