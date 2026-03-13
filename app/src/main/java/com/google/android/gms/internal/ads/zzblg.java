package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public final class zzblg extends zzaya implements IInterface {
    public zzblg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbla zzblaVar, zzblf zzblfVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzblaVar);
        zzayc.zzf(zza, zzblfVar);
        zzdb(2, zza);
    }
}
