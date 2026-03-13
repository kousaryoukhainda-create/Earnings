package com.google.android.gms.internal.ads;

import android.os.Handler;
/* loaded from: classes3.dex */
final class zzfmr implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfmu.zzc;
        if (handler != null) {
            handler2 = zzfmu.zzc;
            runnable = zzfmu.zzd;
            handler2.post(runnable);
            handler3 = zzfmu.zzc;
            runnable2 = zzfmu.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
