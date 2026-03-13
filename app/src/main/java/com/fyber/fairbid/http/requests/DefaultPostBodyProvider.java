package com.fyber.fairbid.http.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class DefaultPostBodyProvider implements PostBodyProvider {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=UTF-8";

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getContent() {
        return "";
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getContentType() {
        return DEFAULT_CONTENT_TYPE;
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getPrettifiedContent() {
        return "";
    }
}
