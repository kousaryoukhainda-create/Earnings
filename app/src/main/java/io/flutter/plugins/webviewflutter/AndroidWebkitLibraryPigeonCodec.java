package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public class AndroidWebkitLibraryPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(buffer);
            if (l == null) {
                return null;
            }
            return FileChooserMode.Companion.ofRaw((int) l.longValue());
        } else if (b == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 == null) {
                return null;
            }
            return ConsoleMessageLevel.Companion.ofRaw((int) l2.longValue());
        } else if (b == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 == null) {
                return null;
            }
            return OverScrollMode.Companion.ofRaw((int) l3.longValue());
        } else if (b == -124) {
            Long l4 = (Long) readValue(buffer);
            if (l4 == null) {
                return null;
            }
            return SslErrorType.Companion.ofRaw((int) l4.longValue());
        } else if (b == -123) {
            Long l5 = (Long) readValue(buffer);
            if (l5 == null) {
                return null;
            }
            return MixedContentMode.Companion.ofRaw((int) l5.longValue());
        } else {
            return super.readValueOfType(b, buffer);
        }
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(@NotNull ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (obj instanceof FileChooserMode) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((FileChooserMode) obj).getRaw()));
        } else if (obj instanceof ConsoleMessageLevel) {
            stream.write(130);
            writeValue(stream, Integer.valueOf(((ConsoleMessageLevel) obj).getRaw()));
        } else if (obj instanceof OverScrollMode) {
            stream.write(131);
            writeValue(stream, Integer.valueOf(((OverScrollMode) obj).getRaw()));
        } else if (obj instanceof SslErrorType) {
            stream.write(132);
            writeValue(stream, Integer.valueOf(((SslErrorType) obj).getRaw()));
        } else if (obj instanceof MixedContentMode) {
            stream.write(133);
            writeValue(stream, Integer.valueOf(((MixedContentMode) obj).getRaw()));
        } else {
            super.writeValue(stream, obj);
        }
    }
}
