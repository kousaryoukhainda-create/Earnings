package com.fyber.fairbid.ads;

import kotlin.Metadata;
@Metadata
/* loaded from: classes.dex */
public enum RequestFailure {
    UNKNOWN,
    INTERNAL,
    TIMEOUT,
    NO_FILL,
    BAD_CREDENTIALS,
    REMOTE_ERROR,
    CONFIGURATION_ERROR,
    SKIPPED,
    CAPPED,
    NETWORK_ERROR,
    UNAVAILABLE,
    ADAPTER_NOT_STARTED,
    CANCELED,
    NOT_YET_REQUESTED,
    UNSUPPORTED_AD_TYPE;

    RequestFailure() {
    }
}
