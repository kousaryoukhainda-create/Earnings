package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzlq {
    static final zzlq zza = new zzlq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlq zzd;
    private final Map zze;

    public zzlq() {
        this.zze = new HashMap();
    }

    public static zzlq zza() {
        zzlq zzlqVar = zzd;
        if (zzlqVar != null) {
            return zzlqVar;
        }
        synchronized (zzlq.class) {
            try {
                zzlq zzlqVar2 = zzd;
                if (zzlqVar2 != null) {
                    return zzlqVar2;
                }
                int i = zznt.zza;
                zzlq zzb2 = zzly.zzb(zzlq.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzmd zzb(zznl zznlVar, int i) {
        return (zzmd) this.zze.get(new zzlp(zznlVar, i));
    }

    public zzlq(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
