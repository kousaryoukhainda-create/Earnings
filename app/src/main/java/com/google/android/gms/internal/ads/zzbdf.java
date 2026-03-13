package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzbdf extends zzayb implements zzbdg {
    public static zzbdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (queryLocalInterface instanceof zzbdg) {
            return (zzbdg) queryLocalInterface;
        }
        return new zzbde(iBinder);
    }
}
