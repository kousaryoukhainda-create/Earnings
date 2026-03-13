package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
@Keep
/* loaded from: classes2.dex */
public class HiddenLifecycleReference {
    @NonNull
    private final CG lifecycle;

    public HiddenLifecycleReference(@NonNull CG cg) {
        this.lifecycle = cg;
    }

    @NonNull
    public CG getLifecycle() {
        return this.lifecycle;
    }
}
