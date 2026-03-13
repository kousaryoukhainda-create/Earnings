package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Locale;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzdb extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.LANGUAGE.toString();

    public zzdb() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return zzfu.zza();
        }
        String language = locale.getLanguage();
        if (language == null) {
            return zzfu.zza();
        }
        return zzfu.zzb(language.toLowerCase());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
