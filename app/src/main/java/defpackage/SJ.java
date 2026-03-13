package defpackage;

import com.applovin.impl.ge;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
/* renamed from: SJ  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class SJ implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ MaxAdViewImpl c;
    public final /* synthetic */ ge d;

    public /* synthetic */ SJ(MaxAdViewImpl maxAdViewImpl, ge geVar, int i) {
        this.b = i;
        this.c = maxAdViewImpl;
        this.d = geVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                MaxAdViewImpl.c(this.c, this.d);
                return;
            default:
                MaxAdViewImpl.b(this.c, this.d);
                return;
        }
    }
}
