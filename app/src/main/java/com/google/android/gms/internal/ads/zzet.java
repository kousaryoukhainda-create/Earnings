package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public final class zzet implements zzax {
    public static final Parcelable.Creator<zzet> CREATOR = new zzer();
    public final float zza;
    public final float zzb;

    public zzet(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        zzcw.zze(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzet.class == obj.getClass()) {
            zzet zzetVar = (zzet) obj;
            if (this.zza == zzetVar.zza && this.zzb == zzetVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }

    public /* synthetic */ zzet(Parcel parcel, zzes zzesVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
