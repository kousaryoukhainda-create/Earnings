package defpackage;

import com.applovin.impl.x4;
/* renamed from: vl0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2961vl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ x4 c;

    public /* synthetic */ RunnableC2961vl0(x4 x4Var, int i) {
        this.b = i;
        this.c = x4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                x4.d(this.c);
                return;
            case 1:
                x4.e(this.c);
                return;
            default:
                x4.f(this.c);
                return;
        }
    }
}
