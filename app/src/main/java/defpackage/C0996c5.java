package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: c5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996c5 implements Iterator, Map.Entry {
    public int b;
    public int c = -1;
    public boolean d;
    public final /* synthetic */ C1243e5 f;

    public C0996c5(C1243e5 c1243e5) {
        this.f = c1243e5;
        this.b = c1243e5.d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.d) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.c;
            C1243e5 c1243e5 = this.f;
            Object h = c1243e5.h(i);
            if (key != h && (key == null || !key.equals(h))) {
                return false;
            }
            Object value = entry.getValue();
            Object k = c1243e5.k(this.c);
            if (value != k && (value == null || !value.equals(k))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.d) {
            return this.f.h(this.c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.d) {
            return this.f.k(this.c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.d) {
            int i = this.c;
            C1243e5 c1243e5 = this.f;
            Object h = c1243e5.h(i);
            Object k = c1243e5.k(this.c);
            int i2 = 0;
            if (h == null) {
                hashCode = 0;
            } else {
                hashCode = h.hashCode();
            }
            if (k != null) {
                i2 = k.hashCode();
            }
            return hashCode ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c++;
            this.d = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d) {
            this.f.i(this.c);
            this.c--;
            this.b--;
            this.d = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.d) {
            int i = (this.c << 1) + 1;
            Object[] objArr = this.f.c;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}
