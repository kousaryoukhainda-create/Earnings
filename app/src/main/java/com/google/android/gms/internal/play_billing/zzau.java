package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzau extends zzar implements zzav {
    public static zzav zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        if (queryLocalInterface instanceof zzav) {
            return (zzav) queryLocalInterface;
        }
        return new zzat(iBinder);
    }
}
