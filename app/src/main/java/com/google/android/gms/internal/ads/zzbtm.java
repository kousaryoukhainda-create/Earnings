package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public final class zzbtm extends zzayb implements zzbtn {
    public static zzbtn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zzbtn) {
            return (zzbtn) queryLocalInterface;
        }
        return new zzbtl(iBinder);
    }
}
