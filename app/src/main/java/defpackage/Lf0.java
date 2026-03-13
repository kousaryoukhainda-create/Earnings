package defpackage;

import com.applovin.impl.sdk.network.b;
/* renamed from: Lf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Lf0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ b c;

    public /* synthetic */ Lf0(b bVar, int i) {
        this.b = i;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                b.e(this.c);
                return;
            default:
                b.d(this.c);
                return;
        }
    }
}
