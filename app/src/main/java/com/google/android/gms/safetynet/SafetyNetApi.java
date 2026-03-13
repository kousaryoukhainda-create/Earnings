package com.google.android.gms.safetynet;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
@KeepForSdkWithMembers
/* loaded from: classes3.dex */
public interface SafetyNetApi {

    /* loaded from: classes3.dex */
    public static class AttestationResponse extends Response<AttestationResult> {
        public String getJwsResult() {
            return getResult().getJwsResult();
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface AttestationResult extends Result {
        String getJwsResult();
    }

    /* loaded from: classes3.dex */
    public static class HarmfulAppsResponse extends Response<HarmfulAppsResult> {
        @NonNull
        public List<HarmfulAppsData> getHarmfulAppsList() {
            return getResult().getHarmfulAppsList();
        }

        public int getHoursSinceLastScanWithHarmfulApp() {
            return getResult().getHoursSinceLastScanWithHarmfulApp();
        }

        public long getLastScanTimeMs() {
            return getResult().getLastScanTimeMs();
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface HarmfulAppsResult extends Result {
        @NonNull
        List<HarmfulAppsData> getHarmfulAppsList();

        int getHoursSinceLastScanWithHarmfulApp();

        long getLastScanTimeMs();
    }

    /* loaded from: classes3.dex */
    public static class RecaptchaTokenResponse extends Response<RecaptchaTokenResult> {
        public String getTokenResult() {
            return getResult().getTokenResult();
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface RecaptchaTokenResult extends Result {
        String getTokenResult();
    }

    @KeepForSdkWithMembers
    /* loaded from: classes3.dex */
    public static class SafeBrowsingResponse extends Response<SafeBrowsingResult> {
        @NonNull
        public List<SafeBrowsingThreat> getDetectedThreats() {
            return getResult().getDetectedThreats();
        }

        @ShowFirstParty
        public long getLastUpdateTimeMs() {
            return getResult().getLastUpdateTimeMs();
        }

        @ShowFirstParty
        public String getMetadata() {
            return getResult().getMetadata();
        }

        @ShowFirstParty
        public byte[] getState() {
            return getResult().getState();
        }
    }

    @KeepForSdkWithMembers
    @Deprecated
    /* loaded from: classes3.dex */
    public interface SafeBrowsingResult extends Result {
        @NonNull
        List<SafeBrowsingThreat> getDetectedThreats();

        long getLastUpdateTimeMs();

        String getMetadata();

        byte[] getState();
    }

    /* loaded from: classes3.dex */
    public static class VerifyAppsUserResponse extends Response<VerifyAppsUserResult> {
        public boolean isVerifyAppsEnabled() {
            return getResult().isVerifyAppsEnabled();
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface VerifyAppsUserResult extends Result {
        boolean isVerifyAppsEnabled();
    }

    @NonNull
    @Deprecated
    PendingResult<AttestationResult> attest(@NonNull GoogleApiClient googleApiClient, @NonNull byte[] bArr);

    @NonNull
    @Deprecated
    PendingResult<VerifyAppsUserResult> enableVerifyApps(@NonNull GoogleApiClient googleApiClient);

    @NonNull
    @Deprecated
    PendingResult<VerifyAppsUserResult> isVerifyAppsEnabled(@NonNull GoogleApiClient googleApiClient);

    @Deprecated
    boolean isVerifyAppsEnabled(@NonNull Context context);

    @NonNull
    @Deprecated
    PendingResult<HarmfulAppsResult> listHarmfulApps(@NonNull GoogleApiClient googleApiClient);

    @NonNull
    @Deprecated
    PendingResult<SafeBrowsingResult> lookupUri(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull String str2, @NonNull int... iArr);

    @NonNull
    PendingResult<SafeBrowsingResult> lookupUri(@NonNull GoogleApiClient googleApiClient, @NonNull List<Integer> list, @NonNull String str);

    @NonNull
    @Deprecated
    PendingResult<RecaptchaTokenResult> verifyWithRecaptcha(@NonNull GoogleApiClient googleApiClient, @NonNull String str);
}
