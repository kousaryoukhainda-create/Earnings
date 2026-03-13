package defpackage;

import com.applovin.impl.lg;
/* renamed from: zj0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3301zj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ lg c;

    public /* synthetic */ RunnableC3301zj0(lg lgVar, int i) {
        this.b = i;
        this.c = lgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                lg.c(this.c);
                return;
            case 1:
                lg.e(this.c);
                return;
            default:
                lg.f(this.c);
                return;
        }
    }
}
