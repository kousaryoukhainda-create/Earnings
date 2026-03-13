package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzay extends com.google.android.gms.analytics.zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.zza);
        hashMap.put("source", this.zzb);
        hashMap.put("medium", this.zzc);
        hashMap.put("keyword", this.zzd);
        hashMap.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.zze);
        hashMap.put("id", this.zzf);
        hashMap.put("adNetworkId", this.zzg);
        hashMap.put("gclid", this.zzh);
        hashMap.put("dclid", this.zzi);
        hashMap.put("aclid", this.zzj);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzay zzayVar = (zzay) zzjVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzayVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzayVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzayVar.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzayVar.zzd = this.zzd;
        }
        if (!TextUtils.isEmpty(this.zze)) {
            zzayVar.zze = this.zze;
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            zzayVar.zzf = this.zzf;
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzayVar.zzg = this.zzg;
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            zzayVar.zzh = this.zzh;
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            zzayVar.zzi = this.zzi;
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            zzayVar.zzj = this.zzj;
        }
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zza;
    }

    public final String zzm() {
        return this.zzb;
    }

    public final void zzn(String str) {
        this.zzj = str;
    }

    public final void zzo(String str) {
        this.zzg = str;
    }

    public final void zzp(String str) {
        this.zze = str;
    }

    public final void zzq(String str) {
        this.zzi = str;
    }

    public final void zzr(String str) {
        this.zzh = str;
    }

    public final void zzs(String str) {
        this.zzf = str;
    }

    public final void zzt(String str) {
        this.zzd = str;
    }

    public final void zzu(String str) {
        this.zzc = str;
    }

    public final void zzv(String str) {
        this.zza = str;
    }

    public final void zzw(String str) {
        this.zzb = str;
    }
}
