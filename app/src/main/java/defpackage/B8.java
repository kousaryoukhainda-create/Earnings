package defpackage;
/* renamed from: B8  reason: default package */
/* loaded from: classes.dex */
public final class B8 extends AbstractC0231Dt {
    public final Integer a;

    public B8(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0231Dt)) {
            return false;
        }
        Integer num = this.a;
        B8 b8 = (B8) ((AbstractC0231Dt) obj);
        if (num == null) {
            if (b8.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(b8.a);
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
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
