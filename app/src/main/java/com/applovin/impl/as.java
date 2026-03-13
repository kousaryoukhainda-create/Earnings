package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class as implements nl {
    private final List a;
    private final long[] b;
    private final long[] c;

    public as(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            wr wrVar = (wr) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = wrVar.b;
            jArr[i2 + 1] = wrVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        b1.a(i >= 0);
        b1.a(i < this.c.length);
        return this.c[i];
    }

    @Override // com.applovin.impl.nl
    public List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                wr wrVar = (wr) this.a.get(i);
                a5 a5Var = wrVar.a;
                if (a5Var.f == -3.4028235E38f) {
                    arrayList2.add(wrVar);
                } else {
                    arrayList.add(a5Var);
                }
            }
        }
        Collections.sort(arrayList2, new D(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((wr) arrayList2.get(i3)).a.a().a((-1) - i3, 1).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.c.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int a = xp.a(this.c, j, false, false);
        if (a < this.c.length) {
            return a;
        }
        return -1;
    }

    public static /* synthetic */ int a(wr wrVar, wr wrVar2) {
        return Long.compare(wrVar.b, wrVar2.b);
    }
}
