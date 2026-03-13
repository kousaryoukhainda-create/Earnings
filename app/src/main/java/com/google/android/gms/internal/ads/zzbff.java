package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public final class zzbff extends zzaya implements IInterface {
    public zzbff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuo zzbuoVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbuoVar);
        zzda(1, zza);
    }
}
