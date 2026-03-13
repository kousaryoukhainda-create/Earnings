package com.fyber.fairbid.ads.mediation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface MediationStartedListener {
    void onNetworkFailedToStart(@NotNull MediatedNetwork mediatedNetwork, @NotNull String str);

    void onNetworkStarted(@NotNull MediatedNetwork mediatedNetwork);
}
