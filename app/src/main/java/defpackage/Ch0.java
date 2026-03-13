package defpackage;

import com.applovin.impl.fc;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
/* renamed from: Ch0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Ch0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MaxAdListener d;
    public final /* synthetic */ MaxAd f;

    public /* synthetic */ Ch0(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.b = i;
        this.c = z;
        this.d = maxAdListener;
        this.f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.b(this.c, this.d, this.f);
                return;
            case 1:
                fc.e(this.c, this.d, this.f);
                return;
            case 2:
                fc.d(this.c, this.d, this.f);
                return;
            case 3:
                fc.f(this.c, this.d, this.f);
                return;
            case 4:
                fc.a(this.c, this.d, this.f);
                return;
            default:
                fc.c(this.c, this.d, this.f);
                return;
        }
    }
}
