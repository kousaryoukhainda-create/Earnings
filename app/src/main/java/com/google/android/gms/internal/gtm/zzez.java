package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzez {
    private final Map zza;
    private final List zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzez(zzbt zzbtVar, Map map, long j, boolean z) {
        this(zzbtVar, map, j, z, 0L, 0, null);
    }

    public static zzez zze(zzbt zzbtVar, zzez zzezVar, Map map) {
        return new zzez(zzbtVar, map, zzezVar.zzd, zzezVar.zzf, zzezVar.zzc, zzezVar.zze, zzezVar.zzb);
    }

    private final String zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(!str.startsWith(ContainerUtils.FIELD_DELIMITER), "Short param name required");
        String str3 = (String) this.zza.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    private static String zzj(zzbt zzbtVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith(ContainerUtils.FIELD_DELIMITER)) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            zzbtVar.zzS("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzk(zzbt zzbtVar, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            zzbtVar.zzS("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith(ContainerUtils.FIELD_DELIMITER);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ht=");
        sb.append(this.zzd);
        if (this.zzc != 0) {
            sb.append(", dbId=");
            sb.append(this.zzc);
        }
        if (this.zze != 0) {
            sb.append(", appUID=");
            sb.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            AbstractC0324Hi.w(sb, ", ", str, ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append((String) this.zza.get(str));
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfu.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", "");
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public zzez(zzbt zzbtVar, Map map, long j, boolean z, long j2, int i, List list) {
        String str;
        String zzj;
        String zzj2;
        Preconditions.checkNotNull(zzbtVar);
        Preconditions.checkNotNull(map);
        this.zzd = j;
        this.zzf = z;
        this.zzc = j2;
        this.zze = i;
        this.zzb = list != null ? list : Collections.emptyList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzcr zzcrVar = (zzcr) it.next();
                if ("appendVersion".equals(zzcrVar.zza())) {
                    str = zzcrVar.zzb();
                    break;
                }
            }
        }
        str = null;
        this.zzg = true != TextUtils.isEmpty(str) ? str : null;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (zzj2 = zzj(zzbtVar, entry.getKey())) != null) {
                hashMap.put(zzj2, zzk(zzbtVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (zzj = zzj(zzbtVar, entry2.getKey())) != null) {
                hashMap.put(zzj, zzk(zzbtVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfu.zzg(hashMap, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(hashMap);
    }
}
