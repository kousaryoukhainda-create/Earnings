package defpackage;

import com.applovin.impl.sm;
/* renamed from: Tk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Tk0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ sm c;

    public /* synthetic */ Tk0(sm smVar, int i) {
        this.b = i;
        this.c = smVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                sm.e(this.c);
                return;
            default:
                sm.f(this.c);
                return;
        }
    }
}
