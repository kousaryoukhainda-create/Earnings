package com.fyber.fairbid.internal;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.PlacementType;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
/* loaded from: classes.dex */
public class Constants {
    public static final int BANNER_FALLBACK_AD_HEIGHT_PHONE = 50;
    public static final int BANNER_FALLBACK_AD_HEIGHT_TABLET = 90;
    public static final int BANNER_FALLBACK_AD_WIDTH = 320;
    public static final String BIRTH_DATE_KEY = "birth_date";
    public static final String GDPR_CONSENT_STRING_URL_KEY = "gdpr_consent_string";
    public static final String GDPR_CONSENT_URL_KEY = "gdpr_privacy_consent";
    public static final String GENDER_KEY = "gender";
    public static final String HOURS_SINCE_INSTALL_KEY = "hours_since_install";
    public static final String IAB_US_PRIVACY_STRING_URL_KEY = "iab_us_privacy_string";
    public static final String LGPD_CONSENT_URL_KEY = "lgpd_privacy_consent";
    public static int MINIMUM_SUPPORTED_SDK_VERSION = 16;
    public static final int MIN_BANNER_REFRESH_INTERVAL = 5;
    public static final String PREFERENCES_KEY = "com.fyber.fairbid.sdk";
    public static String[] REQUIRED_PERMISSIONS = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};
    public static String TEST_APP_PACKAGE = "com.fyber.fairbid.testapp.debug";
    public static String TEST_APP_PACKAGE_RELEASE = "com.fyber.fairbid.testapp";

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum UNKNOWN uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class AdType {
        public static final AdType BANNER;
        public static final AdType INTERSTITIAL;
        public static final AdType REWARDED;
        public static final AdType UNKNOWN;
        public static final /* synthetic */ AdType[] c;
        public final PlacementType a;
        public final boolean b;

        static {
            PlacementType placementType = PlacementType.REWARDED;
            AdType adType = new AdType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, placementType, false);
            UNKNOWN = adType;
            AdType adType2 = new AdType("INTERSTITIAL", 1, PlacementType.INTERSTITIAL, true);
            INTERSTITIAL = adType2;
            AdType adType3 = new AdType("REWARDED", 2, placementType, true);
            REWARDED = adType3;
            AdType adType4 = new AdType("BANNER", 3, PlacementType.BANNER, false);
            BANNER = adType4;
            c = new AdType[]{adType, adType2, adType3, adType4};
        }

        public AdType(String str, int i, PlacementType placementType, boolean z) {
            this.a = placementType;
            this.b = z;
        }

        public static AdType fromPlacementType(@NonNull String str) {
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return BANNER;
                case 1:
                    return REWARDED;
                case 2:
                    return INTERSTITIAL;
                default:
                    return UNKNOWN;
            }
        }

        public static AdType valueOf(String str) {
            return (AdType) Enum.valueOf(AdType.class, str);
        }

        public static AdType[] values() {
            return (AdType[]) c.clone();
        }

        public PlacementType getPlacementType() {
            return this.a;
        }

        public boolean isFullScreenAd() {
            return this.b;
        }
    }
}
