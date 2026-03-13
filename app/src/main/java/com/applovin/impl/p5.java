package com.applovin.impl;
/* loaded from: classes.dex */
public final class p5 {
    public final String a;
    public final e9 b;
    public final e9 c;
    public final int d;
    public final int e;

    public p5(String str, e9 e9Var, e9 e9Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        b1.a(z);
        this.a = b1.a(str);
        this.b = (e9) b1.a(e9Var);
        this.c = (e9) b1.a(e9Var2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5.class != obj.getClass()) {
            return false;
        }
        p5 p5Var = (p5) obj;
        if (this.d == p5Var.d && this.e == p5Var.e && this.a.equals(p5Var.a) && this.b.equals(p5Var.b) && this.c.equals(p5Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int b = AbstractC2437ph.b((((this.d + 527) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + b) * 31);
    }
}
