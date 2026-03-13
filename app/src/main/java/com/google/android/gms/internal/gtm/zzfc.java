package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.Logger;
@Deprecated
/* loaded from: classes3.dex */
public final class zzfc {
    private static volatile Logger zza = new zzcw();

    public static Logger zza() {
        return zza;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                StringBuilder p = BK.p(str, ":");
                p.append((String) obj);
                str2 = p.toString();
            } else {
                str2 = str;
            }
            Log.e((String) zzew.zzc.zzb(), str2);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.error(str);
        }
    }

    public static void zzc(Logger logger) {
        zza = logger;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzN(str);
        } else if (zzf(0)) {
            Log.v((String) zzew.zzc.zzb(), str);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzQ(str);
        } else if (zzf(2)) {
            Log.w((String) zzew.zzc.zzb(), str);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.warn(str);
        }
    }

    public static boolean zzf(int i) {
        if (zza == null || zza.getLogLevel() > i) {
            return false;
        }
        return true;
    }
}
