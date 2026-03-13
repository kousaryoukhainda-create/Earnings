package defpackage;

import com.applovin.impl.t9;
/* renamed from: Yk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Yk0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ t9 c;

    public /* synthetic */ Yk0(t9 t9Var, int i) {
        this.b = i;
        this.c = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.L();
                return;
            case 1:
                this.c.G();
                return;
            case 2:
                this.c.F();
                return;
            case 3:
                this.c.H();
                return;
            case 4:
                this.c.N();
                return;
            case 5:
                this.c.I();
                return;
            default:
                this.c.J();
                return;
        }
    }
}
