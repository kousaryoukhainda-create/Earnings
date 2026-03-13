package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: x00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3065x00 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final C2616rl e;
    public final String f;
    public final String g;

    public C3065x00(String sessionId, String firstSessionId, int i, long j, C2616rl dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i;
        this.d = j;
        this.e = dataCollectionStatus;
        this.f = firebaseInstallationId;
        this.g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3065x00)) {
            return false;
        }
        C3065x00 c3065x00 = (C3065x00) obj;
        if (Intrinsics.a(this.a, c3065x00.a) && Intrinsics.a(this.b, c3065x00.b) && this.c == c3065x00.c && this.d == c3065x00.d && Intrinsics.a(this.e, c3065x00.e) && Intrinsics.a(this.f, c3065x00.f) && Intrinsics.a(this.g, c3065x00.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return this.g.hashCode() + AbstractC2437ph.b((this.e.hashCode() + ((((AbstractC2437ph.b(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
