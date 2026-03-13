package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
/* loaded from: classes2.dex */
class FlutterViewFactory extends PlatformViewFactory {
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    public FlutterViewFactory(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.instanceManager = androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    @NonNull
    public PlatformView create(Context context, int i, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            final Object androidWebkitLibraryPigeonInstanceManager = this.instanceManager.getInstance(num.intValue());
            if (androidWebkitLibraryPigeonInstanceManager instanceof PlatformView) {
                return (PlatformView) androidWebkitLibraryPigeonInstanceManager;
            }
            if (androidWebkitLibraryPigeonInstanceManager instanceof View) {
                return new PlatformView() { // from class: io.flutter.plugins.webviewflutter.FlutterViewFactory.1
                    @Override // io.flutter.plugin.platform.PlatformView
                    public void dispose() {
                    }

                    @Override // io.flutter.plugin.platform.PlatformView
                    public View getView() {
                        return (View) androidWebkitLibraryPigeonInstanceManager;
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
            throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + androidWebkitLibraryPigeonInstanceManager);
        }
        throw new IllegalStateException("An identifier is required to retrieve a View instance.");
    }
}
