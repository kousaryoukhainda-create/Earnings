package com.appsflyer.internal;

import android.app.Activity;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AFb1jSDK c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ d(AFb1jSDK aFb1jSDK, Activity activity, int i) {
        this.b = i;
        this.c = aFb1jSDK;
        this.d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AFb1jSDK.c(this.c, this.d);
                return;
            case 1:
                AFb1jSDK.a(this.c, this.d);
                return;
            default:
                AFb1jSDK.b(this.c, this.d);
                return;
        }
    }
}
