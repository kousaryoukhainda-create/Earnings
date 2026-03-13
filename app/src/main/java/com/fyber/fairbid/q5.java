package com.fyber.fairbid;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public final class q5 {
    @NonNull
    public static String a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "no_internet";
        }
        int type = activeNetworkInfo.getType();
        int subtype = activeNetworkInfo.getSubtype();
        if (type == 1) {
            return "wifi";
        }
        if (type != 0) {
            return "no_internet";
        }
        switch (subtype) {
            case 1:
                return "gprs";
            case 2:
                return "edge";
            case 3:
                return "umts";
            case 4:
                return "cdma";
            case 5:
            case 6:
                return "evdo";
            case 7:
                return "rtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            case 10:
                return "hspa";
            case 11:
                return "iden";
            case 12:
                return "evdo_b";
            case 13:
                return "lte";
            case 14:
                return "ehrpd";
            case 15:
                return "hspap";
            default:
                return "no_internet";
        }
    }
}
