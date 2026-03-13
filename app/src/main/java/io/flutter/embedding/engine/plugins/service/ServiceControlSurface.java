package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface ServiceControlSurface {
    void attachToService(@NonNull Service service, CG cg, boolean z);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
