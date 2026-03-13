package io.flutter.plugin.platform;

import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.view.AccessibilityBridge;
/* loaded from: classes2.dex */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(@NonNull AccessibilityBridge accessibilityBridge);

    void detachAccessibilityBridge();

    View getPlatformViewById(int i);

    boolean usesVirtualDisplay(int i);
}
