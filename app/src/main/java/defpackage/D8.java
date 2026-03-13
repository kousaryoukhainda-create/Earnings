package defpackage;

import java.util.ArrayList;
/* renamed from: D8  reason: default package */
/* loaded from: classes.dex */
public final class D8 {
    public final String a;
    public final ArrayList b;

    public D8(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d8 = (D8) obj;
        if (this.a.equals(d8.a) && this.b.equals(d8.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
