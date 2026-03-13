package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class yi extends vg implements Serializable {
    final vg a;

    public yi(vg vgVar) {
        this.a = (vg) Preconditions.checkNotNull(vgVar);
    }

    @Override // com.applovin.impl.vg
    public vg c() {
        return this.a;
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yi) {
            return this.a.equals(((yi) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return -this.a.hashCode();
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}
