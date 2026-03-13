package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
/* loaded from: classes3.dex */
public final class zzcd extends zzaya implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzftVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzftVar);
        zzda(2, zza);
    }
}
