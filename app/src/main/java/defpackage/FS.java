package defpackage;

import java.io.Serializable;
import java.util.List;
/* renamed from: FS  reason: default package */
/* loaded from: classes.dex */
public final class FS implements ES, Serializable {
    public final List b;

    public FS(List list) {
        this.b = list;
    }

    @Override // defpackage.ES
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i < list.size()) {
                if (!((ES) list.get(i)).apply(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FS) {
            return this.b.equals(((FS) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.b) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
