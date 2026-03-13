package com.google.android.recaptcha.internal;

import java.math.BigInteger;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzhv {
    @NotNull
    private static final zzhu zza = new zzhu(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    @NotNull
    private final zzhu zzb;
    private long zzc;

    public zzhv(long j, long j2, @NotNull zzhu zzhuVar) {
        this.zzb = zzhuVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzhu zzhuVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzhuVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzhuVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
