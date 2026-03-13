package defpackage;

import com.applovin.impl.fc;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
/* renamed from: Eh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Eh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MaxNativeAdListener d;
    public final /* synthetic */ MaxAd f;

    public /* synthetic */ Eh0(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i) {
        this.b = i;
        this.c = z;
        this.d = maxNativeAdListener;
        this.f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.b(this.c, this.d, this.f);
                return;
            default:
                fc.a(this.c, this.d, this.f);
                return;
        }
    }
}
