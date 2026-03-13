package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public final class zzgdp {
    private final OutputStream zza;

    private zzgdp(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgdp zzb(OutputStream outputStream) {
        return new zzgdp(outputStream);
    }

    public final void zza(zzgsx zzgsxVar) throws IOException {
        try {
            zzgsxVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
