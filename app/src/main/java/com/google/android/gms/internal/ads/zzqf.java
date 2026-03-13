package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqf {
    private final AudioTrack zza;
    private final zzon zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqe
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqf.zza(zzqf.this, audioRouting);
        }
    };

    public zzqf(AudioTrack audioTrack, zzon zzonVar) {
        this.zza = audioTrack;
        this.zzb = zzonVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzqf zzqfVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (zzqfVar.zzc != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                zzon zzonVar = zzqfVar.zzb;
                routedDevice2 = audioRouting.getRoutedDevice();
                zzonVar.zzh(routedDevice2);
            }
        }
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(Qi0.e(onRoutingChangedListener));
        this.zzc = null;
    }
}
