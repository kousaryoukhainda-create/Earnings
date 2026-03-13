package defpackage;
/* renamed from: M8  reason: default package */
/* loaded from: classes.dex */
public final class M8 extends WN {
    public final VN a;
    public final UN b;

    public M8(VN vn, UN un) {
        this.a = vn;
        this.b = un;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WN)) {
            return false;
        }
        WN wn = (WN) obj;
        VN vn = this.a;
        if (vn != null ? vn.equals(((M8) wn).a) : ((M8) wn).a == null) {
            UN un = this.b;
            if (un == null) {
                if (((M8) wn).b == null) {
                    return true;
                }
            } else if (un.equals(((M8) wn).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        VN vn = this.a;
        if (vn == null) {
            hashCode = 0;
        } else {
            hashCode = vn.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        UN un = this.b;
        if (un != null) {
            i = un.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
