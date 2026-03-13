package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes3.dex */
public final class zzaz {
    private final String zza;
    private final String zzb;
    private final zzbyy zzc;

    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        String str;
        String str2;
        zzbyy zzbyyVar;
        str = zzaxVar.zza;
        this.zza = str;
        str2 = zzaxVar.zzb;
        this.zzb = str2;
        zzbyyVar = zzaxVar.zzc;
        this.zzc = zzbyyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbbq.zza.EnumC0113zza zza() {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return zzbbq.zza.EnumC0113zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbbq.zza.EnumC0113zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbbq.zza.EnumC0113zza.AD_LOADER;
            }
            return zzbbq.zza.EnumC0113zza.INTERSTITIAL;
        }
        return zzbbq.zza.EnumC0113zza.BANNER;
    }

    public final zzbyy zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
