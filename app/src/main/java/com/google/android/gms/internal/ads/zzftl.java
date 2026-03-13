package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzftl implements ServiceConnection {
    final /* synthetic */ zzftn zza;

    public /* synthetic */ zzftl(zzftn zzftnVar, zzftm zzftmVar) {
        this.zza = zzftnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzftn.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzftn.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
            @Override // java.lang.Runnable
            public final void run() {
                IInterface zzb;
                zzfrn zzb2 = zzfrm.zzb(iBinder);
                zzftl zzftlVar = zzftl.this;
                zzftn.zzg(zzftlVar.zza, zzb2);
                zzftn.zzd(zzftlVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    zzb = zzftn.zzb(zzftlVar.zza);
                } catch (RemoteException e) {
                    zzftn.zzd(zzftlVar.zza).zzb(e, "linkToDeath failed", new Object[0]);
                }
                if (zzb != null) {
                    zzb.asBinder().linkToDeath(zzftn.zza(zzftlVar.zza), 0);
                    zzftn.zzf(zzftlVar.zza, false);
                    synchronized (zzftn.zze(zzftlVar.zza)) {
                        try {
                            for (Runnable runnable : zzftn.zze(zzftlVar.zza)) {
                                runnable.run();
                            }
                            zzftn.zze(zzftlVar.zza).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                throw null;
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzftn.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzftn.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
            @Override // java.lang.Runnable
            public final void run() {
                zzftl zzftlVar = zzftl.this;
                zzftn.zzd(zzftlVar.zza).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzftn.zzb(zzftlVar.zza);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzftn.zza(zzftlVar.zza), 0);
                zzftn.zzg(zzftlVar.zza, null);
                zzftn.zzf(zzftlVar.zza, false);
            }
        });
    }
}
