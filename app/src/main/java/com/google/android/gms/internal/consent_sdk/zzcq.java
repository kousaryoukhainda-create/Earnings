package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
/* loaded from: classes3.dex */
public final class zzcq {
    public static boolean zza(boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("emulator") && !Build.HARDWARE.contains("ranchu")) {
                return false;
            }
            return true;
        }
        return Build.DEVICE.startsWith("generic");
    }
}
