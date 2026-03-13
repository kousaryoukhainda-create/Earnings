package io.flutter.embedding.android;

import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface ExclusiveAppComponent<T> {
    void detachFromFlutterEngine();

    @NonNull
    T getAppComponent();
}
