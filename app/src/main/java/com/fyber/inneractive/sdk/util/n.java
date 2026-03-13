package com.fyber.inneractive.sdk.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
/* loaded from: classes.dex */
public class n extends p {
    public static final /* synthetic */ int b = 0;

    public static boolean a(Intent intent) {
        int i;
        try {
            i = p.a.getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }

    public static String h() {
        try {
            return ((TelephonyManager) p.a.getSystemService(Constants.SIGN_IN_METHOD_PHONE)).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    @SuppressLint({"MissingPermission"})
    public static int j() {
        int dataNetworkType;
        try {
            if (p.b("android.permission.READ_PHONE_STATE")) {
                TelephonyManager telephonyManager = (TelephonyManager) p.a.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
                if (Build.VERSION.SDK_INT >= 24) {
                    dataNetworkType = telephonyManager.getDataNetworkType();
                    return dataNetworkType;
                }
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String k() {
        TelephonyManager telephonyManager;
        try {
            TelephonyManager telephonyManager2 = (TelephonyManager) p.a.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
            String networkOperator = telephonyManager2.getNetworkOperator();
            if (telephonyManager2.getPhoneType() == 2 && (telephonyManager = (TelephonyManager) p.a.getSystemService(Constants.SIGN_IN_METHOD_PHONE)) != null && telephonyManager.getSimState() == 5) {
                return telephonyManager2.getSimOperator();
            }
            return networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String l() {
        return p.a.getPackageName();
    }

    public static String m() {
        try {
            return p.a.getPackageManager().getPackageInfo(p.a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean n() {
        if ("mounted".equals(p.c()) && p.a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static boolean o() {
        boolean z;
        if ((p.a.getResources().getConfiguration().screenLayout & 15) == 4) {
            z = true;
        } else {
            z = false;
        }
        IAlog.d("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }
}
