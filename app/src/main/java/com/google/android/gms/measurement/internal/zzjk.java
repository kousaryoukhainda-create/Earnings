package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzjk {
    public static final zzjk zza = new zzjk(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjk(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzjj.AD_STORAGE, (zzjj) zzh(null));
        enumMap.put((EnumMap) zzjj.ANALYTICS_STORAGE, (zzjj) zzh(null));
        this.zzc = i;
    }

    public static zzjk zza(zzjh zzjhVar, zzjh zzjhVar2, int i) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        enumMap.put((EnumMap) zzjj.AD_STORAGE, (zzjj) zzjhVar);
        enumMap.put((EnumMap) zzjj.ANALYTICS_STORAGE, (zzjj) zzjhVar2);
        return new zzjk(enumMap, -10);
    }

    public static String zzd(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static zzjk zze(Bundle bundle, int i) {
        zzjj[] zzb;
        if (bundle == null) {
            return new zzjk(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            enumMap.put((EnumMap) zzjjVar, (zzjj) zzg(bundle.getString(zzjjVar.zze)));
        }
        return new zzjk(enumMap, i);
    }

    public static zzjk zzf(String str, int i) {
        String str2;
        EnumMap enumMap = new EnumMap(zzjj.class);
        zzjj[] zza2 = zzji.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            zzjj zzjjVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) zzjjVar, (zzjj) zzj(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzjjVar, (zzjj) zzjh.UNINITIALIZED);
            }
        }
        return new zzjk(enumMap, i);
    }

    public static zzjh zzg(String str) {
        if (str == null) {
            return zzjh.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjh.GRANTED;
        }
        if (str.equals("denied")) {
            return zzjh.DENIED;
        }
        return zzjh.UNINITIALIZED;
    }

    public static zzjh zzh(Boolean bool) {
        if (bool == null) {
            return zzjh.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzjh.GRANTED;
        }
        return zzjh.DENIED;
    }

    public static String zzi(zzjh zzjhVar) {
        int ordinal = zzjhVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    public static zzjh zzj(char c) {
        if (c != '+') {
            if (c != '0') {
                if (c != '1') {
                    return zzjh.UNINITIALIZED;
                }
                return zzjh.GRANTED;
            }
            return zzjh.DENIED;
        }
        return zzjh.POLICY;
    }

    public static char zzm(zzjh zzjhVar) {
        if (zzjhVar != null) {
            int ordinal = zzjhVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static boolean zzu(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        zzjj[] zzb;
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            if (this.zzb.get(zzjjVar) != zzjkVar.zzb.get(zzjjVar)) {
                return false;
            }
        }
        if (this.zzc != zzjkVar.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        for (zzjh zzjhVar : this.zzb.values()) {
            i = (i * 31) + zzjhVar.hashCode();
        }
        return i;
    }

    public final String toString() {
        zzjj[] zzb;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzd(this.zzc));
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            sb.append(",");
            sb.append(zzjjVar.zze);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        for (zzjh zzjhVar : this.zzb.values()) {
            if (zzjhVar != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String zzk() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            char c = '-';
            if (zzjhVar != null && (ordinal = zzjhVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c = '0';
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzl() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            sb.append(zzm((zzjh) this.zzb.get(zzjjVar)));
        }
        return sb.toString();
    }

    public final Bundle zzn() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String zzi = zzi((zzjh) entry.getValue());
            if (zzi != null) {
                bundle.putString(((zzjj) entry.getKey()).zze, zzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(zzjj zzjjVar) {
        if (((zzjh) this.zzb.get(zzjjVar)) == zzjh.DENIED) {
            return false;
        }
        return true;
    }

    public final zzjh zzp() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.AD_STORAGE);
        if (zzjhVar == null) {
            return zzjh.UNINITIALIZED;
        }
        return zzjhVar;
    }

    public final zzjh zzq() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.ANALYTICS_STORAGE);
        if (zzjhVar == null) {
            return zzjh.UNINITIALIZED;
        }
        return zzjhVar;
    }

    public final boolean zzr(zzjk zzjkVar) {
        zzjj[] zzjjVarArr;
        EnumMap enumMap = this.zzb;
        for (zzjj zzjjVar : (zzjj[]) enumMap.keySet().toArray(new zzjj[0])) {
            zzjh zzjhVar = (zzjh) enumMap.get(zzjjVar);
            zzjh zzjhVar2 = (zzjh) zzjkVar.zzb.get(zzjjVar);
            zzjh zzjhVar3 = zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzjk zzs(com.google.android.gms.measurement.internal.zzjk r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjj> r1 = com.google.android.gms.measurement.internal.zzjj.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzji r1 = com.google.android.gms.measurement.internal.zzji.STORAGE
            com.google.android.gms.measurement.internal.zzjj[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzjh r5 = (com.google.android.gms.measurement.internal.zzjh) r5
            java.util.EnumMap r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzjh r6 = (com.google.android.gms.measurement.internal.zzjh) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            com.google.android.gms.measurement.internal.zzjh r5 = com.google.android.gms.measurement.internal.zzjh.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.zzjk r9 = new com.google.android.gms.measurement.internal.zzjk
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjk.zzs(com.google.android.gms.measurement.internal.zzjk):com.google.android.gms.measurement.internal.zzjk");
    }

    public final zzjk zzt(zzjk zzjkVar) {
        zzjj[] zzb;
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = (zzjh) zzjkVar.zzb.get(zzjjVar);
            }
            if (zzjhVar != null) {
                enumMap.put((EnumMap) zzjjVar, (zzjj) zzjhVar);
            }
        }
        return new zzjk(enumMap, this.zzc);
    }

    private zzjk(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }
}
