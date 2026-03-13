package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
/* loaded from: classes3.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    @NonNull
    public abstract byte[] getChallenge();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();

    public abstract TokenBinding getTokenBinding();

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}
