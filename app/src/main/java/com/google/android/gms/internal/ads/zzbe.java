package com.google.android.gms.internal.ads;

import java.util.Locale;
/* loaded from: classes3.dex */
public final class zzbe {
    public static final zzbe zza = new zzbe(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbe(float f, float f2) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        zzcw.zzd(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbe.class == obj.getClass()) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzc) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j) {
        return j * this.zzd;
    }
}
