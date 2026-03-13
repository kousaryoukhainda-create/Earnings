package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface VideoPlayerCallbacks {
    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingUpdate(long j);

    void onCompleted();

    void onError(@NonNull String str, String str2, Object obj);

    void onInitialized(int i, int i2, long j, int i3);

    void onIsPlayingStateUpdate(boolean z);
}
