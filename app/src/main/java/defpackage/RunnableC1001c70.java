package defpackage;

import androidx.appcompat.widget.Toolbar;
/* renamed from: c70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1001c70 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Toolbar c;

    public /* synthetic */ RunnableC1001c70(Toolbar toolbar, int i) {
        this.b = i;
        this.c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QL ql;
        switch (this.b) {
            case 0:
                C1248e70 c1248e70 = this.c.M;
                if (c1248e70 == null) {
                    ql = null;
                } else {
                    ql = c1248e70.c;
                }
                if (ql != null) {
                    ql.collapseActionView();
                    return;
                }
                return;
            default:
                this.c.l();
                return;
        }
    }
}
