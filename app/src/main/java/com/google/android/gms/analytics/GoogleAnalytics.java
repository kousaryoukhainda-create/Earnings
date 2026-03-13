package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
public final class GoogleAnalytics extends zza {
    private static List zzb = new ArrayList();
    private boolean zzc;
    private final Set zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    public GoogleAnalytics(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzd = new HashSet();
    }

    @NonNull
    public static GoogleAnalytics getInstance(@NonNull Context context) {
        return zzbx.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            try {
                List<Runnable> list = zzb;
                if (list != null) {
                    for (Runnable runnable : list) {
                        runnable.run();
                    }
                    zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dispatchLocalHits() {
        zzb().zzf().zzc();
    }

    @TargetApi(14)
    public void enableAutoActivityReports(@NonNull Application application) {
        if (!this.zze) {
            application.registerActivityLifecycleCallbacks(new zze(this));
            this.zze = true;
        }
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @NonNull
    @Deprecated
    public Logger getLogger() {
        return zzfc.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    @NonNull
    public Tracker newTracker(int i) {
        Tracker tracker;
        zzft zzftVar;
        synchronized (this) {
            try {
                tracker = new Tracker(zzb(), null, null);
                if (i > 0 && (zzftVar = (zzft) new zzfs(zzb()).zza(i)) != null) {
                    tracker.zzm(zzftVar);
                }
                tracker.zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
        return tracker;
    }

    public void reportActivityStart(@NonNull Activity activity) {
        if (!this.zze) {
            zzh(activity);
        }
    }

    public void reportActivityStop(@NonNull Activity activity) {
        if (!this.zze) {
            zzi(activity);
        }
    }

    public void setAppOptOut(boolean z) {
        this.zzg = z;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z) {
        this.zzf = z;
    }

    public void setLocalDispatchPeriod(int i) {
        zzb().zzf().zzl(i);
    }

    @Deprecated
    public void setLogger(@NonNull Logger logger) {
        zzfc.zzc(logger);
        if (!this.zzh) {
            zzev zzevVar = zzew.zzc;
            Log.i((String) zzevVar.zzb(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzevVar.zzb()) + " DEBUG");
            this.zzh = true;
        }
    }

    public final void zzg() {
        zzfv zzq = zzb().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            setDryRun(zzq.zzc());
        }
        zzq.zzf();
        this.zzc = true;
    }

    public final void zzh(Activity activity) {
        for (zzv zzvVar : this.zzd) {
            zzvVar.zza(activity);
        }
    }

    public final void zzi(Activity activity) {
        for (zzv zzvVar : this.zzd) {
            zzvVar.zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final void zzk(zzv zzvVar) {
        this.zzd.add(zzvVar);
        Context zza = zzb().zza();
        if (zza instanceof Application) {
            enableAutoActivityReports((Application) zza);
        }
    }

    public final void zzl(zzv zzvVar) {
        this.zzd.remove(zzvVar);
    }

    @NonNull
    public Tracker newTracker(@NonNull String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, null);
            tracker.zzW();
        }
        return tracker;
    }
}
