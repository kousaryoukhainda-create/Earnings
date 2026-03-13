package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final /* synthetic */ class q3 {
    public static void a(SettableFuture settableFuture, String str, ScheduledExecutorService scheduledExecutorService, String str2, SettableFuture.Listener listener, String str3, SettableFuture.Listener listener2, ScheduledExecutorService scheduledExecutorService2) {
        Intrinsics.checkNotNullParameter(settableFuture, str);
        Intrinsics.checkNotNullParameter(scheduledExecutorService, str2);
        Intrinsics.checkNotNullParameter(listener, str3);
        settableFuture.addListener(listener2, scheduledExecutorService2);
    }
}
