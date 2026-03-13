package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* loaded from: classes3.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        } else {
            zzc.zzb(parcel);
            zzb((ProxyResponse) zzc.zza(parcel, ProxyResponse.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
