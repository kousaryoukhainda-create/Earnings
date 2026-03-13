package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Locale;
/* loaded from: classes2.dex */
final class GoogleMobileAdsViewFactory extends PlatformViewFactory {
    @NonNull
    private final AdInstanceManager manager;

    /* loaded from: classes2.dex */
    public static class ErrorTextView implements PlatformView {
        private final TextView textView;

        private ErrorTextView(Context context, String str) {
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(str);
            textView.setBackgroundColor(-65536);
            textView.setTextColor(-256);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public View getView() {
            return this.textView;
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public final /* synthetic */ void onFlutterViewAttached(View view) {
            NR.a(this, view);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public final /* synthetic */ void onFlutterViewDetached() {
            NR.b(this);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public final /* synthetic */ void onInputConnectionLocked() {
            NR.c(this);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public final /* synthetic */ void onInputConnectionUnlocked() {
            NR.d(this);
        }
    }

    public GoogleMobileAdsViewFactory(@NonNull AdInstanceManager adInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.manager = adInstanceManager;
    }

    private static PlatformView getErrorView(@NonNull final Context context, int i) {
        Log.e("GoogleMobileAdsViewFactory", String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", Integer.valueOf(i)));
        return new PlatformView() { // from class: io.flutter.plugins.googlemobileads.GoogleMobileAdsViewFactory.1
            @Override // io.flutter.plugin.platform.PlatformView
            public void dispose() {
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public View getView() {
                return new View(context);
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public final /* synthetic */ void onFlutterViewAttached(View view) {
                NR.a(this, view);
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public final /* synthetic */ void onFlutterViewDetached() {
                NR.b(this);
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public final /* synthetic */ void onInputConnectionLocked() {
                NR.c(this);
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public final /* synthetic */ void onInputConnectionUnlocked() {
                NR.d(this);
            }
        };
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i, Object obj) {
        if (obj == null) {
            return getErrorView(context, 0);
        }
        Integer num = (Integer) obj;
        FlutterAd adForId = this.manager.adForId(num.intValue());
        if (adForId != null && adForId.getPlatformView() != null) {
            return adForId.getPlatformView();
        }
        return getErrorView(context, num.intValue());
    }
}
