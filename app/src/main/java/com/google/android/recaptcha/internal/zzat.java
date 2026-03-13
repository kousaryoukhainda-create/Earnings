package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
final class zzat extends AbstractC1431gG implements InterfaceC0263Ez {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map;
        map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2062lJ.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
