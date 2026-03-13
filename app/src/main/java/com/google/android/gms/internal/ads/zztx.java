package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class zztx {
    private static final AtomicLong zza = new AtomicLong();

    public zztx(long j, zzgd zzgdVar, Uri uri, Map map, long j2, long j3, long j4) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zztx(long j, zzgd zzgdVar, long j2) {
        Uri uri = zzgdVar.zza;
        Collections.emptyMap();
    }
}
