package defpackage;

import com.applovin.impl.fc;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
/* renamed from: Hh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Hh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppLovinBidTokenCollectionListener c;
    public final /* synthetic */ String d;

    public /* synthetic */ Hh0(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i) {
        this.b = i;
        this.c = appLovinBidTokenCollectionListener;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.N(this.c, this.d);
                return;
            default:
                fc.J(this.c, this.d);
                return;
        }
    }
}
