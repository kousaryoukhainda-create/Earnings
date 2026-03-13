package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes3.dex */
public class zzbv {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfxn zzh;
    private final zzfxn zzi;
    private final zzfxn zzj;
    private final int zzk;
    private final int zzl;
    private final zzfxn zzm;
    private final zzbu zzn;
    private zzfxn zzo;
    private int zzp;
    private final HashMap zzq;
    private final HashSet zzr;

    @Deprecated
    public zzbv() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfxn.zzn();
        this.zzi = zzfxn.zzn();
        this.zzj = zzfxn.zzn();
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = zzfxn.zzn();
        this.zzn = zzbu.zza;
        this.zzo = zzfxn.zzn();
        this.zzp = 0;
        this.zzq = new HashMap();
        this.zzr = new HashSet();
    }

    public final zzbv zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzei.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzp = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzo = zzfxn.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzbv zzf(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public zzbv(zzbw zzbwVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzbwVar.zzi;
        this.zzf = zzbwVar.zzj;
        this.zzg = zzbwVar.zzk;
        this.zzh = zzbwVar.zzl;
        this.zzi = zzbwVar.zzm;
        this.zzj = zzbwVar.zzo;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = zzbwVar.zzs;
        this.zzn = zzbwVar.zzt;
        this.zzo = zzbwVar.zzu;
        this.zzp = zzbwVar.zzv;
        this.zzr = new HashSet(zzbwVar.zzC);
        this.zzq = new HashMap(zzbwVar.zzB);
    }
}
