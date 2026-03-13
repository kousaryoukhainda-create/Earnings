package io.flutter.plugins.firebase.analytics;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public class GeneratedAndroidFirebaseAnalyticsPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, @NotNull ByteBuffer buffer) {
        List<? extends Object> list;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b == -127) {
            Object readValue = readValue(buffer);
            if (readValue instanceof List) {
                list = (List) readValue;
            } else {
                list = null;
            }
            if (list == null) {
                return null;
            }
            return AnalyticsEvent.Companion.fromList(list);
        }
        return super.readValueOfType(b, buffer);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(@NotNull ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (obj instanceof AnalyticsEvent) {
            stream.write(129);
            writeValue(stream, ((AnalyticsEvent) obj).toList());
            return;
        }
        super.writeValue(stream, obj);
    }
}
