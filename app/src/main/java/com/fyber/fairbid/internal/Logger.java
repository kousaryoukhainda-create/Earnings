package com.fyber.fairbid.internal;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.fairbid.tg;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
/* loaded from: classes.dex */
public final class Logger {
    public static final String TAG = "FairBidSDK";
    public static boolean a = false;

    /* loaded from: classes.dex */
    public interface a {
        @NonNull
        String a();
    }

    public static boolean b(Context context) {
        boolean z;
        boolean a2 = tg.a(context, Constants.TEST_APP_PACKAGE);
        boolean isLoggable = Log.isLoggable(DevLogger.TAG, 2);
        if (!a && !a2 && !isLoggable) {
            z = false;
        } else {
            z = true;
        }
        Log.d(TAG, "shouldEnableLogsOnInit? " + z + "\n  were logs enabled explicitly? " + a + "\n  is the debug test app installed? " + a2 + "\n  is FairBid Log Prop set? " + isLoggable + "\n ");
        return z;
    }

    public static void debug(Object obj) {
        if (a) {
            if (obj != null) {
                debug(obj.toString());
            } else {
                debug("NULL");
            }
        }
    }

    public static void error(String str, Throwable th) {
        if (a) {
            Log.e(TAG, str, th);
        }
    }

    public static void format(String str, Object... objArr) {
        debug(String.format(str, objArr));
    }

    public static void info(String str) {
        if (!a) {
            return;
        }
        if (str != null) {
            Log.i(TAG, str);
        } else {
            debug("NULL");
        }
    }

    public static void init(Context context) {
        new Thread(new DI(context, 0)).start();
    }

    public static boolean isEnabled() {
        return a;
    }

    public static void setDebugLogging(boolean z) {
        a = z;
    }

    public static void trace(String str, Throwable th) {
        if (a) {
            error(str);
            trace(th);
        }
    }

    public static void verbose(String str) {
        if (!a) {
            return;
        }
        if (str != null) {
            Log.v(TAG, str);
        } else {
            Log.v(TAG, "NULL");
        }
    }

    public static void warn(String str) {
        if (!a) {
            return;
        }
        Log.w(TAG, str);
    }

    public static void error(String str) {
        if (a) {
            Log.e(TAG, str);
        }
    }

    public static void debug(String str, Throwable th) {
        if (a) {
            Log.d(TAG, str, th);
        }
    }

    public static void trace(Throwable th) {
        if (a && th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            error(stringWriter.toString());
        }
    }

    public static void debug(String str) {
        if (a) {
            if (str != null) {
                Log.d(TAG, str);
            } else {
                debug("NULL");
            }
        }
    }

    public static void debug(@NonNull a aVar) {
        if (a) {
            Log.d(TAG, aVar.a());
        }
    }

    public static void debug(String str, Object... objArr) {
        if (a) {
            if (str != null) {
                Log.d(TAG, String.format(Locale.ENGLISH, str, objArr));
            } else {
                debug("NULL");
            }
        }
    }
}
