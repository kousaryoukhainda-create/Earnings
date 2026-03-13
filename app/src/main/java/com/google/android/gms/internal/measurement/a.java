package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static zzao a(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(AbstractC0324Hi.f(zzaoVar.zzc(), " is not a function"));
        } else if ("hasOwnProperty".equals(zzaoVar.zzc())) {
            zzh.zza("hasOwnProperty", 1, list);
            if (zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc())) {
                return zzao.zzk;
            }
            return zzao.zzl;
        } else {
            throw new IllegalArgumentException(AbstractC2437ph.g("Object has no function ", zzaoVar.zzc()));
        }
    }

    public static Iterator b(Map map) {
        return new zzaj(map.keySet().iterator());
    }
}
