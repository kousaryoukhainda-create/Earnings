package defpackage;
/* renamed from: w8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2994w8 {
    public final Object a;
    public final EnumC0849aT b;
    public final Q8 c;

    public C2994w8(Object obj, EnumC0849aT enumC0849aT, Q8 q8) {
        if (obj != null) {
            this.a = obj;
            this.b = enumC0849aT;
            this.c = q8;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2994w8)) {
            return false;
        }
        C2994w8 c2994w8 = (C2994w8) obj;
        c2994w8.getClass();
        if (this.a.equals(c2994w8.a) && this.b.equals(c2994w8.b)) {
            Q8 q8 = c2994w8.c;
            Q8 q82 = this.c;
            if (q82 == null) {
                if (q8 == null) {
                    return true;
                }
            } else if (q82.equals(q8)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        Q8 q8 = this.c;
        if (q8 == null) {
            hashCode = 0;
        } else {
            hashCode = q8.hashCode();
        }
        return (hashCode2 ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
