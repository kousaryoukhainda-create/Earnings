package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public interface zzgct extends ScheduledExecutorService, zzgcs {
    zzgcr zzc(Callable callable, long j, TimeUnit timeUnit);
}
