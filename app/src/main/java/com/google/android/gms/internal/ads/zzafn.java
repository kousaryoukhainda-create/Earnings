package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzafn implements zzax {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafn(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzafn zzb(zzdy zzdyVar) {
        int zzg = zzdyVar.zzg();
        String zze = zzbb.zze(zzdyVar.zzB(zzdyVar.zzg(), StandardCharsets.US_ASCII));
        String zzB = zzdyVar.zzB(zzdyVar.zzg(), StandardCharsets.UTF_8);
        int zzg2 = zzdyVar.zzg();
        int zzg3 = zzdyVar.zzg();
        int zzg4 = zzdyVar.zzg();
        int zzg5 = zzdyVar.zzg();
        int zzg6 = zzdyVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzdyVar.zzH(bArr, 0, zzg6);
        return new zzafn(zzg, zze, zzB, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafnVar = (zzafn) obj;
            if (this.zza == zzafnVar.zza && this.zzb.equals(zzafnVar.zzb) && this.zzc.equals(zzafnVar.zzc) && this.zzd == zzafnVar.zzd && this.zze == zzafnVar.zze && this.zzf == zzafnVar.zzf && this.zzg == zzafnVar.zzg && Arrays.equals(this.zzh, zzafnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + ((this.zza + 527) * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        return Arrays.hashCode(this.zzh) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        zzatVar.zza(this.zzh, this.zza);
    }

    public zzafn(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
