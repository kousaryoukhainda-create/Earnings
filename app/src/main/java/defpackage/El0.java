package defpackage;

import com.applovin.impl.z6;
/* renamed from: El0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class El0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ z6.a c;
    public final /* synthetic */ z6 d;

    public /* synthetic */ El0(z6.a aVar, z6 z6Var, int i) {
        this.b = i;
        this.c = aVar;
        this.d = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                z6.a.c(this.c, this.d);
                return;
            case 1:
                z6.a.e(this.c, this.d);
                return;
            case 2:
                z6.a.d(this.c, this.d);
                return;
            default:
                z6.a.b(this.c, this.d);
                return;
        }
    }
}
