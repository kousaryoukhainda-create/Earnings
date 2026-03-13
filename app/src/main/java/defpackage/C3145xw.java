package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: xw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3145xw {
    public final String a;

    public C3145xw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3145xw) && Intrinsics.a(this.a, ((C3145xw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.a + ')';
    }
}
