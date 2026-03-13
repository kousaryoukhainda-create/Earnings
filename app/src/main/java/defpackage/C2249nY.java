package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
/* renamed from: nY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2249nY implements Map.Entry {
    public final Object b;
    public final Object c;
    public C2249nY d;
    public C2249nY f;

    public C2249nY(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2249nY)) {
            return false;
        }
        C2249nY c2249nY = (C2249nY) obj;
        if (this.b.equals(c2249nY.b) && this.c.equals(c2249nY.c)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.b + ContainerUtils.KEY_VALUE_DELIMITER + this.c;
    }
}
