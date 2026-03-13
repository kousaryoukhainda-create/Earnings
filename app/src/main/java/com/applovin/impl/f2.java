package com.applovin.impl;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class f2 implements g8 {
    protected final oo a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final e9[] e;
    private final long[] f;
    private int g;

    public f2(oo ooVar, int[] iArr, int i) {
        boolean z;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.b(z);
        this.d = i;
        this.a = (oo) b1.a(ooVar);
        int length = iArr.length;
        this.b = length;
        this.e = new e9[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = ooVar.a(iArr[i3]);
        }
        Arrays.sort(this.e, new R9(20));
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = ooVar.a(this.e[i2]);
                i2++;
            } else {
                this.f = new long[i4];
                return;
            }
        }
    }

    public static /* synthetic */ int b(e9 e9Var, e9 e9Var2) {
        return a(e9Var, e9Var2);
    }

    @Override // com.applovin.impl.g8
    public void a(float f) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (this.a == f2Var.a && Arrays.equals(this.c, f2Var.c)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.g8
    public void f() {
    }

    @Override // com.applovin.impl.g8
    public final e9 g() {
        return this.e[h()];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.g;
    }

    @Override // com.applovin.impl.g8
    public void i() {
    }

    @Override // com.applovin.impl.g8
    public final /* synthetic */ void j() {
        Zh0.b(this);
    }

    @Override // com.applovin.impl.g8
    public final /* synthetic */ void k() {
        Zh0.c(this);
    }

    @Override // com.applovin.impl.g8
    public final /* synthetic */ void a(boolean z) {
        Zh0.a(this, z);
    }

    @Override // com.applovin.impl.so
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.applovin.impl.so
    public final e9 a(int i) {
        return this.e[i];
    }

    @Override // com.applovin.impl.so
    public final int b() {
        return this.c.length;
    }

    @Override // com.applovin.impl.so
    public final oo a() {
        return this.a;
    }

    public static /* synthetic */ int a(e9 e9Var, e9 e9Var2) {
        return e9Var2.i - e9Var.i;
    }
}
