package defpackage;

import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinSdk;
/* renamed from: Ci0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Ci0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ j c;
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener d;

    public /* synthetic */ Ci0(j jVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i) {
        this.b = i;
        this.c = jVar;
        this.d = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.c(this.d);
                return;
            case 1:
                this.c.d(this.d);
                return;
            default:
                this.c.b(this.d);
                return;
        }
    }
}
