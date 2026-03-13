package com.applovin.impl;
/* loaded from: classes.dex */
public final class lo {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final e9 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final mo[] k;

    public lo(int i, int i2, long j, long j2, long j3, e9 e9Var, int i3, mo[] moVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = e9Var;
        this.g = i3;
        this.k = moVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public mo a(int i) {
        mo[] moVarArr = this.k;
        if (moVarArr == null) {
            return null;
        }
        return moVarArr[i];
    }
}
