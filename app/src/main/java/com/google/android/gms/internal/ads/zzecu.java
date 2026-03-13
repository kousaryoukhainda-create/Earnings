package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes3.dex */
public final class zzecu {
    private final Context zza;

    public zzecu(Context context) {
        this.zza = context;
    }

    public final InterfaceFutureC2490qH zza(boolean z) {
        try {
            Intrinsics.checkNotNullParameter(MobileAds.ERROR_DOMAIN, "adsSdkName");
            SA sa = new SA(z);
            C2478q70 a = C2478q70.a(this.zza);
            if (a != null) {
                return a.b(sa);
            }
            return zzgch.zzg(new IllegalStateException());
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }
}
