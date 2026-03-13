package com.google.android.recaptcha.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbc {
    @NotNull
    public static final zzbd zza(@NotNull zztv zztvVar) {
        Map map;
        map = zzbd.zzb;
        zzbd zzbdVar = (zzbd) map.get(zztvVar);
        if (zzbdVar == null) {
            return new zzbd(zzbb.zza, zzba.zzaq, null);
        }
        return zzbdVar;
    }
}
