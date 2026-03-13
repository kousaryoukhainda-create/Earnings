package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class zzxf {
    static final zzxf zza = new zzxf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzxf zzd;
    private final Map zze;

    public zzxf() {
        this.zze = new HashMap();
    }

    public static zzxf zza() {
        zzxf zzxfVar = zzd;
        if (zzxfVar != null) {
            return zzxfVar;
        }
        synchronized (zzxf.class) {
            try {
                zzxf zzxfVar2 = zzd;
                if (zzxfVar2 != null) {
                    return zzxfVar2;
                }
                zzxf zzb2 = zzxn.zzb(zzxf.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzxt zzb(zzzg zzzgVar, int i) {
        return (zzxt) this.zze.get(new zzxe(zzzgVar, i));
    }

    public zzxf(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
