package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class zzdrc implements zzcyq, zzcxh, zzcvw, zzdee {
    private final zzdrq zza;
    private final zzdsb zzb;
    private final int zzc;

    public zzdrc(zzdrq zzdrqVar, zzdsb zzdsbVar, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzdsbVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j = bundle.getLong(str);
                if (j >= 0) {
                    this.zza.zzc(str, String.valueOf(j));
                }
            }
        }
    }

    private final void zzd(Bundle bundle, zzfxn zzfxnVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && bundle != null) {
            bundle.putLong(zzdre.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            String str2 = "1";
            if (bundle.containsKey("ls")) {
                zzdrq zzdrqVar = this.zza;
                if (true == bundle.getBoolean("ls")) {
                    str = "1";
                } else {
                    str = "0";
                }
                zzdrqVar.zzc("ls", str);
            }
            int size = zzfxnVar.size();
            for (int i = 0; i < size; i++) {
                zzdrf zzdrfVar = (zzdrf) zzfxnVar.get(i);
                long j = bundle.getLong(zzdrfVar.zza().zza(), -1L);
                long j2 = bundle.getLong(zzdrfVar.zzb().zza(), -1L);
                if (j > 0 && j2 > 0) {
                    this.zza.zzc(zzdrfVar.zzc(), String.valueOf(j2 - j));
                }
            }
            zzc(bundle.getBundle("client_sig_latency_key"));
            zzc(bundle.getBundle("gms_sig_latency_key"));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                if (bundle.containsKey("sod_h")) {
                    zzdrq zzdrqVar2 = this.zza;
                    if (true != bundle.getBoolean("sod_h")) {
                        str2 = "0";
                    }
                    zzdrqVar2.zzc("sod_h", str2);
                }
                if (bundle.containsKey("cmr")) {
                    this.zza.zzc("cmr", String.valueOf(bundle.getInt("cmr")));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        this.zza.zze(zzbvkVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        this.zza.zzd(zzfcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgY)).booleanValue()) {
            this.zza.zzc("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    @Override // com.google.android.gms.internal.ads.zzdee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk r5) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrc.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
            this.zza.zzb().put("sgw", String.valueOf(this.zzc));
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", str);
        this.zzb.zzg(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        String str;
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdrf.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmw)).booleanValue()) {
            zzdrq zzdrqVar = this.zza;
            if (true != AbstractC0957bf.P("MUTE_AUDIO")) {
                str = "0";
            } else {
                str = "1";
            }
            zzdrqVar.zzb().put("mafe", str);
        }
        this.zzb.zzg(this.zza.zzb());
    }
}
