package defpackage;

import com.applovin.impl.adview.g;
import com.applovin.impl.o9;
/* renamed from: Sj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Sj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ Sj0(g gVar, Runnable runnable, int i) {
        this.b = i;
        this.c = gVar;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                o9.g(this.c, this.d);
                return;
            case 1:
                o9.f(this.c, this.d);
                return;
            default:
                o9.h(this.c, this.d);
                return;
        }
    }
}
