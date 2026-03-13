package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzaye extends zzayb implements zzayf {
    public static zzayf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof zzayf) {
            return (zzayf) queryLocalInterface;
        }
        return new zzayd(iBinder);
    }
}
