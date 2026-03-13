package defpackage;

import com.applovin.impl.fc;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;
/* renamed from: Fh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Fh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppLovinAdRewardListener c;
    public final /* synthetic */ AppLovinAd d;
    public final /* synthetic */ Map f;

    public /* synthetic */ Fh0(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i) {
        this.b = i;
        this.c = appLovinAdRewardListener;
        this.d = appLovinAd;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.e(this.c, this.d, this.f);
                return;
            case 1:
                fc.f(this.c, this.d, this.f);
                return;
            default:
                fc.d(this.c, this.d, this.f);
                return;
        }
    }
}
