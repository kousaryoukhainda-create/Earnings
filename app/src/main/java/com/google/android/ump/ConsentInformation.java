package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* loaded from: classes.dex */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(@RecentlyNonNull FormError formError);
    }

    /* loaded from: classes.dex */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class PrivacyOptionsRequirementStatus {
        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus NOT_REQUIRED;
        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus REQUIRED;
        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus UNKNOWN;
        public static final /* synthetic */ PrivacyOptionsRequirementStatus[] b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        static {
            ?? r3 = new Enum(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = r3;
            ?? r4 = new Enum("NOT_REQUIRED", 1);
            NOT_REQUIRED = r4;
            ?? r5 = new Enum("REQUIRED", 2);
            REQUIRED = r5;
            b = new PrivacyOptionsRequirementStatus[]{r3, r4, r5};
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus valueOf(@RecentlyNonNull String str) {
            return (PrivacyOptionsRequirementStatus) Enum.valueOf(PrivacyOptionsRequirementStatus.class, str);
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus[] values() {
            return (PrivacyOptionsRequirementStatus[]) b.clone();
        }
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentRequestParameters consentRequestParameters, @RecentlyNonNull OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, @RecentlyNonNull OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
