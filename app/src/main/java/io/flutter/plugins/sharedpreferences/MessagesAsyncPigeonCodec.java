package io.flutter.plugins.sharedpreferences;

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
public class MessagesAsyncPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, @NotNull ByteBuffer buffer) {
        List<? extends Object> list;
        List<? extends Object> list2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(buffer);
            if (l == null) {
                return null;
            }
            return StringListLookupResultType.Companion.ofRaw((int) l.longValue());
        } else if (b == -126) {
            Object readValue = readValue(buffer);
            if (readValue instanceof List) {
                list2 = (List) readValue;
            } else {
                list2 = null;
            }
            if (list2 == null) {
                return null;
            }
            return SharedPreferencesPigeonOptions.Companion.fromList(list2);
        } else if (b == -125) {
            Object readValue2 = readValue(buffer);
            if (readValue2 instanceof List) {
                list = (List) readValue2;
            } else {
                list = null;
            }
            if (list == null) {
                return null;
            }
            return StringListResult.Companion.fromList(list);
        } else {
            return super.readValueOfType(b, buffer);
        }
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(@NotNull ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (obj instanceof StringListLookupResultType) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof SharedPreferencesPigeonOptions) {
            stream.write(130);
            writeValue(stream, ((SharedPreferencesPigeonOptions) obj).toList());
        } else if (obj instanceof StringListResult) {
            stream.write(131);
            writeValue(stream, ((StringListResult) obj).toList());
        } else {
            super.writeValue(stream, obj);
        }
    }
}
