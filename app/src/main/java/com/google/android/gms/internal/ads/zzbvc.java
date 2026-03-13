package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public interface zzbvc extends IInterface {
    void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException;

    @Deprecated
    void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvkVar) throws RemoteException;
}
