package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
public class zzgyg extends IOException {
    private boolean zza;

    public zzgyg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzgyg(String str) {
        super(str);
    }
}
