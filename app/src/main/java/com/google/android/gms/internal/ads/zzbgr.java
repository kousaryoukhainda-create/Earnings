package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes3.dex */
public final class zzbgr {
    private final zzbgq zza;

    public zzbgr(zzbgq zzbgqVar) {
        Context context;
        this.zza = zzbgqVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbgqVar.zzh());
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
            }
        }
    }

    public final zzbgq zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }
}
