package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* renamed from: q30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2470q30 extends AbstractC1391fn {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2470q30(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // defpackage.AbstractC1391fn
    public final Date a(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
