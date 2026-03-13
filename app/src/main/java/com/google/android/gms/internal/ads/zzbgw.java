package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzbgw extends zzayb implements zzbgx {
    public static zzbgx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof zzbgx) {
            return (zzbgx) queryLocalInterface;
        }
        return new zzbgv(iBinder);
    }
}
