package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* renamed from: pp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2451pp implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ C2552r2 c;

    public RunnableC2451pp(Context context, C2552r2 c2552r2) {
        this.b = context;
        this.c = c2552r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2552r2 c2552r2 = this.c;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.b);
            if (advertisingIdInfo.getId() != null) {
                c2552r2.a(advertisingIdInfo.getId());
            } else {
                c2552r2.a("errorReading");
            }
        } catch (Exception unused) {
            c2552r2.a("errorReading");
        }
    }
}
