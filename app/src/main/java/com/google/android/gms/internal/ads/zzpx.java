package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes3.dex */
final class zzpx {
    public static void zza(AudioTrack audioTrack, zzoo zzooVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzooVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzooVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
