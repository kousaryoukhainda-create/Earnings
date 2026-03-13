package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public final class zzbvx extends zzaya implements IInterface {
    public zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvw zzbvwVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbvwVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
