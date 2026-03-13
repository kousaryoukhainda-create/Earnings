package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* loaded from: classes3.dex */
public class zzbt {
    private final zzbx zza;

    public zzbt(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zza = zzbxVar;
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String zza = zza(obj);
        String zza2 = zza(obj2);
        String zza3 = zza(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        } else {
            str2 = "";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str2);
            sb.append(zza);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zza2)) {
            sb.append(str2);
            sb.append(zza2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str3);
            sb.append(zza3);
        }
        return sb.toString();
    }

    public static final boolean zzU() {
        return Log.isLoggable((String) zzew.zzc.zzb(), 2);
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            }
            return "false";
        } else if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        } else {
            return obj.toString();
        }
    }

    private final void zzb(int i, String str, Object obj, Object obj2, Object obj3) {
        zzfd zzfdVar;
        zzbx zzbxVar = this.zza;
        if (zzbxVar != null) {
            zzfdVar = zzbxVar.zzn();
        } else {
            zzfdVar = null;
        }
        zzfd zzfdVar2 = zzfdVar;
        if (zzfdVar2 != null) {
            String str2 = (String) zzew.zzc.zzb();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, zzD(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                zzfdVar2.zze(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String str3 = (String) zzew.zzc.zzb();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, zzD(str, obj, obj2, obj3));
        }
    }

    public final zzfj zzA() {
        return this.zza.zzo();
    }

    public final zzfv zzB() {
        return this.zza.zzq();
    }

    public final Clock zzC() {
        return this.zza.zzr();
    }

    public final void zzE(String str) {
        zzb(3, str, null, null, null);
    }

    public final void zzF(String str, Object obj) {
        zzb(3, str, obj, null, null);
    }

    public final void zzG(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, null);
    }

    public final void zzH(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzI(String str) {
        zzb(6, str, null, null, null);
    }

    public final void zzJ(String str, Object obj) {
        zzb(6, str, obj, null, null);
    }

    public final void zzK(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, null);
    }

    public final void zzL(String str) {
        zzb(4, str, null, null, null);
    }

    public final void zzM(String str, Object obj) {
        zzb(4, str, obj, null, null);
    }

    public final void zzN(String str) {
        zzb(2, str, null, null, null);
    }

    public final void zzO(String str, Object obj) {
        zzb(2, str, obj, null, null);
    }

    public final void zzP(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, null);
    }

    public final void zzQ(String str) {
        zzb(5, str, null, null, null);
    }

    public final void zzR(String str, Object obj) {
        zzb(5, str, obj, null, null);
    }

    public final void zzS(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, null);
    }

    public final void zzT(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final GoogleAnalytics zzp() {
        return this.zza.zzc();
    }

    public final com.google.android.gms.analytics.zzr zzq() {
        return this.zza.zzd();
    }

    public final zzbk zzr() {
        return this.zza.zze();
    }

    public final zzbs zzs() {
        return this.zza.zzf();
    }

    public final zzbx zzt() {
        return this.zza;
    }

    public final zzch zzu() {
        return this.zza.zzh();
    }

    public final zzcp zzv() {
        return this.zza.zzi();
    }

    public final zzcv zzw() {
        return this.zza.zzj();
    }

    public final zzcz zzx() {
        return this.zza.zzk();
    }

    public final zzda zzy() {
        return this.zza.zzl();
    }

    public final zzfd zzz() {
        return this.zza.zzm();
    }
}
