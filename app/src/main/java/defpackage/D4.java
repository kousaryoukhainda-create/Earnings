package defpackage;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.tl;
import org.json.JSONArray;
/* renamed from: D4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class D4 implements InterfaceC1006cA {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppLovinNativeAdImpl c;

    public /* synthetic */ D4(AppLovinNativeAdImpl appLovinNativeAdImpl, int i) {
        this.b = i;
        this.c = appLovinNativeAdImpl;
    }

    @Override // defpackage.InterfaceC1006cA
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return AppLovinNativeAdImpl.a(this.c, (tl) obj);
            default:
                return AppLovinNativeAdImpl.c(this.c, (JSONArray) obj);
        }
    }
}
