package com.fyber.fairbid.internal;

import android.util.Log;
/* loaded from: classes.dex */
public class DevLogger {
    public static final String TAG = "FairBid";

    public static void debug(String str) {
        Log.d(TAG, str);
    }

    public static void error(String str) {
        Log.e(TAG, str);
    }

    public static void info(String str) {
        Log.i(TAG, str);
    }

    public static void warn(String str) {
        Log.w(TAG, str);
    }

    public static void error(Throwable th, String str) {
        Log.e(TAG, str, th);
    }

    public static void warn(Throwable th, String str) {
        Log.w(TAG, str, th);
    }
}
