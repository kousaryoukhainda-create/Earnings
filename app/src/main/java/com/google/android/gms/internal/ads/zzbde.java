package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public final class zzbde extends zzaya implements zzbdg {
    public zzbde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zze(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbddVar);
        zzda(1, zza);
    }
}
