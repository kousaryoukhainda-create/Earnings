package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes3.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                zzk.zza();
                throw th;
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + message, e);
            zzk.zza();
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + message2, e2);
            zzk.zza();
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + message3, e);
            zzk.zza();
        }
    }
}
