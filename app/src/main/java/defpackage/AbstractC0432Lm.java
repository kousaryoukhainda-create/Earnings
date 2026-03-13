package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* renamed from: Lm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0432Lm {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, i6] */
    public static C1873j6 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C1873j6.d;
        }
        ?? obj = new Object();
        obj.a = true;
        obj.c = z;
        return obj.a();
    }
}
