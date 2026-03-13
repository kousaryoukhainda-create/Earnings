package com.applovin.impl;
/* loaded from: classes.dex */
public class xd {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public xd(xd xdVar) {
        this.a = xdVar.a;
        this.b = xdVar.b;
        this.c = xdVar.c;
        this.d = xdVar.d;
        this.e = xdVar.e;
    }

    public xd a(Object obj) {
        return this.a.equals(obj) ? this : new xd(obj, this.b, this.c, this.d, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        if (this.a.equals(xdVar.a) && this.b == xdVar.b && this.c == xdVar.c && this.d == xdVar.d && this.e == xdVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public boolean a() {
        return this.b != -1;
    }

    public xd(Object obj) {
        this(obj, -1L);
    }

    public xd(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private xd(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public xd(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public xd(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
