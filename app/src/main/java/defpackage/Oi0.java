package defpackage;

import com.applovin.impl.jb;
/* renamed from: Oi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Oi0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ jb c;

    public /* synthetic */ Oi0(jb jbVar, int i) {
        this.b = i;
        this.c = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.d();
                return;
            default:
                this.c.c();
                return;
        }
    }
}
