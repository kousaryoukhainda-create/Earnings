package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* renamed from: x70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3079x70 implements Runnable {
    public static final Object h = new Object();
    public static Boolean i;
    public static Boolean j;
    public final Context b;
    public final C1048ci c;
    public final PowerManager.WakeLock d;
    public final C2907v70 f;
    public final long g;

    public RunnableC3079x70(C2907v70 c2907v70, Context context, C1048ci c1048ci, long j2) {
        this.f = c2907v70;
        this.b = context;
        this.g = j2;
        this.c = c1048ci;
        this.d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (h) {
            try {
                Boolean bool = j;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                j = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (h) {
            try {
                Boolean bool = i;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                i = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
            z = false;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2907v70 c2907v70 = this.f;
        Context context = this.b;
        boolean c = c(context);
        PowerManager.WakeLock wakeLock = this.d;
        if (c) {
            wakeLock.acquire(AbstractC2694sh.a);
        }
        try {
            try {
                c2907v70.h(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                c2907v70.h(false);
                if (!c(context)) {
                    return;
                }
            }
            if (!this.c.h()) {
                c2907v70.h(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (a(context) && !d()) {
                new C2993w70(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                if (c2907v70.j()) {
                    c2907v70.h(false);
                } else {
                    c2907v70.k(this.g);
                }
                if (!c(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
