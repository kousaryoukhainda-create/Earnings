package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzbtg extends zzayb implements zzbth {
    public static zzbth zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbth) {
            return (zzbth) queryLocalInterface;
        }
        return new zzbtf(iBinder);
    }
}
