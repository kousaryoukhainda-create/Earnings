package com.fyber.fairbid.adtransparency.interceptors;

import com.fyber.fairbid.adtransparency.interceptors.MetadataStore;
import com.fyber.fairbid.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface MetadataProvider {
    void getMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String str, @NotNull MetadataStore.MetadataCallback metadataCallback);
}
