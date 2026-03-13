package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public interface MethodCodec {
    @NonNull
    Object decodeEnvelope(@NonNull ByteBuffer byteBuffer);

    @NonNull
    MethodCall decodeMethodCall(@NonNull ByteBuffer byteBuffer);

    @NonNull
    ByteBuffer encodeErrorEnvelope(@NonNull String str, String str2, Object obj);

    @NonNull
    ByteBuffer encodeErrorEnvelopeWithStacktrace(@NonNull String str, String str2, Object obj, String str3);

    @NonNull
    ByteBuffer encodeMethodCall(@NonNull MethodCall methodCall);

    @NonNull
    ByteBuffer encodeSuccessEnvelope(Object obj);
}
