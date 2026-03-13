package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface y9 {
    bf forName(@NotNull String str);

    cd getMediationAnalysis();

    @NotNull
    SettableFuture<Void> getReady();

    void publishCurrentState();
}
