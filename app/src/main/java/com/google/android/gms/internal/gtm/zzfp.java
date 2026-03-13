package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;
/* loaded from: classes3.dex */
public final class zzfp {
    private static Boolean zza;
    private final Handler zzb;
    private final Context zzc;

    public zzfp(Context context) {
        Preconditions.checkNotNull(context);
        this.zzc = context;
        this.zzb = new zzgc();
    }

    public static boolean zzh(Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z);
        return z;
    }

    public final int zza(Intent intent, int i, final int i2) {
        try {
            synchronized (zzfk.zza) {
                WakeLock wakeLock = zzfk.zzb;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        } catch (SecurityException unused) {
        }
        zzbx zzg = zzbx.zzg(this.zzc);
        final zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzP("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfl
                @Override // java.lang.Runnable
                public final void run() {
                    zzfp.this.zzc(i2, zzm);
                }
            });
        }
        return 2;
    }

    public final /* synthetic */ void zzc(int i, zzfd zzfdVar) {
        if (((zzfo) this.zzc).callServiceStopSelfResult(i)) {
            zzfdVar.zzN("Local AnalyticsService processed last dispatch request");
        }
    }

    public final /* synthetic */ void zzd(zzfd zzfdVar, JobParameters jobParameters) {
        zzfdVar.zzN("AnalyticsJobService processed last dispatch request");
        ((zzfo) this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbx.zzg(this.zzc).zzf().zze(new zzfn(this, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(final JobParameters jobParameters) {
        zzbx zzg = zzbx.zzg(this.zzc);
        final zzfd zzm = zzg.zzm();
        String string = jobParameters.getExtras().getString("action");
        zzg.zzj();
        zzm.zzO("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfm
                @Override // java.lang.Runnable
                public final void run() {
                    zzfp.this.zzd(zzm, jobParameters);
                }
            });
            return true;
        }
        return true;
    }
}
