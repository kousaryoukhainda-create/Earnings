package defpackage;

import com.applovin.impl.j2;
/* renamed from: Hi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Hi0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ j2 c;

    public /* synthetic */ Hi0(j2 j2Var, int i) {
        this.b = i;
        this.c = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                j2.k(this.c);
                return;
            default:
                j2.i(this.c);
                return;
        }
    }
}
