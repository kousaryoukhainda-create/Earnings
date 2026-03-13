package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: pS  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2415pS {
    public final ArrayList a;
    public final Integer b;

    public C2415pS(ArrayList events, Integer num) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.a = events;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2415pS)) {
            return false;
        }
        C2415pS c2415pS = (C2415pS) obj;
        if (this.a.equals(c2415pS.a) && Intrinsics.a(this.b, c2415pS.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PlaytimeInAppPurchaseReward(events=");
        b.append(this.a);
        b.append(", totalCoins=");
        b.append(this.b);
        b.append(')');
        return b.toString();
    }
}
