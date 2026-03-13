package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import io.flutter.plugins.firebase.auth.Constants;
/* loaded from: classes.dex */
public final class AFa1kSDK {

    /* loaded from: classes.dex */
    public static final class AFa1zSDK {
        public final String AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final String valueOf;

        public AFa1zSDK(@NonNull String str, String str2, String str3) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = str2;
            this.valueOf = str3;
        }
    }

    private static boolean values(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public final AFa1zSDK AFInAppEventParameterName(@NonNull Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (values(networkInfo)) {
                        if (1 == networkInfo.getType()) {
                            str3 = "WIFI";
                        } else if (networkInfo.getType() == 0) {
                            str3 = "MOBILE";
                        }
                    } else {
                        i++;
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new AFa1zSDK(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new AFa1zSDK(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
        }
        return new AFa1zSDK(str3, str4, str2);
    }
}
