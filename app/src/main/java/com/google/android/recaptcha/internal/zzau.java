package com.google.android.recaptcha.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzau {
    @NotNull
    public static final zzav zza() {
        zzav zzavVar;
        InterfaceC0263Ez interfaceC0263Ez;
        Map map;
        zzavVar = zzav.zzb;
        if (zzavVar == null) {
            interfaceC0263Ez = zzav.zzd;
            zzav zzavVar2 = new zzav((Map) interfaceC0263Ez.invoke(), null);
            map = zzav.zzc;
            map.clear();
            zzav.zzb = zzavVar2;
            return zzavVar2;
        }
        return zzavVar;
    }
}
