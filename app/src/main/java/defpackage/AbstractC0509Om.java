package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* renamed from: Om  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0509Om {
    public static void a(AudioTrack audioTrack, C1245e6 c1245e6) {
        AudioDeviceInfo audioDeviceInfo;
        if (c1245e6 == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = c1245e6.a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
