package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes3.dex */
public abstract class zzbhm extends zzayb implements zzbhn {
    public static zzbhn zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof zzbhn) {
            return (zzbhn) queryLocalInterface;
        }
        return new zzbhl(iBinder);
    }
}
