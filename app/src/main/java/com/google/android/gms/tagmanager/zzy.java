package com.google.android.gms.tagmanager;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzgc;
import com.google.android.gms.tagmanager.ContainerHolder;
/* loaded from: classes3.dex */
final class zzy extends zzgc {
    final /* synthetic */ zzz zza;
    private final ContainerHolder.ContainerAvailableListener zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, ContainerHolder.ContainerAvailableListener containerAvailableListener, Looper looper) {
        super(looper);
        this.zza = zzzVar;
        this.zzb = containerAvailableListener;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            Log.e("GoogleTagManager", "Don't know how to handle this message.");
            return;
        }
        this.zzb.onContainerAvailable(this.zza, (String) message.obj);
    }
}
