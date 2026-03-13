package io.flutter.plugins.googlemobileads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdSize;
/* loaded from: classes2.dex */
class FlutterAdSize {
    final int height;
    @NonNull
    final AdSize size;
    final int width;

    /* loaded from: classes2.dex */
    public static class AdSizeFactory {
        public AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
        }

        public AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
            return AdSize.getInlineAdaptiveBannerAdSize(i, i2);
        }

        public AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i);
        }

        public AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class AnchoredAdaptiveBannerAdSize extends FlutterAdSize {
        final String orientation;

        public AnchoredAdaptiveBannerAdSize(@NonNull Context context, @NonNull AdSizeFactory adSizeFactory, String str, int i) {
            super(getAdSize(context, adSizeFactory, str, i));
            this.orientation = str;
        }

        @NonNull
        private static AdSize getAdSize(@NonNull Context context, @NonNull AdSizeFactory adSizeFactory, String str, int i) {
            if (str == null) {
                return adSizeFactory.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("portrait")) {
                return adSizeFactory.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("landscape")) {
                return adSizeFactory.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
        }
    }

    /* loaded from: classes2.dex */
    public static class FluidAdSize extends FlutterAdSize {
        public FluidAdSize() {
            super(AdSize.FLUID);
        }
    }

    /* loaded from: classes2.dex */
    public static class InlineAdaptiveBannerAdSize extends FlutterAdSize {
        final Integer maxHeight;
        final Integer orientation;

        public InlineAdaptiveBannerAdSize(@NonNull AdSizeFactory adSizeFactory, @NonNull Context context, int i, Integer num, Integer num2) {
            super(getAdSize(adSizeFactory, context, i, num, num2));
            this.orientation = num;
            this.maxHeight = num2;
        }

        private static AdSize getAdSize(@NonNull AdSizeFactory adSizeFactory, @NonNull Context context, int i, Integer num, Integer num2) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return adSizeFactory.getPortraitInlineAdaptiveBannerAdSize(context, i);
                }
                return adSizeFactory.getLandscapeInlineAdaptiveBannerAdSize(context, i);
            } else if (num2 != null) {
                return adSizeFactory.getInlineAdaptiveBannerAdSize(i, num2.intValue());
            } else {
                return adSizeFactory.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class SmartBannerAdSize extends FlutterAdSize {
        public SmartBannerAdSize() {
            super(AdSize.SMART_BANNER);
        }
    }

    public FlutterAdSize(int i, int i2) {
        this(new AdSize(i, i2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdSize)) {
            return false;
        }
        FlutterAdSize flutterAdSize = (FlutterAdSize) obj;
        if (this.width == flutterAdSize.width && this.height == flutterAdSize.height) {
            return true;
        }
        return false;
    }

    public AdSize getAdSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public FlutterAdSize(@NonNull AdSize adSize) {
        this.size = adSize;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
    }
}
