package defpackage;

import android.media.metrics.LogSessionId;
/* renamed from: hS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529hS {
    public static final C1529hS b;
    public final LogSessionId a;

    static {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        b = new C1529hS(logSessionId);
    }

    public C1529hS(LogSessionId logSessionId) {
        this.a = logSessionId;
    }
}
