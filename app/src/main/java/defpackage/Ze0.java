package defpackage;

import java.io.IOException;
/* renamed from: Ze0  reason: default package */
/* loaded from: classes2.dex */
public final class Ze0 extends AbstractC1431gG implements InterfaceC0652Tz {
    public final /* synthetic */ QU h;
    public final /* synthetic */ C2847uV i;
    public final /* synthetic */ C2847uV j;
    public final /* synthetic */ C2847uV k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze0(QU qu, C2847uV c2847uV, C2847uV c2847uV2, C2847uV c2847uV3) {
        super(2);
        this.h = qu;
        this.i = c2847uV;
        this.j = c2847uV2;
        this.k = c2847uV3;
    }

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j = 1;
            if (longValue >= 1) {
                QU qu = this.h;
                byte c = qu.c();
                boolean z3 = true;
                if ((c & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if ((c & 2) == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((c & 4) != 4) {
                    z3 = false;
                }
                if (z) {
                    j = 5;
                }
                if (z2) {
                    j += 4;
                }
                if (z3) {
                    j += 4;
                }
                if (longValue >= j) {
                    if (z) {
                        this.i.b = Long.valueOf(qu.j() * 1000);
                    }
                    if (z2) {
                        this.j.b = Long.valueOf(qu.j() * 1000);
                    }
                    if (z3) {
                        this.k.b = Long.valueOf(qu.j() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return B90.a;
    }
}
