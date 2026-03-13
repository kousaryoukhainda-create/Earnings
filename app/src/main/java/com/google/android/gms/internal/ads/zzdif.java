package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzdif {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private zzbfp zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcex zzi;
    private zzcex zzj;
    private zzcex zzk;
    private zzecr zzl;
    private InterfaceFutureC2490qH zzm;
    private zzcab zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfw zzs;
    private zzbfw zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final Z10 zzv = new Z10();
    private final Z10 zzw = new Z10();
    private List zzf = Collections.emptyList();

    public static zzdif zzag(zzbpp zzbppVar) {
        try {
            zzdie zzak = zzak(zzbppVar.zzg(), null);
            zzbfp zzh = zzbppVar.zzh();
            String zzo = zzbppVar.zzo();
            List zzr = zzbppVar.zzr();
            String zzm = zzbppVar.zzm();
            Bundle zzf = zzbppVar.zzf();
            String zzn = zzbppVar.zzn();
            IObjectWrapper zzl = zzbppVar.zzl();
            String zzq = zzbppVar.zzq();
            String zzp = zzbppVar.zzp();
            double zze = zzbppVar.zze();
            zzbfw zzi = zzbppVar.zzi();
            zzdif zzdifVar = new zzdif();
            zzdifVar.zza = 2;
            zzdifVar.zzb = zzak;
            zzdifVar.zzc = zzh;
            zzdifVar.zzd = (View) zzam(zzbppVar.zzj());
            zzdifVar.zzZ("headline", zzo);
            zzdifVar.zze = zzr;
            zzdifVar.zzZ("body", zzm);
            zzdifVar.zzh = zzf;
            zzdifVar.zzZ("call_to_action", zzn);
            zzdifVar.zzo = (View) zzam(zzbppVar.zzk());
            zzdifVar.zzq = zzl;
            zzdifVar.zzZ("store", zzq);
            zzdifVar.zzZ("price", zzp);
            zzdifVar.zzr = zze;
            zzdifVar.zzs = zzi;
            return zzdifVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdif zzah(zzbpq zzbpqVar) {
        try {
            zzdie zzak = zzak(zzbpqVar.zzf(), null);
            zzbfp zzg = zzbpqVar.zzg();
            String zzo = zzbpqVar.zzo();
            List zzp = zzbpqVar.zzp();
            String zzm = zzbpqVar.zzm();
            Bundle zze = zzbpqVar.zze();
            String zzn = zzbpqVar.zzn();
            IObjectWrapper zzk = zzbpqVar.zzk();
            String zzl = zzbpqVar.zzl();
            zzbfw zzh = zzbpqVar.zzh();
            zzdif zzdifVar = new zzdif();
            zzdifVar.zza = 1;
            zzdifVar.zzb = zzak;
            zzdifVar.zzc = zzg;
            zzdifVar.zzd = (View) zzam(zzbpqVar.zzi());
            zzdifVar.zzZ("headline", zzo);
            zzdifVar.zze = zzp;
            zzdifVar.zzZ("body", zzm);
            zzdifVar.zzh = zze;
            zzdifVar.zzZ("call_to_action", zzn);
            zzdifVar.zzo = (View) zzam(zzbpqVar.zzj());
            zzdifVar.zzq = zzk;
            zzdifVar.zzZ("advertiser", zzl);
            zzdifVar.zzt = zzh;
            return zzdifVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdif zzai(zzbpp zzbppVar) {
        try {
            return zzal(zzak(zzbppVar.zzg(), null), zzbppVar.zzh(), (View) zzam(zzbppVar.zzj()), zzbppVar.zzo(), zzbppVar.zzr(), zzbppVar.zzm(), zzbppVar.zzf(), zzbppVar.zzn(), (View) zzam(zzbppVar.zzk()), zzbppVar.zzl(), zzbppVar.zzq(), zzbppVar.zzp(), zzbppVar.zze(), zzbppVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdif zzaj(zzbpq zzbpqVar) {
        try {
            return zzal(zzak(zzbpqVar.zzf(), null), zzbpqVar.zzg(), (View) zzam(zzbpqVar.zzi()), zzbpqVar.zzo(), zzbpqVar.zzp(), zzbpqVar.zzm(), zzbpqVar.zze(), zzbpqVar.zzn(), (View) zzam(zzbpqVar.zzj()), zzbpqVar.zzk(), null, null, -1.0d, zzbpqVar.zzh(), zzbpqVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdie zzak(com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbpt zzbptVar) {
        if (zzebVar == null) {
            return null;
        }
        return new zzdie(zzebVar, zzbptVar);
    }

    private static zzdif zzal(com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbfp zzbfpVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbfw zzbfwVar, String str6, float f) {
        zzdif zzdifVar = new zzdif();
        zzdifVar.zza = 6;
        zzdifVar.zzb = zzebVar;
        zzdifVar.zzc = zzbfpVar;
        zzdifVar.zzd = view;
        zzdifVar.zzZ("headline", str);
        zzdifVar.zze = list;
        zzdifVar.zzZ("body", str2);
        zzdifVar.zzh = bundle;
        zzdifVar.zzZ("call_to_action", str3);
        zzdifVar.zzo = view2;
        zzdifVar.zzq = iObjectWrapper;
        zzdifVar.zzZ("store", str4);
        zzdifVar.zzZ("price", str5);
        zzdifVar.zzr = d;
        zzdifVar.zzs = zzbfwVar;
        zzdifVar.zzZ("advertiser", str6);
        zzdifVar.zzR(f);
        return zzdifVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdif zzt(zzbpt zzbptVar) {
        try {
            return zzal(zzak(zzbptVar.zzj(), zzbptVar), zzbptVar.zzk(), (View) zzam(zzbptVar.zzm()), zzbptVar.zzs(), zzbptVar.zzv(), zzbptVar.zzq(), zzbptVar.zzi(), zzbptVar.zzr(), (View) zzam(zzbptVar.zzn()), zzbptVar.zzo(), zzbptVar.zzu(), zzbptVar.zzt(), zzbptVar.zze(), zzbptVar.zzl(), zzbptVar.zzp(), zzbptVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.getOrDefault(str, null);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        try {
            zzcex zzcexVar = this.zzi;
            if (zzcexVar != null) {
                zzcexVar.destroy();
                this.zzi = null;
            }
            zzcex zzcexVar2 = this.zzj;
            if (zzcexVar2 != null) {
                zzcexVar2.destroy();
                this.zzj = null;
            }
            zzcex zzcexVar3 = this.zzk;
            if (zzcexVar3 != null) {
                zzcexVar3.destroy();
                this.zzk = null;
            }
            InterfaceFutureC2490qH interfaceFutureC2490qH = this.zzm;
            if (interfaceFutureC2490qH != null) {
                interfaceFutureC2490qH.cancel(false);
                this.zzm = null;
            }
            zzcab zzcabVar = this.zzn;
            if (zzcabVar != null) {
                zzcabVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzJ(zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzM(zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzN(String str, zzbfj zzbfjVar) {
        if (zzbfjVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfjVar);
        }
    }

    public final synchronized void zzO(zzcex zzcexVar) {
        this.zzj = zzcexVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcex zzcexVar) {
        this.zzk = zzcexVar;
    }

    public final synchronized void zzU(InterfaceFutureC2490qH interfaceFutureC2490qH) {
        this.zzm = interfaceFutureC2490qH;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzecr zzecrVar) {
        this.zzl = zzecrVar;
    }

    public final synchronized void zzX(zzcab zzcabVar) {
        this.zzn = zzcabVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        this.zzb = zzebVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcex zzcexVar) {
        this.zzi = zzcexVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized Z10 zzh() {
        return this.zzv;
    }

    public final synchronized Z10 zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzk() {
        return this.zzg;
    }

    public final synchronized zzbfp zzl() {
        return this.zzc;
    }

    public final zzbfw zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfv.zzg((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    public final synchronized zzbfw zzn() {
        return this.zzs;
    }

    public final synchronized zzbfw zzo() {
        return this.zzt;
    }

    public final synchronized zzcab zzp() {
        return this.zzn;
    }

    public final synchronized zzcex zzq() {
        return this.zzj;
    }

    public final synchronized zzcex zzr() {
        return this.zzk;
    }

    public final synchronized zzcex zzs() {
        return this.zzi;
    }

    public final synchronized zzecr zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized InterfaceFutureC2490qH zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
