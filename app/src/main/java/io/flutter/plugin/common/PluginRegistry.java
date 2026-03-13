package io.flutter.plugin.common;

import android.content.Intent;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface PluginRegistry {

    /* loaded from: classes2.dex */
    public interface ActivityResultListener {
        boolean onActivityResult(int i, int i2, Intent intent);
    }

    /* loaded from: classes2.dex */
    public interface NewIntentListener {
        boolean onNewIntent(@NonNull Intent intent);
    }

    /* loaded from: classes2.dex */
    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* loaded from: classes2.dex */
    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    /* loaded from: classes2.dex */
    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z);
    }
}
