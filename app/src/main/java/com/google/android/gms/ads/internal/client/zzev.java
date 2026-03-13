package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblt;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
final class zzev extends zzblt {
    final /* synthetic */ zzex zza;

    public /* synthetic */ zzev(zzex zzexVar, zzew zzewVar) {
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (zzex.zzh(this.zza)) {
            zzex.zzm(this.zza, false);
            zzex.zzl(this.zza, true);
            arrayList = new ArrayList(zzex.zzj(this.zza));
            zzex.zzj(this.zza).clear();
        }
        InitializationStatus zzd = zzex.zzd(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}
