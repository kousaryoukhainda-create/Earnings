package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: I00  reason: default package */
/* loaded from: classes.dex */
public final class I00 {
    public final String a;

    public I00(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I00) && Intrinsics.a(this.a, ((I00) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ')';
    }
}
