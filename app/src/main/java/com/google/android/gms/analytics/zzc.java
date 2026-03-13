package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
/* loaded from: classes3.dex */
final class zzc implements Runnable {
    final /* synthetic */ BroadcastReceiver.PendingResult zza;

    public zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.zza;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
