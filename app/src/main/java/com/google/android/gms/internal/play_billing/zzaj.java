package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes3.dex */
public abstract class zzaj extends zzar implements zzak {
    public zzaj() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzas.zzb(parcel);
            zza((Bundle) zzas.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
