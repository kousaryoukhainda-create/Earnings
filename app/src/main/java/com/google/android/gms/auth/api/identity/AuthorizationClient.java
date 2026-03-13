package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
/* loaded from: classes3.dex */
public interface AuthorizationClient extends HasApiKey<zba> {
    @NonNull
    Task<AuthorizationResult> authorize(@NonNull AuthorizationRequest authorizationRequest);

    @NonNull
    AuthorizationResult getAuthorizationResultFromIntent(Intent intent) throws ApiException;
}
