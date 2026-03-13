package io.flutter.plugins.firebase.analytics;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public final class GeneratedAndroidFirebaseAnalyticsPigeonUtils {
    @NotNull
    public static final GeneratedAndroidFirebaseAnalyticsPigeonUtils INSTANCE = new GeneratedAndroidFirebaseAnalyticsPigeonUtils();

    private GeneratedAndroidFirebaseAnalyticsPigeonUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean deepEquals(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.analytics.GeneratedAndroidFirebaseAnalyticsPigeonUtils.deepEquals(java.lang.Object, java.lang.Object):boolean");
    }

    @NotNull
    public final List<Object> wrapError(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) exception;
            return C0346Ie.c(flutterError.getCode(), flutterError.getMessage(), flutterError.getDetails());
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
