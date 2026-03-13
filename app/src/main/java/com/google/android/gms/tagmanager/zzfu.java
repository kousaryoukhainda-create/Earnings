package com.google.android.gms.tagmanager;

import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public final class zzfu {
    private static final Long zza = new Long(0);
    private static final Double zzb = new Double(0.0d);
    private static final zzft zzc = zzft.zzd(0);
    private static final String zzd;
    private static final Boolean zze;
    private static final List zzf;
    private static final Map zzg;
    private static final com.google.android.gms.internal.gtm.zzam zzh;

    static {
        String str = new String("");
        zzd = str;
        zze = new Boolean(false);
        zzf = new ArrayList(0);
        zzg = new HashMap();
        zzh = zzb(str);
    }

    public static com.google.android.gms.internal.gtm.zzam zza() {
        return zzh;
    }

    public static com.google.android.gms.internal.gtm.zzam zzb(Object obj) {
        String cls;
        com.google.android.gms.internal.gtm.zzan zzg2 = com.google.android.gms.internal.gtm.zzam.zzg();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        zzg2.zzt(zzatVar);
        if (obj instanceof com.google.android.gms.internal.gtm.zzam) {
            return (com.google.android.gms.internal.gtm.zzam) obj;
        }
        boolean z = false;
        if (obj instanceof String) {
            zzg2.zzt(zzatVar);
            zzg2.zzs((String) obj);
        } else if (obj instanceof List) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.LIST);
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            boolean z2 = false;
            for (Object obj2 : list) {
                com.google.android.gms.internal.gtm.zzam zzb2 = zzb(obj2);
                com.google.android.gms.internal.gtm.zzam zzamVar = zzh;
                if (zzb2 == zzamVar) {
                    return zzamVar;
                }
                if (z2 || zzb2.zzP()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(zzb2);
            }
            zzg2.zzj();
            zzg2.zzb(arrayList);
            z = z2;
        } else if (obj instanceof Map) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.MAP);
            Set<Map.Entry> entrySet = ((Map) obj).entrySet();
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            ArrayList arrayList3 = new ArrayList(entrySet.size());
            boolean z3 = false;
            for (Map.Entry entry : entrySet) {
                com.google.android.gms.internal.gtm.zzam zzb3 = zzb(entry.getKey());
                com.google.android.gms.internal.gtm.zzam zzb4 = zzb(entry.getValue());
                com.google.android.gms.internal.gtm.zzam zzamVar2 = zzh;
                if (zzb3 != zzamVar2 && zzb4 != zzamVar2) {
                    if (z3 || zzb3.zzP() || zzb4.zzP()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList2.add(zzb3);
                    arrayList3.add(zzb4);
                } else {
                    return zzamVar2;
                }
            }
            zzg2.zzk();
            zzg2.zzc(arrayList2);
            zzg2.zzl();
            zzg2.zzd(arrayList3);
            z = z3;
        } else if (zzq(obj)) {
            zzg2.zzt(zzatVar);
            zzg2.zzs(obj.toString());
        } else if (zzr(obj)) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.INTEGER);
            zzg2.zzq(zzo(obj));
        } else if (obj instanceof Boolean) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.BOOLEAN);
            zzg2.zzn(((Boolean) obj).booleanValue());
        } else {
            if (obj == null) {
                cls = "null";
            } else {
                cls = obj.getClass().toString();
            }
            Log.e("GoogleTagManager", "Converting to Value from unknown object type: ".concat(String.valueOf(cls)));
            return zzh;
        }
        zzg2.zzo(z);
        return (com.google.android.gms.internal.gtm.zzam) zzg2.zzD();
    }

    public static zzft zzc() {
        return zzc;
    }

    public static zzft zzd(Object obj) {
        if (obj instanceof zzft) {
            return (zzft) obj;
        }
        if (zzr(obj)) {
            return zzft.zzd(zzo(obj));
        }
        if (zzq(obj)) {
            return zzft.zzc(Double.valueOf(zzn(obj)));
        }
        return zzp(zzm(obj));
    }

    public static Boolean zze() {
        return zze;
    }

    public static Boolean zzf(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String zzm = zzm(obj);
        if (InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase(zzm)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(zzm)) {
            return Boolean.FALSE;
        }
        return zze;
    }

    public static Double zzg() {
        return zzb;
    }

    public static Double zzh(Object obj) {
        if (zzq(obj)) {
            return Double.valueOf(zzn(obj));
        }
        zzft zzp = zzp(zzm(obj));
        if (zzp == zzc) {
            return zzb;
        }
        return Double.valueOf(zzp.doubleValue());
    }

    public static Long zzi() {
        return zza;
    }

    public static Long zzj(Object obj) {
        if (zzr(obj)) {
            return Long.valueOf(zzo(obj));
        }
        zzft zzp = zzp(zzm(obj));
        if (zzp == zzc) {
            return zza;
        }
        return Long.valueOf(zzp.zzb());
    }

    public static Object zzk(com.google.android.gms.internal.gtm.zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        switch (zzamVar.zzh().ordinal()) {
            case 0:
                return zzamVar.zzq();
            case 1:
                ArrayList arrayList = new ArrayList(zzamVar.zza());
                for (com.google.android.gms.internal.gtm.zzam zzamVar2 : zzamVar.zzs()) {
                    Object zzk = zzk(zzamVar2);
                    if (zzk == null) {
                        return null;
                    }
                    arrayList.add(zzk);
                }
                return arrayList;
            case 2:
                if (zzamVar.zzc() != zzamVar.zzd()) {
                    Log.e("GoogleTagManager", "Converting an invalid value to object: ".concat(zzamVar.toString()));
                    return null;
                }
                HashMap hashMap = new HashMap(zzamVar.zzd());
                for (int i = 0; i < zzamVar.zzc(); i++) {
                    Object zzk2 = zzk(zzamVar.zzl(i));
                    Object zzk3 = zzk(zzamVar.zzm(i));
                    if (zzk2 == null || zzk3 == null) {
                        return null;
                    }
                    hashMap.put(zzk2, zzk3);
                }
                return hashMap;
            case 3:
                Log.e("GoogleTagManager", "Trying to convert a macro reference to object");
                return null;
            case 4:
                Log.e("GoogleTagManager", "Trying to convert a function id to object");
                return null;
            case 5:
                return Long.valueOf(zzamVar.zzf());
            case 6:
                StringBuilder sb = new StringBuilder();
                for (com.google.android.gms.internal.gtm.zzam zzamVar3 : zzamVar.zzt()) {
                    String zzm = zzm(zzk(zzamVar3));
                    if (zzm == zzd) {
                        return null;
                    }
                    sb.append(zzm);
                }
                return sb.toString();
            case 7:
                return Boolean.valueOf(zzamVar.zzO());
            default:
                Log.e("GoogleTagManager", "Failed to convert a value of type: ".concat(String.valueOf(zzamVar.zzh())));
                return null;
        }
    }

    public static String zzl() {
        return zzd;
    }

    public static String zzm(Object obj) {
        if (obj == null) {
            return zzd;
        }
        return obj.toString();
    }

    private static double zzn(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        Log.e("GoogleTagManager", "getDouble received non-Number");
        return 0.0d;
    }

    private static long zzo(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        Log.e("GoogleTagManager", "getInt64 received non-Number");
        return 0L;
    }

    private static zzft zzp(String str) {
        try {
            return zzft.zze(str);
        } catch (NumberFormatException unused) {
            Log.e("GoogleTagManager", "Failed to convert '" + str + "' to a number.");
            return zzc;
        }
    }

    private static boolean zzq(Object obj) {
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        if ((obj instanceof zzft) && ((zzft) obj).zzf()) {
            return true;
        }
        return false;
    }

    private static boolean zzr(Object obj) {
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return true;
        }
        if ((obj instanceof zzft) && ((zzft) obj).zzg()) {
            return true;
        }
        return false;
    }
}
