package io.flutter.embedding.engine.dart;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public interface PlatformMessageHandler {
    void handleMessageFromDart(@NonNull String str, ByteBuffer byteBuffer, int i, long j);

    void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer);
}
