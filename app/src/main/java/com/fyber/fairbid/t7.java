package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
/* loaded from: classes.dex */
public final class t7 {
    public final Constants.AdType a;
    public final String b;

    public t7(Constants.AdType adType, String str) {
        this.a = adType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.a != t7Var.a) {
            return false;
        }
        return this.b.equals(t7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchCacheKey{adType=");
        sb.append(this.a);
        sb.append(", tpnPlacementId='");
        return AbstractC0324Hi.h(sb, this.b, "'}");
    }
}
