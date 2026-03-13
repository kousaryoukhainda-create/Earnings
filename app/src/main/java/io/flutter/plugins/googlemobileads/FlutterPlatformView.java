package io.flutter.plugins.googlemobileads;

import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.plugin.platform.PlatformView;
/* loaded from: classes2.dex */
class FlutterPlatformView implements PlatformView {
    private View view;

    public FlutterPlatformView(@NonNull View view) {
        this.view = view;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.view = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.view;
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
