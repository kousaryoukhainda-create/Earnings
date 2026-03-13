package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
/* renamed from: ZG  reason: default package */
/* loaded from: classes.dex */
public final class ZG implements Map.Entry {
    public ZG b;
    public ZG c;
    public ZG d;
    public ZG f;
    public ZG g;
    public final Object h;
    public Object i;
    public int j;

    public ZG() {
        this.h = null;
        this.g = this;
        this.f = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.h;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.i;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.h;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.i;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        return obj2;
    }

    public final String toString() {
        return this.h + ContainerUtils.KEY_VALUE_DELIMITER + this.i;
    }

    public ZG(ZG zg, Object obj, ZG zg2, ZG zg3) {
        this.b = zg;
        this.h = obj;
        this.j = 1;
        this.f = zg2;
        this.g = zg3;
        zg3.f = this;
        zg2.g = this;
    }
}
