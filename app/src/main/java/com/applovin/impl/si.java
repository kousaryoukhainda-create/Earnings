package com.applovin.impl;
/* loaded from: classes.dex */
public final class si {
    public static final si b = new si(false);
    public final boolean a;

    public si(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && si.class == obj.getClass() && this.a == ((si) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
