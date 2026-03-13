package com.fyber.fairbid.http.responses;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class HttpResponse<V> {
    public final int a;
    @NotNull
    public final Map<String, List<String>> b;
    @NotNull
    public final String c;
    public final V d;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Builder<V> {
        public int a;
        @NotNull
        public Map<String, ? extends List<String>> b = C3054wr.b;
        @NotNull
        public String c = "";
        public V d;

        @NotNull
        public final HttpResponse<V> build() {
            return new HttpResponse<>(this, null);
        }

        public final V getContent$fairbid_sdk_release() {
            return this.d;
        }

        @NotNull
        public final String getErrorString$fairbid_sdk_release() {
            return this.c;
        }

        @NotNull
        public final Map<String, List<String>> getHeaders$fairbid_sdk_release() {
            return this.b;
        }

        public final int getResponseCode$fairbid_sdk_release() {
            return this.a;
        }

        @NotNull
        public final Builder<V> setContent(V v) {
            this.d = v;
            return this;
        }

        @NotNull
        public final Builder<V> setErrorString(@NotNull String errorString) {
            Intrinsics.checkNotNullParameter(errorString, "errorString");
            this.c = errorString;
            return this;
        }

        @NotNull
        public final Builder<V> setHeaders(@NotNull Map<String, ? extends List<String>> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.b = headers;
            return this;
        }

        @NotNull
        public final Builder<V> setResponseCode(int i) {
            this.a = i;
            return this;
        }
    }

    public /* synthetic */ HttpResponse(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final V getContent() {
        return this.d;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.c;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.b;
    }

    public final int getResponseCode() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "HttpResponse(responseCode=" + this.a + ", headers=" + this.b + ", errorMessage='" + this.c + "', content=" + this.d + ')';
    }

    public HttpResponse(Builder<V> builder) {
        this.a = builder.getResponseCode$fairbid_sdk_release();
        this.b = builder.getHeaders$fairbid_sdk_release();
        this.c = builder.getErrorString$fairbid_sdk_release();
        this.d = builder.getContent$fairbid_sdk_release();
    }
}
