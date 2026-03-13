package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public final class zzbgv extends zzaya implements zzbgx {
    public zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbgn zzbgnVar) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgnVar);
        zzda(1, zza);
    }
}
