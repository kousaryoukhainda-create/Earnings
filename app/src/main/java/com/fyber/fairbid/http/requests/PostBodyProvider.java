package com.fyber.fairbid.http.requests;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface PostBodyProvider {
    @NotNull
    String getContent();

    @NotNull
    String getContentType();

    @NotNull
    String getPrettifiedContent();
}
