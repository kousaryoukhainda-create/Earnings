package com.applovin.impl;
/* loaded from: classes.dex */
public final class v1 {
    public final int a;
    public final float b;

    public v1(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (this.a == v1Var.a && Float.compare(v1Var.b, this.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b) + ((this.a + 527) * 31);
    }
}
