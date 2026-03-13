package com.appsflyer.internal;

import android.hardware.SensorEvent;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((AFa1eSDK) this.c).AFInAppEventType((AFf1qSDK) this.d);
                return;
            default:
                AFf1kSDK.a((AFf1kSDK) this.c, (SensorEvent) this.d);
                return;
        }
    }
}
