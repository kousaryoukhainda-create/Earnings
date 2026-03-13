package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
/* renamed from: wK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3008wK {
    public static void a(C2063lK c2063lK, C1615iS c1615iS) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        C1529hS c1529hS = c1615iS.b;
        c1529hS.getClass();
        LogSessionId logSessionId2 = c1529hS.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = c2063lK.b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
