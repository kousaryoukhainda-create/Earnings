package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
/* renamed from: com.google.android.gms.internal.auth-api.zbj  reason: invalid package */
/* loaded from: classes3.dex */
public final class zbj extends zba implements IInterface {
    public zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbd(zba, zbiVar);
        zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}
