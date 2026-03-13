package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class zzavd {
    private final InterfaceFutureC2490qH zza;

    public zzavd(final Context context, Executor executor) {
        this.zza = zzgch.zzj(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzavc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return zzfnq.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final InterfaceFutureC2490qH zza() {
        return this.zza;
    }
}
