package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public final class zzahc implements zzax {
    public static final Parcelable.Creator<zzahc> CREATOR = new zzaha();
    public final float zza;
    public final int zzb;

    public zzahc(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahc.class == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (this.zza == zzahcVar.zza && this.zzb == zzahcVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }

    public /* synthetic */ zzahc(Parcel parcel, zzahb zzahbVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
