package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbfl;
/* loaded from: classes3.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbfl zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3, zzbfl zzbflVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbflVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbfl.zza(this.zza);
    }
}
