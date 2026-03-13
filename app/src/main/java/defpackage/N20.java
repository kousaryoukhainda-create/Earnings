package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
/* renamed from: N20  reason: default package */
/* loaded from: classes.dex */
public final class N20 implements Map.Entry, Comparable {
    public final Comparable b;
    public Object c;
    public final /* synthetic */ J20 d;

    public N20(J20 j20, Comparable comparable, Object obj) {
        this.d = j20;
        this.b = comparable;
        this.c = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b.compareTo(((N20) obj).b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.b;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.c;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
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
        int hashCode;
        int i = 0;
        Comparable comparable = this.b;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.d.b();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        return this.b + ContainerUtils.KEY_VALUE_DELIMITER + this.c;
    }
}
