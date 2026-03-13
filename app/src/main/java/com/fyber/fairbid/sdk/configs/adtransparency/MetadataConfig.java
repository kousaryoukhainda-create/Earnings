package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.c6;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.n5;
import com.fyber.fairbid.sdk.configs.adtransparency.a;
import com.fyber.fairbid.sdk.configs.adtransparency.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class MetadataConfig extends n5 {
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public final com.fyber.fairbid.sdk.configs.adtransparency.a c;
    @NotNull
    public final b d;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static MetadataConfig a(JSONObject jSONObject) {
            return new MetadataConfig(jSONObject, null);
        }
    }

    public /* synthetic */ MetadataConfig(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    public final boolean forNetworkAndFormat(@NotNull Network network, @NotNull Constants.AdType adType) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return forNetworkAndFormat(network.getCanonicalName(), adType);
    }

    @NotNull
    public final com.fyber.fairbid.sdk.configs.adtransparency.a getAdFormatsMetadata$fairbid_sdk_release() {
        return this.c;
    }

    @NotNull
    public final b getNetworksAdFormats$fairbid_sdk_release() {
        return this.d;
    }

    public MetadataConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            put$fairbid_sdk_release("ad_formats", jSONObject.optJSONObject("ad_formats"));
            put$fairbid_sdk_release("networks", jSONObject.optJSONObject("networks"));
        }
        com.fyber.fairbid.sdk.configs.adtransparency.a a2 = a.C0054a.a((JSONObject) get$fairbid_sdk_release("ad_formats"));
        this.c = a2;
        this.d = b.a.a((JSONObject) get$fairbid_sdk_release("networks"), new c6(a2));
    }

    public final boolean forNetworkAndFormat(@NotNull String networkName, @NotNull Constants.AdType adType) {
        c cVar;
        Intrinsics.checkNotNullParameter(networkName, "networkCanonicalName");
        Intrinsics.checkNotNullParameter(adType, "adType");
        try {
            b bVar = this.d;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            com.fyber.fairbid.sdk.configs.adtransparency.a aVar = (com.fyber.fairbid.sdk.configs.adtransparency.a) bVar.get$fairbid_sdk_release(networkName, new com.fyber.fairbid.sdk.configs.adtransparency.a(null));
            aVar.getClass();
            Intrinsics.checkNotNullParameter(adType, "adType");
            int i = a.b.a[adType.ordinal()];
            if (i == 1) {
                cVar = aVar.c;
            } else if (i == 2) {
                cVar = aVar.d;
            } else if (i != 3) {
                cVar = new c(null);
            } else {
                cVar = aVar.e;
            }
            return cVar.c;
        } catch (JSONException unused) {
            return false;
        }
    }
}
