package com.appsflyer.internal;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AFc1sSDK c;

    public /* synthetic */ g(AFc1sSDK aFc1sSDK, int i) {
        this.b = i;
        this.c = aFc1sSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AFc1sSDK.d(this.c);
                return;
            case 1:
                AFc1sSDK.b(this.c);
                return;
            default:
                AFc1sSDK.a(this.c);
                return;
        }
    }
}
