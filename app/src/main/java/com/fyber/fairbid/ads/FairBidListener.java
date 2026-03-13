package com.fyber.fairbid.ads;

import com.fyber.fairbid.ads.mediation.MediationStartedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface FairBidListener extends MediationStartedListener {
    void mediationFailedToStart(@NotNull String str, int i);

    void mediationStarted();
}
