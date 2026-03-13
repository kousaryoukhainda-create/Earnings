package com.google.android.gms.internal.ads;

import android.os.IBinder;
/* loaded from: classes3.dex */
final class zzfrv extends zzfsy {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfrv(IBinder iBinder, String str, int i, float f, int i2, int i3, String str2, int i4, String str3, String str4, String str5, zzfru zzfruVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i4;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsy) {
            zzfsy zzfsyVar = (zzfsy) obj;
            if (this.zza.equals(zzfsyVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfsyVar.zzh()) : zzfsyVar.zzh() == null) && this.zzc == zzfsyVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfsyVar.zza())) {
                zzfsyVar.zzb();
                zzfsyVar.zzd();
                zzfsyVar.zzj();
                if (this.zze == zzfsyVar.zze()) {
                    zzfsyVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfsyVar.zzg()) : zzfsyVar.zzg() == null) {
                        zzfsyVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i2 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((floatToIntBits * 1525764945) ^ i2) * (-721379959)) ^ i) * 1000003;
    }

    public final String toString() {
        StringBuilder m = AbstractC0324Hi.m("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        m.append(this.zzb);
        m.append(", layoutGravity=");
        m.append(this.zzc);
        m.append(", layoutVerticalMargin=");
        m.append(this.zzd);
        m.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        m.append(this.zze);
        m.append(", deeplinkUrl=null, adFieldEnifd=");
        return AbstractC0324Hi.h(m, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final String zzk() {
        return null;
    }
}
