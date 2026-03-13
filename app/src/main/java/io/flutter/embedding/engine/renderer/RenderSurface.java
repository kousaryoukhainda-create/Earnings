package io.flutter.embedding.engine.renderer;

import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface RenderSurface {
    void attachToRenderer(@NonNull FlutterRenderer flutterRenderer);

    void detachFromRenderer();

    FlutterRenderer getAttachedRenderer();

    void pause();

    void resume();
}
