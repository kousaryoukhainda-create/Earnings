package defpackage;

import com.applovin.impl.ob;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sr;
/* renamed from: Bi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Bi0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ j c;

    public /* synthetic */ Bi0(int i, j jVar) {
        this.b = i;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.A0();
                return;
            case 1:
                this.c.G0();
                return;
            case 2:
                this.c.E0();
                return;
            case 3:
                this.c.F0();
                return;
            case 4:
                this.c.B0();
                return;
            case 5:
                this.c.N0();
                return;
            case 6:
                this.c.C0();
                return;
            case 7:
                this.c.D0();
                return;
            case 8:
                ob.c(this.c);
                return;
            case 9:
                sr.g(this.c);
                return;
            default:
                sr.h(this.c);
                return;
        }
    }
}
