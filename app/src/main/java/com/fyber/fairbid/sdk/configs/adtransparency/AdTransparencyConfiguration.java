package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.fj;
import com.fyber.fairbid.n5;
import com.fyber.fairbid.sdk.configs.adtransparency.MetadataConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class AdTransparencyConfiguration extends n5 {
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public static final AdTransparencyConfiguration e = new AdTransparencyConfiguration(null);
    @NotNull
    public final MetadataConfig c;
    @NotNull
    public final fj d;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public /* synthetic */ AdTransparencyConfiguration(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    @NotNull
    public final MetadataConfig getMetadata() {
        return this.c;
    }

    @NotNull
    public final fj getScreenshots() {
        return this.d;
    }

    public AdTransparencyConfiguration(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("metadata", jSONObject.optJSONObject("metadata"));
            put$fairbid_sdk_release("screenshots", jSONObject.optJSONObject("screenshots"));
        }
        MetadataConfig.Companion.getClass();
        this.c = MetadataConfig.a.a((JSONObject) get$fairbid_sdk_release("metadata"));
        this.d = fj.a.a((JSONObject) get$fairbid_sdk_release("screenshots"));
    }
}
