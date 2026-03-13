package com.google.android.gms.tagmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
/* loaded from: classes3.dex */
public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    @Override // com.google.android.gms.analytics.CampaignTrackingReceiver
    public final void zza(@NonNull Context context, @NonNull String str) {
        zzcw.zzd(str);
        zzff.zza(context, "gtm_install_referrer", "referrer", str);
        zzcw.zzc(context, str);
    }
}
