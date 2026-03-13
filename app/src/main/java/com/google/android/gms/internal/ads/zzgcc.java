package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes3.dex */
public abstract class zzgcc extends zzgca implements InterfaceFutureC2490qH {
    @Override // defpackage.InterfaceFutureC2490qH
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract InterfaceFutureC2490qH zzc();
}
