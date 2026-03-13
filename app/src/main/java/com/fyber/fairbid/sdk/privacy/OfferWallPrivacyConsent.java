package com.fyber.fairbid.sdk.privacy;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public abstract class OfferWallPrivacyConsent {
    public boolean a;

    public OfferWallPrivacyConsent() {
    }

    public final boolean getClearConsentOnInit$fairbid_sdk_release() {
        return this.a;
    }

    @NotNull
    public abstract OfferWallPrivacyStandard getPrivacyStandard$fairbid_sdk_release();

    public final void setClearConsentOnInit$fairbid_sdk_release(boolean z) {
        this.a = z;
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class CCPA extends OfferWallPrivacyConsent {
        @NotNull
        public final String b;
        @NotNull
        public final OfferWallPrivacyStandard c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CCPA(@NotNull String privacyString) {
            super(null);
            Intrinsics.checkNotNullParameter(privacyString, "privacyString");
            this.b = privacyString;
            this.c = OfferWallPrivacyStandard.CCPA;
        }

        @Override // com.fyber.fairbid.sdk.privacy.OfferWallPrivacyConsent
        @NotNull
        public OfferWallPrivacyStandard getPrivacyStandard$fairbid_sdk_release() {
            return this.c;
        }

        @NotNull
        public final String getPrivacyString$fairbid_sdk_release() {
            return this.b;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CCPA(@NotNull String privacyString, boolean z) {
            this(privacyString);
            Intrinsics.checkNotNullParameter(privacyString, "privacyString");
            setClearConsentOnInit$fairbid_sdk_release(z);
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class GDPR extends OfferWallPrivacyConsent {
        public final boolean b;
        @NotNull
        public final OfferWallPrivacyStandard c;

        public GDPR(boolean z) {
            super(null);
            this.b = z;
            this.c = OfferWallPrivacyStandard.GDPR;
        }

        public final boolean getConsentGiven$fairbid_sdk_release() {
            return this.b;
        }

        @Override // com.fyber.fairbid.sdk.privacy.OfferWallPrivacyConsent
        @NotNull
        public OfferWallPrivacyStandard getPrivacyStandard$fairbid_sdk_release() {
            return this.c;
        }

        public GDPR(boolean z, boolean z2) {
            this(z);
            setClearConsentOnInit$fairbid_sdk_release(z2);
        }
    }

    public /* synthetic */ OfferWallPrivacyConsent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
