package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import io.flutter.view.AccessibilityBridge;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.onAccessibilityHoverEvent(motionEvent, z);
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    public void setAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityBridge = accessibilityBridge;
    }
}
