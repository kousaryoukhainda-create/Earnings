package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.ContainerUtils;
@Deprecated
/* loaded from: classes3.dex */
public class zzafp implements zzax {
    public static final Parcelable.Creator<zzafp> CREATOR = new zzafo();
    public final String zza;
    public final String zzb;

    public zzafp(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            if (this.zza.equals(zzafpVar.zza) && this.zzb.equals(zzafpVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + ((this.zza.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + ContainerUtils.KEY_VALUE_DELIMITER + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return;
                        }
                        zzatVar.zzh(this.zzb);
                        return;
                    }
                    zzatVar.zzc(this.zzb);
                    return;
                }
                zzatVar.zzd(this.zzb);
                return;
            }
            zzatVar.zze(this.zzb);
            return;
        }
        zzatVar.zzq(this.zzb);
    }

    public zzafp(String str, String str2) {
        this.zza = zzftt.zzb(str);
        this.zzb = str2;
    }
}
