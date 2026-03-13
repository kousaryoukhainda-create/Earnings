package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzaa {
    private static final AbstractC3001wD zza = AbstractC3001wD.p(3, "_syn", "_err", "_el");
    private String zzb;
    private final long zzc;
    private final Map zzd;

    public zzaa(String str, long j, Map map) {
        this.zzb = str;
        this.zzc = j;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object zzh(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzc != zzaaVar.zzc || !this.zzb.equals(zzaaVar.zzb)) {
            return false;
        }
        return this.zzd.equals(zzaaVar.zzd);
    }

    public final int hashCode() {
        long j = this.zzc;
        return this.zzd.hashCode() + (((this.zzb.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        String obj = this.zzd.toString();
        int length = String.valueOf(str).length();
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        AbstractC0324Hi.w(sb, "Event{name='", str, "', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb = str;
    }

    public final void zzd(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
            return;
        }
        Map map = this.zzd;
        map.put(str, zzh(str, map.get(str), obj));
    }

    public final Object zze(String str) {
        Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final Map zzf() {
        return this.zzd;
    }

    /* renamed from: zzg */
    public final zzaa clone() {
        return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
    }
}
