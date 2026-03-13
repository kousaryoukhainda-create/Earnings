package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.fa;
import com.fyber.fairbid.internal.Logger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
/* renamed from: com.fyber.fairbid.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1125u0 implements Callable<fa.a> {
    public final Context a;

    public CallableC1125u0(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final fa.a call() throws Exception {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
            Logger.debug("Using Google Play Services...");
            return new fa.a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception e) {
            Logger.warn("It was not possible to access Android's advertising data (AAID & 'limited tracking' info)");
            e.printStackTrace();
            return null;
        }
    }
}
