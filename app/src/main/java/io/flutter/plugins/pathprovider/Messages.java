package io.flutter.plugins.pathprovider;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
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
    public interface PathProviderApi {
        String getApplicationCachePath();

        String getApplicationDocumentsPath();

        String getApplicationSupportPath();

        @NonNull
        List<String> getExternalCachePaths();

        String getExternalStoragePath();

        @NonNull
        List<String> getExternalStoragePaths(@NonNull StorageDirectory storageDirectory);

        String getTemporaryPath();
    }

    /* loaded from: classes2.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            if (b != -127) {
                return super.readValueOfType(b, byteBuffer);
            }
            Object readValue = readValue(byteBuffer);
            if (readValue == null) {
                return null;
            }
            return StorageDirectory.values()[((Long) readValue).intValue()];
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Integer valueOf;
            if (obj instanceof StorageDirectory) {
                byteArrayOutputStream.write(129);
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((StorageDirectory) obj).index);
                }
                writeValue(byteArrayOutputStream, valueOf);
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* loaded from: classes2.dex */
    public enum StorageDirectory {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);
        
        final int index;

        StorageDirectory(int i) {
            this.index = i;
        }
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
