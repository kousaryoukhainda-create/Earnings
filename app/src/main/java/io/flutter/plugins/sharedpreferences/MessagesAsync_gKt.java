package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
@Metadata
/* loaded from: classes2.dex */
public final class MessagesAsync_gKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> wrapError(Throwable th) {
        if (th instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th;
            return C0346Ie.c(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return C0346Ie.c(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    private static final List<Object> wrapResult(Object obj) {
        return C0320He.a(obj);
    }
}
