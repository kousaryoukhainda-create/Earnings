package com.fyber.fairbid.adtransparency.interceptors;

import com.fyber.fairbid.adtransparency.common.MissingMetadataException;
import com.fyber.fairbid.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface MetadataStore extends MetadataProvider {

    @Metadata
    /* loaded from: classes.dex */
    public interface MetadataCallback {
        void onError(@NotNull MissingMetadataException missingMetadataException);

        void onSuccess(@NotNull MetadataReport metadataReport);
    }

    void storeMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String str, String str2);
}
