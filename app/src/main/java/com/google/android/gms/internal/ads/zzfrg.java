package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzfrg {
    private static zzfrg zzb;
    final zzfrc zza;

    private zzfrg(Context context) {
        this.zza = zzfrc.zzb(context);
        zzfrb.zza(context);
    }

    public static final zzfrg zza(Context context) {
        zzfrg zzfrgVar;
        synchronized (zzfrg.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfrg(context);
                }
                zzfrgVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrgVar;
    }

    public final void zzb(zzfra zzfraVar) throws IOException {
        synchronized (zzfrg.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
