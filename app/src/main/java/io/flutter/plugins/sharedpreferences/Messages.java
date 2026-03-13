package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class Messages {

    /* loaded from: classes2.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes2.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            return super.readValueOfType(b, byteBuffer);
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* loaded from: classes2.dex */
    public interface SharedPreferencesApi {
        @NonNull
        Boolean clear(@NonNull String str, List<String> list);

        @NonNull
        Map<String, Object> getAll(@NonNull String str, List<String> list);

        @NonNull
        Boolean remove(@NonNull String str);

        @NonNull
        Boolean setBool(@NonNull String str, @NonNull Boolean bool);

        @NonNull
        Boolean setDeprecatedStringList(@NonNull String str, @NonNull List<String> list);

        @NonNull
        Boolean setDouble(@NonNull String str, @NonNull Double d);

        @NonNull
        Boolean setEncodedStringList(@NonNull String str, @NonNull String str2);

        @NonNull
        Boolean setInt(@NonNull String str, @NonNull Long l);

        @NonNull
        Boolean setString(@NonNull String str, @NonNull String str2);
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
