package com.appsflyer.internal;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AFa1eSDK c;

    public /* synthetic */ a(AFa1eSDK aFa1eSDK, int i) {
        this.b = i;
        this.c = aFa1eSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AFa1eSDK.c(this.c);
                return;
            default:
                AFa1eSDK.e(this.c);
                return;
        }
    }
}
