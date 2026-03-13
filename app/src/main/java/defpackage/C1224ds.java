package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: ds  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224ds {
    public final String a;
    public final long b;
    public final Map c;

    public C1224ds(String sessionId, long j, Map additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.a = sessionId;
        this.b = j;
        this.c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224ds)) {
            return false;
        }
        C1224ds c1224ds = (C1224ds) obj;
        if (Intrinsics.a(this.a, c1224ds.a) && this.b == c1224ds.b && Intrinsics.a(this.c, c1224ds.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return this.c.hashCode() + (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
