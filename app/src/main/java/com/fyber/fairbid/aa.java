package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.PauseSignal;
import com.fyber.fairbid.internal.Constants;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface aa extends PauseSignal.a {
    void a(int i);

    void a(@NotNull Constants.AdType adType, int i, boolean z);
}
