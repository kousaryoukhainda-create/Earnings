package com.google.android.gms.internal.measurement;

import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzh {
    public static void zza(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        int size = list.size();
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + size);
    }

    public static void zzb(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        int size = list.size();
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + size);
    }

    public static void zzc(String str, int i, List list) {
        if (list.size() <= i) {
            return;
        }
        int size = list.size();
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + size);
    }

    public static boolean zzd(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double zzd = zzaoVar.zzd();
        if (zzd.isNaN() || zzd.doubleValue() < 0.0d || !zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static zzbk zze(String str) {
        zzbk zzbkVar = null;
        if (str != null && !str.isEmpty()) {
            zzbkVar = zzbk.zza(Integer.parseInt(str));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        throw new IllegalArgumentException(AbstractC2437ph.g("Unsupported commandId ", str));
    }

    public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (zzaoVar instanceof zzah) {
            if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
                return false;
            }
            return zzaoVar.zzd().equals(zzaoVar2.zzd());
        } else if (zzaoVar instanceof zzas) {
            return zzaoVar.zzc().equals(zzaoVar2.zzc());
        } else {
            if (zzaoVar instanceof zzaf) {
                return zzaoVar.zze().equals(zzaoVar2.zze());
            }
            if (zzaoVar != zzaoVar2) {
                return false;
            }
            return true;
        }
    }

    public static int zzg(double d) {
        int i;
        int i2;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return (int) ((i2 * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static long zzh(double d) {
        return zzg(d) & KeyboardMap.kValueMask;
    }

    public static double zzi(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && i != 0) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return i2 * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static Object zzj(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return zzk((zzal) zzaoVar);
        }
        if (zzaoVar instanceof zzae) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((zzae) zzaoVar).iterator();
            while (it.hasNext()) {
                Object zzj = zzj((zzao) it.next());
                if (zzj != null) {
                    arrayList.add(zzj);
                }
            }
            return arrayList;
        } else if (!zzaoVar.zzd().isNaN()) {
            return zzaoVar.zzd();
        } else {
            return zzaoVar.zzc();
        }
    }

    public static Map zzk(zzal zzalVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzalVar.zzb()) {
            Object zzj = zzj(zzalVar.zzk(str));
            if (zzj != null) {
                hashMap.put(str, zzj);
            }
        }
        return hashMap;
    }

    public static int zzl(zzg zzgVar) {
        int zzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (zzg <= 1000000) {
            zzgVar.zze("runtime.counter", new zzah(Double.valueOf(zzg)));
            return zzg;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
}
