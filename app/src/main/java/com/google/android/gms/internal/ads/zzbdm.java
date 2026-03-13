package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzbdm {
    private C0585Rk zza;
    private AbstractC0378Jk zzb;
    private AbstractServiceConnectionC0559Qk zzc;
    private zzbdl zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhfk.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final C0585Rk zza() {
        AbstractC0378Jk abstractC0378Jk = this.zzb;
        if (abstractC0378Jk == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = abstractC0378Jk.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhfk.zza(activity)) != null) {
            zzhfl zzhflVar = new zzhfl(this);
            this.zzc = zzhflVar;
            AbstractC0378Jk.a(activity, zza, zzhflVar);
        }
    }

    public final void zzc(AbstractC0378Jk abstractC0378Jk) {
        this.zzb = abstractC0378Jk;
        abstractC0378Jk.getClass();
        try {
            ((C2742tC) abstractC0378Jk.a).k();
        } catch (RemoteException unused) {
        }
        zzbdl zzbdlVar = this.zzd;
        if (zzbdlVar != null) {
            zzbdlVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdl zzbdlVar) {
        this.zzd = zzbdlVar;
    }

    public final void zzf(Activity activity) {
        AbstractServiceConnectionC0559Qk abstractServiceConnectionC0559Qk = this.zzc;
        if (abstractServiceConnectionC0559Qk == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC0559Qk);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
