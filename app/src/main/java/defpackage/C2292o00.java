package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: o00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292o00 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public C2292o00(String sessionId, String firstSessionId, int i, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2292o00)) {
            return false;
        }
        C2292o00 c2292o00 = (C2292o00) obj;
        if (Intrinsics.a(this.a, c2292o00.a) && Intrinsics.a(this.b, c2292o00.b) && this.c == c2292o00.c && this.d == c2292o00.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((AbstractC2437ph.b(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
