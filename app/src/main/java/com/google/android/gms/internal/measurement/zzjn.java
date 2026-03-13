package com.google.android.gms.internal.measurement;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjn extends zzkg {
    private final Context zza;
    private final X40 zzb;

    public zzjn(Context context, X40 x40) {
        this.zza = context;
        this.zzb = x40;
    }

    public final boolean equals(Object obj) {
        X40 x40;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((x40 = this.zzb) != null ? x40.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        X40 x40 = this.zzb;
        if (x40 == null) {
            hashCode = 0;
        } else {
            hashCode = x40.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        AbstractC2437ph.w(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final X40 zzb() {
        return this.zzb;
    }
}
