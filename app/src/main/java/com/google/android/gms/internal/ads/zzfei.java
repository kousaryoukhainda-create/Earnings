package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzfei implements zzfeg {
    private final String zza;

    public zzfei(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfei)) {
            return false;
        }
        return this.zza.equals(((zzfei) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
