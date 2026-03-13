package defpackage;
/* renamed from: Q8  reason: default package */
/* loaded from: classes.dex */
public final class Q8 {
    public final Integer a;

    public Q8(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q8)) {
            return false;
        }
        Q8 q8 = (Q8) obj;
        Integer num = this.a;
        if (num == null) {
            if (q8.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(q8.a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
