package com.fyber.fairbid.http.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class JsonPostBodyProvider implements PostBodyProvider {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public final JSONObject a;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JsonPostBodyProvider(@NotNull JSONObject rootJson) {
        Intrinsics.checkNotNullParameter(rootJson, "rootJson");
        this.a = rootJson;
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getContent() {
        String jSONObject = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "rootJson.toString()");
        return jSONObject;
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getContentType() {
        return DefaultPostBodyProvider.DEFAULT_CONTENT_TYPE;
    }

    @Override // com.fyber.fairbid.http.requests.PostBodyProvider
    @NotNull
    public String getPrettifiedContent() {
        try {
            String jSONObject = this.a.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "{\n            rootJson.t…ng(INDENTATION)\n        }");
            return jSONObject;
        } catch (JSONException unused) {
            return getContent();
        }
    }
}
