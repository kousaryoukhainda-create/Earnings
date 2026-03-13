package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzhag extends RuntimeException {
    public zzhag(zzgzc zzgzcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyg zza() {
        return new zzgyg(getMessage());
    }
}
