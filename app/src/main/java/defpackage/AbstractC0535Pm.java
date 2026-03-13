package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* renamed from: Pm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0535Pm {
    public static void a(AudioTrack audioTrack, C1615iS c1615iS) {
        LogSessionId logSessionId;
        boolean equals;
        C1529hS c1529hS = c1615iS.b;
        c1529hS.getClass();
        LogSessionId logSessionId2 = c1529hS.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
