package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzos {
    public static final /* synthetic */ int zza = 0;
    private static final zzos zzb = new zzos();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzox zzc = new zzoa();

    private zzos() {
    }

    public static zzos zza() {
        return zzb;
    }

    public final zzow zzb(Class cls) {
        zznl.zzc(cls, "messageType");
        zzow zzowVar = (zzow) this.zzd.get(cls);
        if (zzowVar == null) {
            zzowVar = this.zzc.zza(cls);
            zznl.zzc(cls, "messageType");
            zzow zzowVar2 = (zzow) this.zzd.putIfAbsent(cls, zzowVar);
            if (zzowVar2 != null) {
                return zzowVar2;
            }
        }
        return zzowVar;
    }
}
