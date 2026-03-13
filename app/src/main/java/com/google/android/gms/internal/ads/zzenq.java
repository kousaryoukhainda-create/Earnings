package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* loaded from: classes3.dex */
public final class zzenq implements zzetq {
    private final Integer zza;

    private zzenq(Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzenq zzc(VersionInfoParcel versionInfoParcel) {
        int i;
        int extensionVersion;
        int extensionVersion2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            int i2 = 0;
            try {
                i = Build.VERSION.SDK_INT;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
            }
            if (i >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion2 > 3) {
                    i2 = SdkExtensions.getExtensionVersion(1000000);
                    return new zzenq(Integer.valueOf(i2));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjW)).booleanValue()) {
                if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjV)).intValue() && i >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i2 = SdkExtensions.getExtensionVersion(31);
                    }
                }
            }
            return new zzenq(Integer.valueOf(i2));
        }
        return new zzenq(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (num != null) {
            zzcuvVar.zza.putInt("aos", num.intValue());
        }
    }
}
