package defpackage;

import com.applovin.impl.pg;
/* renamed from: Yj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Yj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ pg c;

    public /* synthetic */ Yj0(pg pgVar, int i) {
        this.b = i;
        this.c = pgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                pg.a(this.c);
                return;
            default:
                pg.b(this.c);
                return;
        }
    }
}
