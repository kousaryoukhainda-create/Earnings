package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes3.dex */
public final class zzbda {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbda(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcx zzf() {
        return new zzbcx(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), null, null);
    }

    public final zzbcz zza() {
        zzbcz zzbczVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbcx zzbcxVar : this.zza) {
                    long zza = zzbcxVar.zza();
                    String zzc = zzbcxVar.zzc();
                    zzbcx zzb = zzbcxVar.zzb();
                    if (zzb != null && zza > 0) {
                        sb.append(zzc);
                        sb.append('.');
                        sb.append(zza - zzb.zza());
                        sb.append(',');
                        if (booleanValue) {
                            if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                                hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                            } else {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                                sb2.append('+');
                                sb2.append(zzc);
                            }
                        }
                    }
                }
                this.zza.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbczVar = new zzbcz(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbczVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbda zzbdaVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcq zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) != null) {
            synchronized (this.zzc) {
                zzbcw zza = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbcx zzbcxVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcx(j, strArr[0], zzbcxVar));
        }
        return true;
    }
}
