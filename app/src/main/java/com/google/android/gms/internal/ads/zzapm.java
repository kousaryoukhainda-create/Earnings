package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class zzapm implements Comparable {
    private final zzapx zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzapq zzf;
    private Integer zzg;
    private zzapp zzh;
    private boolean zzi;
    private zzaov zzj;
    private zzapl zzk;
    private final zzapa zzl;

    public zzapm(int i, String str, zzapq zzapqVar) {
        zzapx zzapxVar;
        Uri parse;
        String host;
        if (zzapx.zza) {
            zzapxVar = new zzapx();
        } else {
            zzapxVar = null;
        }
        this.zza = zzapxVar;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzapqVar;
        this.zzl = new zzapa();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzapm) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaov zzd() {
        return this.zzj;
    }

    public final zzapm zze(zzaov zzaovVar) {
        this.zzj = zzaovVar;
        return this;
    }

    public final zzapm zzf(zzapp zzappVar) {
        this.zzh = zzappVar;
        return this;
    }

    public final zzapm zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public abstract zzaps zzh(zzapi zzapiVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i != 0) {
            return AbstractC0324Hi.g(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaou {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzapx.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapv zzapvVar) {
        zzapq zzapqVar;
        synchronized (this.zze) {
            zzapqVar = this.zzf;
        }
        zzapqVar.zza(zzapvVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzapp zzappVar = this.zzh;
        if (zzappVar != null) {
            zzappVar.zzb(this);
        }
        if (zzapx.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapk(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzk;
        }
        if (zzaplVar != null) {
            zzaplVar.zza(this);
        }
    }

    public final void zzs(zzaps zzapsVar) {
        zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzk;
        }
        if (zzaplVar != null) {
            zzaplVar.zzb(this, zzapsVar);
        }
    }

    public final void zzt(int i) {
        zzapp zzappVar = this.zzh;
        if (zzappVar != null) {
            zzappVar.zzc(this, i);
        }
    }

    public final void zzu(zzapl zzaplVar) {
        synchronized (this.zze) {
            this.zzk = zzaplVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaou {
        return null;
    }

    public final zzapa zzy() {
        return this.zzl;
    }
}
