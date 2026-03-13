package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzas implements zzav {
    final /* synthetic */ DataLayer zza;

    public zzas(DataLayer dataLayer) {
        this.zza = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzav
    public final void zza(List list) {
        CountDownLatch countDownLatch;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzat zzatVar = (zzat) it.next();
            DataLayer dataLayer = this.zza;
            dataLayer.zzi(dataLayer.zza(zzatVar.zza, zzatVar.zzb));
        }
        countDownLatch = this.zza.zzh;
        countDownLatch.countDown();
    }
}
