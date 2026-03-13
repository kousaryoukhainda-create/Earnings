package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes3.dex */
final class zzec extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.REGEX_GROUP.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ARG1.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.IGNORE_CASE.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.GROUP.toString();

    public zzec() {
        super(zza, zzb, zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        int i;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar != null && zzamVar != zzfu.zza() && zzamVar2 != null && zzamVar2 != zzfu.zza()) {
            int i2 = 1;
            if (true != zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzd))).booleanValue()) {
                i = 64;
            } else {
                i = 66;
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
            if (zzamVar3 != null) {
                Long zzj = zzfu.zzj(zzfu.zzk(zzamVar3));
                if (zzj == zzfu.zzi()) {
                    return zzfu.zza();
                }
                i2 = zzj.intValue();
                if (i2 < 0) {
                    return zzfu.zza();
                }
            }
            try {
                Matcher matcher = Pattern.compile(zzfu.zzm(zzfu.zzk(zzamVar2)), i).matcher(zzfu.zzm(zzfu.zzk(zzamVar)));
                String str = null;
                if (matcher.find() && matcher.groupCount() >= i2) {
                    str = matcher.group(i2);
                }
                if (str == null) {
                    return zzfu.zza();
                }
                return zzfu.zzb(str);
            } catch (PatternSyntaxException unused) {
                return zzfu.zza();
            }
        }
        return zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
