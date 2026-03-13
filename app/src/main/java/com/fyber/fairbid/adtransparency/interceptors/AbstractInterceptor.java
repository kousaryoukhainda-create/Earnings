package com.fyber.fairbid.adtransparency.interceptors;

import com.fyber.fairbid.adtransparency.common.MissingMetadataException;
import com.fyber.fairbid.adtransparency.interceptors.MetadataStore;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.ri;
import com.fyber.fairbid.sj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public abstract class AbstractInterceptor implements MetadataStore {
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public static final String INJECTION_STATUS_CLASS_NAME = "com.fyber.fairbid.InjectionStatus";

    /* loaded from: classes.dex */
    public static final class a {
    }

    @Override // com.fyber.fairbid.adtransparency.interceptors.MetadataProvider
    public final void getMetadataForInstance(@NotNull Constants.AdType adType, @NotNull String instanceId, @NotNull MetadataStore.MetadataCallback callback) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!sj.a.getMetadata().forNetworkAndFormat(getNetwork(), adType)) {
            return;
        }
        if (com.fyber.a.e() == null) {
            callback.onError(MissingMetadataException.Companion.getMissingPluginException());
        } else if (!getWasInjected()) {
            callback.onError(MissingMetadataException.Companion.getFailedToInjectException());
        } else {
            getMetadataForInstanceInternal(adType, instanceId, callback);
        }
    }

    public abstract void getMetadataForInstanceInternal(@NotNull Constants.AdType adType, @NotNull String str, @NotNull MetadataStore.MetadataCallback metadataCallback);

    @NotNull
    public abstract String getNetwork();

    public boolean getWasInjected() {
        Boolean bool = (Boolean) ri.a("com.fyber.fairbid.InjectionStatus", getNetwork());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
