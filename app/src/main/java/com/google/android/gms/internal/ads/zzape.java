package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class zzape {
    private final String zza;
    private final String zzb;

    public zzape(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzape.class == obj.getClass()) {
            zzape zzapeVar = (zzape) obj;
            if (TextUtils.equals(this.zza, zzapeVar.zza) && TextUtils.equals(this.zzb, zzapeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.zza);
        sb.append(",value=");
        return AbstractC0324Hi.h(sb, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
