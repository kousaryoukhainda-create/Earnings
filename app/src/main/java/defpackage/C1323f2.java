package defpackage;

import com.google.android.gms.analytics.ecommerce.ProductAction;
/* renamed from: f2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323f2 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1323f2.class != obj.getClass()) {
            return false;
        }
        C1323f2 c1323f2 = (C1323f2) obj;
        int i = this.a;
        if (i != c1323f2.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == c1323f2.b && this.b == c1323f2.d) {
            return true;
        }
        if (this.d != c1323f2.d || this.b != c1323f2.b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(c1323f2.c)) {
                return false;
            }
        } else if (c1323f2.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = ProductAction.ACTION_ADD;
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
