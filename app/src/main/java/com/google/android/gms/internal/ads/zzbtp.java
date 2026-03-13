package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public final class zzbtp extends zzayb implements zzbtq {
    public static zzbtq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof zzbtq) {
            return (zzbtq) queryLocalInterface;
        }
        return new zzbto(iBinder);
    }
}
