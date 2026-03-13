package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes3.dex */
final class zzed extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.REGEX.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.IGNORE_CASE.toString();

    public zzed() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    public final boolean zzc(String str, String str2, Map map) {
        int i;
        if (true != zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzb))).booleanValue()) {
            i = 64;
        } else {
            i = 66;
        }
        try {
            return Pattern.compile(str2, i).matcher(str).find();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}
