package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;
/* loaded from: classes3.dex */
final class zzaas extends zzaat {
    public zzaas(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzaau.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzd(Object obj, long j, byte b) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j, b);
        } else {
            zzaau.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final boolean zzg(Object obj, long j) {
        if (zzaau.zzb) {
            return zzaau.zzt(obj, j);
        }
        return zzaau.zzu(obj, j);
    }
}
