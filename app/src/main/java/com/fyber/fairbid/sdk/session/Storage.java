package com.fyber.fairbid.sdk.session;

import com.fyber.fairbid.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface Storage {
    void disablePersistence();

    void enablePersistence();

    void saveClicks(@NotNull Constants.AdType adType, int i);

    void saveCompletions(int i);

    void saveDuration(long j);

    void saveImpressions(@NotNull Constants.AdType adType, int i);

    void saveStart(long j);
}
