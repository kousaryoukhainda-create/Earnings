package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class zzbx {
    private static volatile zzbx zza;
    private final Context zzb;
    private final Context zzc;
    private final Clock zzd;
    private final zzcv zze;
    private final zzfd zzf;
    private final com.google.android.gms.analytics.zzr zzg;
    private final zzbs zzh;
    private final zzda zzi;
    private final zzfv zzj;
    private final zzfj zzk;
    private final GoogleAnalytics zzl;
    private final zzcp zzm;
    private final zzbk zzn;
    private final zzch zzo;
    private final zzcz zzp;

    public zzbx(zzby zzbyVar) {
        Context zza2 = zzbyVar.zza();
        Preconditions.checkNotNull(zza2, "Application context can't be null");
        Context zzb = zzbyVar.zzb();
        Preconditions.checkNotNull(zzb);
        this.zzb = zza2;
        this.zzc = zzb;
        this.zzd = DefaultClock.getInstance();
        this.zze = new zzcv(this);
        zzfd zzfdVar = new zzfd(this);
        zzfdVar.zzW();
        this.zzf = zzfdVar;
        zzfd zzm = zzm();
        String str = zzbv.zza;
        zzm.zzL("Google Analytics " + str + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzW();
        this.zzk = zzfjVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzW();
        this.zzj = zzfvVar;
        zzbs zzbsVar = new zzbs(this, zzbyVar);
        zzcp zzcpVar = new zzcp(this);
        zzbk zzbkVar = new zzbk(this);
        zzch zzchVar = new zzch(this);
        zzcz zzczVar = new zzcz(this);
        com.google.android.gms.analytics.zzr zzb2 = com.google.android.gms.analytics.zzr.zzb(zza2);
        zzb2.zzj(new zzbw(this));
        this.zzg = zzb2;
        GoogleAnalytics googleAnalytics = new GoogleAnalytics(this);
        zzcpVar.zzW();
        this.zzm = zzcpVar;
        zzbkVar.zzW();
        this.zzn = zzbkVar;
        zzchVar.zzW();
        this.zzo = zzchVar;
        zzczVar.zzW();
        this.zzp = zzczVar;
        zzda zzdaVar = new zzda(this);
        zzdaVar.zzW();
        this.zzi = zzdaVar;
        zzbsVar.zzW();
        this.zzh = zzbsVar;
        googleAnalytics.zzg();
        this.zzl = googleAnalytics;
        zzbsVar.zzm();
    }

    public static zzbx zzg(Context context) {
        Preconditions.checkNotNull(context);
        if (zza == null) {
            synchronized (zzbx.class) {
                try {
                    if (zza == null) {
                        Clock defaultClock = DefaultClock.getInstance();
                        long elapsedRealtime = defaultClock.elapsedRealtime();
                        zzbx zzbxVar = new zzbx(new zzby(context));
                        zza = zzbxVar;
                        GoogleAnalytics.zzf();
                        long elapsedRealtime2 = defaultClock.elapsedRealtime() - elapsedRealtime;
                        Long l = (Long) zzew.zzQ.zzb();
                        if (elapsedRealtime2 > l.longValue()) {
                            zzbxVar.zzm().zzS("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), l);
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbu zzbuVar) {
        Preconditions.checkNotNull(zzbuVar, "Analytics service not created/initialized");
        Preconditions.checkArgument(zzbuVar.zzX(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final GoogleAnalytics zzc() {
        Preconditions.checkNotNull(this.zzl);
        Preconditions.checkArgument(this.zzl.zzj(), "Analytics instance not initialized");
        return this.zzl;
    }

    public final com.google.android.gms.analytics.zzr zzd() {
        Preconditions.checkNotNull(this.zzg);
        return this.zzg;
    }

    public final zzbk zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbs zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzch zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcp zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzcv zzj() {
        return this.zze;
    }

    public final zzcz zzk() {
        return this.zzp;
    }

    public final zzda zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfd zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfd zzn() {
        return this.zzf;
    }

    public final zzfj zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfj zzp() {
        zzfj zzfjVar = this.zzk;
        if (zzfjVar == null || !zzfjVar.zzX()) {
            return null;
        }
        return zzfjVar;
    }

    public final zzfv zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final Clock zzr() {
        return this.zzd;
    }
}
