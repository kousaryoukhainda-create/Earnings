package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzho implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhq zza;
    private final Handler zzb;

    public zzho(zzhq zzhqVar, Handler handler) {
        this.zza = zzhqVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhn
            @Override // java.lang.Runnable
            public final void run() {
                zzhq.zzc(zzho.this.zza, i);
            }
        });
    }
}
