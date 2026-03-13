package com.applovin.impl;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class kl implements nl {
    private final a5[] a;
    private final long[] b;

    public kl(a5[] a5VarArr, long[] jArr) {
        this.a = a5VarArr;
        this.b = jArr;
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        b1.a(i >= 0);
        b1.a(i < this.b.length);
        return this.b[i];
    }

    @Override // com.applovin.impl.nl
    public List b(long j) {
        a5 a5Var;
        int b = xp.b(this.b, j, true, false);
        if (b != -1 && (a5Var = this.a[b]) != a5.s) {
            return Collections.singletonList(a5Var);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int a = xp.a(this.b, j, false, false);
        if (a < this.b.length) {
            return a;
        }
        return -1;
    }
}
