package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes3.dex */
public class zzgc extends Handler {
    private final Looper zza;

    public zzgc() {
        this.zza = Looper.getMainLooper();
    }

    public zzgc(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzgc(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
