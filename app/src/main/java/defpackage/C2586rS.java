package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: rS  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2586rS {
    public final Integer a;
    public final Date b;
    public final Date c;

    public C2586rS(Integer num, Date date, Date date2) {
        this.a = num;
        this.b = date;
        this.c = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2586rS)) {
            return false;
        }
        C2586rS c2586rS = (C2586rS) obj;
        if (Intrinsics.a(this.a, c2586rS.a) && Intrinsics.a(this.b, c2586rS.b) && Intrinsics.a(this.c, c2586rS.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Date date = this.b;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date2 = this.c;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PlaytimeInAppPurchaseRewardEvent(coins=");
        b.append(this.a);
        b.append(", processAt=");
        b.append(this.b);
        b.append(", receivedAt=");
        b.append(this.c);
        b.append(')');
        return b.toString();
    }
}
