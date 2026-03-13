package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzdpj {
    private final Map zza = new HashMap();

    public final synchronized zzdpi zza(String str) {
        return (zzdpi) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrs zzbrsVar;
        zzdpi zza = zza(str);
        if (zza != null && (zzbrsVar = zza.zzb) != null) {
            return zzbrsVar.toString();
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc(java.lang.String r6, com.google.android.gms.internal.ads.zzfdh r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdpi r0 = new com.google.android.gms.internal.ads.zzdpi     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L1b
        L12:
            com.google.android.gms.internal.ads.zzbrs r2 = r7.zze()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L48
        L19:
            goto L10
        L1b:
            if (r7 != 0) goto L1e
            goto L22
        L1e:
            com.google.android.gms.internal.ads.zzbrs r1 = r7.zzf()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L22
        L22:
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzjk     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L36
            goto L3e
        L36:
            r3 = 0
            if (r7 != 0) goto L3b
        L39:
            r4 = 0
            goto L3e
        L3b:
            r7.zzC()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L39
        L3e:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L48:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpj.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfdh):void");
    }

    public final synchronized void zzd(String str, zzbrd zzbrdVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpi(str, zzbrdVar.zzf(), zzbrdVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
