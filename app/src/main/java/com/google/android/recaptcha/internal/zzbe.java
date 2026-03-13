package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    @NotNull
    public static final Set zza(@NotNull Context context) {
        Network activeNetwork;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 23) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    linkedHashSet.add(zzqi.TRANSPORT_WIFI);
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    linkedHashSet.add(zzqi.TRANSPORT_VPN);
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                    linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
                }
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return C3312zr.b;
        }
    }

    private static final Map zzb() {
        LinkedHashMap f = C2148mJ.f(new JQ(0, zzqi.NET_CAPABILITY_MMS), new JQ(1, zzqi.NET_CAPABILITY_SUPL), new JQ(2, zzqi.NET_CAPABILITY_DUN), new JQ(3, zzqi.NET_CAPABILITY_FOTA), new JQ(4, zzqi.NET_CAPABILITY_IMS), new JQ(5, zzqi.NET_CAPABILITY_CBS), new JQ(6, zzqi.NET_CAPABILITY_WIFI_P2P), new JQ(7, zzqi.NET_CAPABILITY_IA), new JQ(8, zzqi.NET_CAPABILITY_RCS), new JQ(9, zzqi.NET_CAPABILITY_XCAP), new JQ(10, zzqi.NET_CAPABILITY_EIMS), new JQ(11, zzqi.NET_CAPABILITY_NOT_METERED), new JQ(12, zzqi.NET_CAPABILITY_INTERNET), new JQ(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new JQ(14, zzqi.NET_CAPABILITY_TRUSTED), new JQ(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
            f.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        }
        if (i >= 28) {
            f.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            f.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            f.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            f.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            f.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            f.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            f.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            f.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            f.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            f.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            f.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return f;
    }
}
