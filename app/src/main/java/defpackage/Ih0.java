package defpackage;

import com.applovin.impl.fc;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
/* renamed from: Ih0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Ih0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppLovinAdDisplayListener c;
    public final /* synthetic */ AppLovinAd d;

    public /* synthetic */ Ih0(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i) {
        this.b = i;
        this.c = appLovinAdDisplayListener;
        this.d = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.d(this.c, this.d);
                return;
            default:
                fc.c(this.c, this.d);
                return;
        }
    }
}
