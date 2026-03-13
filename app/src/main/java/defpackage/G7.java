package defpackage;

import java.util.ArrayList;
/* renamed from: G7  reason: default package */
/* loaded from: classes.dex */
public final class G7 extends AbstractC2509qa {
    public final ArrayList a;

    public G7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2509qa) {
            return this.a.equals(((G7) ((AbstractC2509qa) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
