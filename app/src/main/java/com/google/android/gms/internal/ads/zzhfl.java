package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class zzhfl extends AbstractServiceConnectionC0559Qk {
    private final WeakReference zza;

    public zzhfl(zzbdm zzbdmVar) {
        this.zza = new WeakReference(zzbdmVar);
    }

    @Override // defpackage.AbstractServiceConnectionC0559Qk
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC0378Jk abstractC0378Jk) {
        zzbdm zzbdmVar = (zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzc(abstractC0378Jk);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdm zzbdmVar = (zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzd();
        }
    }
}
