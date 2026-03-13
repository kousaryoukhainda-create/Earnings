package com.applovin.impl;
/* loaded from: classes.dex */
public final class kj {
    public static final kj c = new kj(0, 0);
    public final long a;
    public final long b;

    public kj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj.class != obj.getClass()) {
            return false;
        }
        kj kjVar = (kj) obj;
        if (this.a == kjVar.a && this.b == kjVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return BK.n(sb, this.b, "]");
    }
}
