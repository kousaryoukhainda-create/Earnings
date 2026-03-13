package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sh extends AbstractC1061b {
    private final int g;
    private final int h;
    private final int[] i;
    private final int[] j;
    private final fo[] k;
    private final Object[] l;
    private final HashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(Collection collection, wj wjVar) {
        super(false, wjVar);
        int i = 0;
        int size = collection.size();
        this.i = new int[size];
        this.j = new int[size];
        this.k = new fo[size];
        this.l = new Object[size];
        this.m = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            de deVar = (de) it.next();
            this.k[i3] = deVar.b();
            this.j[i3] = i;
            this.i[i3] = i2;
            i += this.k[i3].b();
            i2 += this.k[i3].a();
            this.l[i3] = deVar.a();
            this.m.put(this.l[i3], Integer.valueOf(i3));
            i3++;
        }
        this.g = i;
        this.h = i2;
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return this.h;
    }

    @Override // com.applovin.impl.AbstractC1061b
    public int b(Object obj) {
        Integer num = (Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.impl.AbstractC1061b
    public int d(int i) {
        return xp.a(this.i, i + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC1061b
    public int e(int i) {
        return xp.a(this.j, i + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC1061b
    public Object f(int i) {
        return this.l[i];
    }

    @Override // com.applovin.impl.AbstractC1061b
    public int g(int i) {
        return this.i[i];
    }

    @Override // com.applovin.impl.AbstractC1061b
    public int h(int i) {
        return this.j[i];
    }

    @Override // com.applovin.impl.AbstractC1061b
    public fo i(int i) {
        return this.k[i];
    }

    public List d() {
        return Arrays.asList(this.k);
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return this.g;
    }
}
