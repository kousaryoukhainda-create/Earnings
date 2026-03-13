package defpackage;

import com.applovin.impl.sdk.j;
/* renamed from: Ai0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Ai0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ j c;
    public final /* synthetic */ String d;

    public /* synthetic */ Ai0(j jVar, String str, int i) {
        this.b = i;
        this.c = jVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                j.m(this.c, this.d);
                return;
            case 1:
                j.n(this.c, this.d);
                return;
            default:
                j.b(this.c, this.d);
                return;
        }
    }
}
