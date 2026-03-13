package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* renamed from: Mm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0457Mm {
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, i6] */
    public static C1873j6 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport;
        boolean z2;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C1873j6.d;
        }
        ?? obj = new Object();
        if (Ha0.a > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        obj.a = true;
        obj.b = z2;
        obj.c = z;
        return obj.a();
    }
}
