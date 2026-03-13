package defpackage;

import java.util.Objects;
/* renamed from: KQ  reason: default package */
/* loaded from: classes.dex */
public final class KQ {
    public final Object a;
    public final Object b;

    public KQ(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KQ)) {
            return false;
        }
        KQ kq = (KQ) obj;
        if (!Objects.equals(kq.a, this.a) || !Objects.equals(kq.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
