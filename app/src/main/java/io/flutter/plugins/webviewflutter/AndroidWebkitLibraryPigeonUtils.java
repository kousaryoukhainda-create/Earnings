package io.flutter.plugins.webviewflutter;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public final class AndroidWebkitLibraryPigeonUtils {
    @NotNull
    public static final AndroidWebkitLibraryPigeonUtils INSTANCE = new AndroidWebkitLibraryPigeonUtils();

    private AndroidWebkitLibraryPigeonUtils() {
    }

    @NotNull
    public final AndroidWebKitError createConnectionError(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        return new AndroidWebKitError("channel-error", AbstractC2437ph.h("Unable to establish connection on channel: '", channelName, "'."), "");
    }

    @NotNull
    public final List<Object> wrapError(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof AndroidWebKitError) {
            AndroidWebKitError androidWebKitError = (AndroidWebKitError) exception;
            return C0346Ie.c(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
        }
        String simpleName = exception.getClass().getSimpleName();
        String th = exception.toString();
        Throwable cause = exception.getCause();
        String stackTraceString = Log.getStackTraceString(exception);
        return C0346Ie.c(simpleName, th, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    @NotNull
    public final List<Object> wrapResult(Object obj) {
        return C0320He.a(obj);
    }
}
