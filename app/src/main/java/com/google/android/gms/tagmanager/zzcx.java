package com.google.android.gms.tagmanager;

import android.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
final class zzcx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.JOINER.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ITEM_SEPARATOR.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.ESCAPE.toString();

    public zzcx() {
        super(zza, zzb);
    }

    private static final void zzc(Set set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static final String zzd(String str, int i, Set set) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                return str;
            }
            String replace = str.replace("\\", "\\\\");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String ch = ((Character) it.next()).toString();
                replace = replace.replace(ch, "\\".concat(String.valueOf(ch)));
            }
            return replace;
        }
        try {
            return zzfx.zza(str);
        } catch (UnsupportedEncodingException e) {
            Log.e("GoogleTagManager", "Joiner: unsupported encoding", e);
            return str;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str;
        String str2;
        int i;
        boolean z = true;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null) {
            return zzfu.zza();
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar2 != null) {
            str = zzfu.zzm(zzfu.zzk(zzamVar2));
        } else {
            str = "";
        }
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        if (zzamVar3 != null) {
            str2 = zzfu.zzm(zzfu.zzk(zzamVar3));
        } else {
            str2 = ContainerUtils.KEY_VALUE_DELIMITER;
        }
        com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        HashSet hashSet = null;
        if (zzamVar4 != null) {
            String zzm = zzfu.zzm(zzfu.zzk(zzamVar4));
            if ("url".equals(zzm)) {
                i = 2;
            } else if ("backslash".equals(zzm)) {
                hashSet = new HashSet();
                zzc(hashSet, str);
                zzc(hashSet, str2);
                hashSet.remove('\\');
                i = 3;
            } else {
                Log.e("GoogleTagManager", "Joiner: unsupported escape type: ".concat(String.valueOf(zzm)));
                return zzfu.zza();
            }
        } else {
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        int ordinal = zzamVar.zzh().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar)), i, hashSet));
            } else {
                for (int i2 = 0; i2 < zzamVar.zzc(); i2++) {
                    if (i2 > 0) {
                        sb.append(str);
                    }
                    String zzm2 = zzfu.zzm(zzfu.zzk(zzamVar.zzl(i2)));
                    String zzm3 = zzfu.zzm(zzfu.zzk(zzamVar.zzm(i2)));
                    sb.append(zzd(zzm2, i, hashSet));
                    sb.append(str2);
                    sb.append(zzd(zzm3, i, hashSet));
                }
            }
        } else {
            for (com.google.android.gms.internal.gtm.zzam zzamVar5 : zzamVar.zzs()) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar5)), i, hashSet));
                z = false;
            }
        }
        return zzfu.zzb(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
