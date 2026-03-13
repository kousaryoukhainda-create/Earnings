package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import java.io.File;
/* loaded from: classes3.dex */
final class zzbu {
    @TargetApi(9)
    public static boolean zza(String str) {
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(str);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
                return true;
            }
        } catch (NumberFormatException unused) {
            Log.e("GoogleTagManager", "Invalid version number: ".concat(String.valueOf(Build.VERSION.SDK)));
        }
        return false;
    }
}
