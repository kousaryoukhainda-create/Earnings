package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
/* loaded from: classes.dex */
public class ConsentRequestParameters {
    public final boolean a;
    public final String b;
    public final ConsentDebugSettings c;

    /* loaded from: classes.dex */
    public static final class Builder {
        public boolean a;
        public String b;
        public ConsentDebugSettings c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.b;
    }
}
